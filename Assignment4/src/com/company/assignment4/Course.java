package com.company.assignment4;

public class Course {
    private String course;
    private String grade;
    private int courseCredits;
    private int gradeValue;
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
        if (course.length() != 8)
        {
            throw new WrongCourse();
        }
        String strCopy = course.substring(1,4).toUpperCase();
        if (course.substring(0,1).equals("I") || course.substring(0,1).equals("E") || course.substring(0,1).equals("S") || course.substring(0,1).equals("M"))
        {
            flag1 = 1;
        }

        if (course.substring(1,4).equals(strCopy))
        {
            flag2 = 1;
        }

        if (Integer.parseInt(course.substring(4,5)) >= 1 && Integer.parseInt(course.substring(4,5)) <= 9)
        {
            flag3 = 1;
        }

        if (Integer.parseInt(course.substring(5,6)) >= 1 && Integer.parseInt(course.substring(5,6)) <= 4)
        {
            flag4 = 1;
        }

        if (Integer.parseInt(course.substring(6,7)) >= 0 && Integer.parseInt(course.substring(6,7)) <= 3)
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
        courseCredits = Integer.parseInt(course.substring(5,6)) + Integer.parseInt(course.substring(6,7));
        this.course = course;
    }

    public void setGrade(String grade) throws WrongGrade {
        int flag = 0;
        if (grade.equals("A+") || grade.equals("A") || grade.equals("B+") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("E") || grade.equals("F") || grade.equals("I"))
        {
            flag = 1;
        }
        if (flag == 0)
        {
            throw new WrongGrade();
        }
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public String getGrade() {
        return grade;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    public void setGradeValue(String gradeArg){
        if (gradeArg.equals("A+"))
        {
            gradeValue = 10;
        }
        if (gradeArg.equals("A"))
        {
            gradeValue = 9;
        }
        if (gradeArg.equals("B+"))
        {
            gradeValue = 8;
        }
        if (gradeArg.equals("B"))
        {
            gradeValue = 7;
        }
        if (gradeArg.equals("C"))
        {
            gradeValue = 6;
        }
        if (gradeArg.equals("D"))
        {
            gradeValue = 5;
        }
        if (gradeArg.equals("E") || gradeArg.equals("F") || gradeArg.equals("I"))
        {
            gradeValue = 0;
        }
    }

    public int getGradeValue() {
        return gradeValue;
    }
}
