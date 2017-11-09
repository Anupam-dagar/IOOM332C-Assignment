package com.company.assignment4;

public class Student {
    private String rollNo;
    private Course[] course;

    public Student ()
    {}

    public Student (String rollNo, int numberCourses)
    {
        this.rollNo = rollNo;
        course = new Course[numberCourses];
    }

    public void setRollNo(String rollNo) throws WrongRollNo {
        int flag = 0;
        int flag2 = 0;
        int flag3 = 0;

        if (rollNo.length() != 10)
        {
            throw new WrongRollNo();
        }

        if (rollNo.substring(0,3).equals("IIT") || rollNo.substring(0,3).equals("LIT") || rollNo.substring(0,3).equals("ITM") || rollNo.substring(0,3).equals("BIM") || rollNo.substring(0,3).equals("ICM") || rollNo.substring(0,3).equals("ISM") || rollNo.substring(0,3).equals("IIM") || rollNo.substring(0,3).equals("IHM") || rollNo.substring(0,3).equals("IRM") || rollNo.substring(0,3).equals("IWM"))
        {
            flag = 1;
        }

        if (rollNo.substring(3,7).compareTo("2013") == 0 || rollNo.substring(3,7).compareTo("2014") == 0 || rollNo.substring(3,7).compareTo("2015") == 0 || rollNo.substring(3,7).compareTo("2016") == 0)
        {
            flag2 = 1;
        }

        if (Integer.parseInt(rollNo.substring(7,10)) > 0 && Integer.parseInt(rollNo.substring(7,10)) <= 199)
        {
            flag3 = 1;
        }

        if (flag == 0 || flag2 == 0 || flag3 == 0)
        {
            throw new WrongRollNo();
        }

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
