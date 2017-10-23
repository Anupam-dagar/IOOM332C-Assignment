package com.company.assignment4;

public class Student {
    private String rollNo;
    private Course[] course;

    public Student (String rollNo, int numberCourses)
    {
        this.rollNo = rollNo;
        course = new Course[numberCourses];
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setCourse(int numberOfCourses) {
        course = new Course[numberOfCourses];
    }

    public Course[] getCourse() {
        return course;
    }
}
