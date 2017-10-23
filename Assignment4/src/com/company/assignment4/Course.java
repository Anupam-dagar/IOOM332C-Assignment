package com.company.assignment4;

public class Course {
    private String course;
    private String grade;

    public Course (String course, String grade)
    {
        this.course = course;
        this.grade = grade;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public String getGrade() {
        return grade;
    }
}
