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
                rollNo = scan.next();
                batch.getStudentarray()[i] = new Student(rollNo);
                batch.getStudentarray()[i].setRollNo(rollNo);
            }
            catch (WrongRollNo e)
            {
                System.out.println("wrong here");
                i = i - 1;
                continue;
            }
//            batch.getStudentarray()[i].setRollNo(rollNo);
//            m = scan.nextInt();
//            for (int j = 0; j < m; j++)
//            {
//                courseCode = scan.next();
//                grade = scan.next();
//                batch.getStudentarray()[i].getCourse()[j] = new Course(courseCode, grade);
//            }
        }
    }
}
