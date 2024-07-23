//This file contains the Student class, which is used in Project9_flanders.java

public class Student {
    private String name;
    private int test1, test2, finalExam;//doAverage() must be called after any of these are modified
    private double average;

    //three constructors for the class
    public Student(){
        name = "";
        test1 = test2 = finalExam = 0;
        doAverage();
    }
    public Student(String name){
        this.name = name;
        test1 = test2 = finalExam = 0;
        doAverage();
    }
    public Student(String name, int test1, int test2, int finalExam){
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.finalExam = finalExam;
        doAverage();
    }

    /*overrides the default output when the function is printed and replaces it with
    the return value of this function*/
    @Override
    public String toString(){
        return String.format("%s has test grades %d, %d, and %d and an average of %.3f",
                name, test1, test2, finalExam, average);
    }

    //mutator methods
    public void setTest1(int t){
        test1 = t;
        doAverage();
    }
    public void setTest2(int t){
        test2 = t;
        doAverage();
    }
    public void setFinal(int FinalExam){
        this.finalExam = FinalExam;
        doAverage();
    }
    public void setGrades(int t1, int t2, int f){
        test1 = t1;
        test2 = t2;
        finalExam = f;
        doAverage();
    }
    public void setName(String name){
        this.name = name;
    }

    //accessor methods
    public int getTest1(){
        return test1;
    }
    public int getTest2(){
        return test2;
    }
    public int getFinal(){
        return finalExam;
    }
    public String getName(){
        return name;
    }
    public double getAverage(){
        return average;
    }

    /*updates average test score
    is supposed to be called whenever a test score is initialized or changed*/
    private void doAverage(){
        average = (test1 + test2 + finalExam)/3.0;
    }
}
