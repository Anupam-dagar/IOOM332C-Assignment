package com.company.assignment4;

public class Course {
    private String course;
    private String grade;

    public Course ()
    {}

    public void setCourse(String course) throws WrongCourse
    {
        int flag1 = 0;
        int flag2 = 0;
        int flag3 = 0;
        int flag4 = 0;
        int flag5 = 0;
        int flag6 = 0;
        String strCopy = course.substring(1,4).toUpperCase();
        if (course.length() != 8)
        {
            throw new WrongCourse();
        }

        if (course.substring(0,1).equals("I") || course.substring(0,1).equals("E") || course.substring(0,1).equals("S") || course.substring(0,1).equals("M"))
        {
            flag1 = 1;
        }

        if (course.substring(1,4).equals(strCopy))
        {
            flag2 = 1;
        }

        if (Character.getNumericValue(course.charAt(4)) >= 1 || Character.getNumericValue(course.charAt(4)) <= 9)
        {
            flag3 = 1;
        }

        if (Character.getNumericValue(course.charAt(5)) >= 1 || Character.getNumericValue(course.charAt(5)) <= 4)
        {
            flag4 = 1;
        }

        if (Character.getNumericValue(course.charAt(6)) >= 1 || Character.getNumericValue(course.charAt(6)) <= 3)
        {
            flag5 = 1;
        }

        if (course.charAt(7) == 'C' || course.charAt(7) == 'E')
        {
            flag6 = 1;
        }

        if (flag1 == 0 || flag2 == 0 || flag3 == 0 || flag4 == 0 || flag5 == 0 || flag6 == 0)
        {
            throw new WrongCourse();
        }

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
