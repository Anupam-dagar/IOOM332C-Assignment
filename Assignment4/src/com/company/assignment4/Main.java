package com.company.assignment4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String rollNo;
        int m;
        String courseCode;
        String grade;
        Batch batch = new Batch(n);
        for (int i = 0; i < n; i++)
        {
            try
            {
                rollNo = scan.next();
            }
            catch ()
            {

            }
            batch.getStudentarray()[i].setRollNo(rollNo);
            m = scan.nextInt();
            for (int j = 0; j < m; j++)
            {
                courseCode = scan.next();
                grade = scan.next();
                batch.getStudentarray()[i].getCourse()[j] = new Course(courseCode, grade);
            }
        }
    }
}
