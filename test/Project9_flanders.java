/*
The purpose of this program is to test the Student class from the Student.java file
Three student objects are created in order to test the three different Student constructors
The objects are initialized, several methods are called on each, and the results are printed
  to the screen
 */
public class Project9_flanders {

    public static void testMethods(Student student, String studentTitle){
        /*tests the accessor and toString methods of a student object by printing their outputs
        to the screen*/
        System.out.println(studentTitle+" is named "+student.getName()+".");
        System.out.println(studentTitle + " scored " + student.getTest1() + " on the first test.");
        System.out.println(studentTitle + " scored " + student.getTest2() + " on the second test.");
        System.out.println(studentTitle + " scored " + student.getFinal() + " on the final exam.");
        System.out.printf("%s averaged %.3f on the tests.%n", studentTitle, student.getAverage());
        System.out.println(student);
        System.out.println();
    }
    public static void main(String[] args){
        Student student1, student2, student3;

        //creates student Bob using the first constructor and then tests his methods
        student1 = new Student();
        student1.setName("Bob Stevens");
        student1.setTest1(89);
        student1.setTest2(92);
        student1.setFinal(93);
        testMethods(student1, "Student 1");

        //creates student James using the second contructor and then tests his methods
        student2 = new Student("James Kline");
        student2.setTest1(75);
        student2.setTest2(66);
        student2.setFinal(89);
        testMethods(student2,"Student 2");

        //creates student Nancy using the third constructor and then tests her methods
        student3 = new Student("Nancy Keen",94,97,100);
        student3.setTest1(95);
        testMethods(student3,"Student 3");
    }
}
