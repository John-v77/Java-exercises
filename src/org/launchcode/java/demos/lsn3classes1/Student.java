package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {


    private String name;
    private int studentId;
    private static int nextStudentId=1;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public  Student(String name, int studentId){ this(name, studentId, 0,0);}
    public  Student(String name){
        this(name, nextStudentId);
        nextStudentId++;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getStudentId() {
        return studentId;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args){
        Student JohnV = new Student("John", 1, 1, 4.0);
    }
}