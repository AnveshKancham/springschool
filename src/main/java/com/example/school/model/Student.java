// Write your code here
package com.example.school.model;

public class Student {
    private int studentId;
    private String studentName;
    private String gender;
    private int standard;

    public Student(int studentId, String studentName, String gender, int standard) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.standard = standard;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getstudentName() {
        return studentName;
    }

    public void setstudentName(int studentName) {
        this.studentName = studentName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getGender() {
        return gender;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
}