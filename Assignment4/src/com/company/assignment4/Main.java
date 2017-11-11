package com.company.assignment4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String rollNo = "";
        int m;
        int t;
        int rollFlag;
        float[] cgArray = new float[n];
        String courseCode;
        String grade;
        Batch batch = new Batch(n);
        for (int i = 0; i < n; i++)
        {
            try
            {
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
                    courseCode = scan.next();
                    batch.getStudentarray()[i].getCourse()[j] = new Course();
                    batch.getStudentarray()[i].getCourse()[j].setCourse(courseCode);
                }
                catch (WrongCourse e)
                {
                    System.out.println("Wrong Course Code");
                    j = j - 1;
                    continue;
                }
                int flagGrade = 1;
                while (flagGrade == 1)
                {
                    try
                    {
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
            batch.getStudentarray()[i].setCgpa();
            cgArray[i] = batch.getStudentarray()[i].getCgpa();
        }
        t = scan.nextInt();
        for (int i = 0; i < t; i++)
        {
            rollFlag = 0;
            rollNo = scan.next();
            for (int j = 0; j < n; j++)
            {
                if (rollNo.equals(batch.getStudentarray()[j].getRollNo()))
                {
                    rollFlag = 1;
                    System.out.printf("%.1f\n",cgArray[j]);
                    break;
                }
            }
            if (rollFlag == 0)
            {
                System.out.println("Roll Number not found");
            }
        }
    }
}
