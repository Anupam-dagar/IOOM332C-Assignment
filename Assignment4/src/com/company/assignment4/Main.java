package com.company.assignment4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String rollNo = "";
        int m;
        String courseCode;
        String grade;
        Batch batch = new Batch(n);
        for (int i = 0; i < n; i++)
        {
            try
            {
                System.out.println("enter roll no");
                rollNo = scan.next();
                batch.getStudentarray()[i] = new Student();
                batch.getStudentarray()[i].setRollNo(rollNo);
            }
            catch (WrongRollNo e)
            {
                System.out.println("Incorrect Roll Number");
                i = i - 1;
                continue;
            }
            m = scan.nextInt();
            batch.getStudentarray()[i].setCourseSize(m);
            for (int j = 0; j < m; j++)
            {
                try
                {
                    System.out.println("enter course code");
                    courseCode = scan.next();
                    batch.getStudentarray()[i].getCourse()[j] = new Course();
                    batch.getStudentarray()[i].getCourse()[j].setCourse(courseCode);
                    int flagGrade = 1;
                    while (flagGrade == 1)
                    {
                        try
                        {
                            System.out.println("enter grade");
                            grade = scan.next();
                            batch.getStudentarray()[i].getCourse()[j].setGrade(grade);
                            flagGrade = 0;
                        }
                        catch (WrongGrade e)
                        {
                            System.out.println("Illegal Grade");
                        }
                    }
                }
                catch (WrongCourse e)
                {
                    System.out.println("Wrong Course Code");
                    j = j - 1;
                    continue;
                }

            }
        }
    }
}
