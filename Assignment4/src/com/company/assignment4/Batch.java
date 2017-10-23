package com.company.assignment4;
//Batch class definition
public class Batch {
    //variable declaration
    private Student[] studentarray;

    //batch class constructor
    public Batch (int studentArraySizeArg) {
        studentarray = new Student[studentArraySizeArg];
    }

    //setter function to set studentarray size
    public void setStudentarray(int studentArraySize) {
        studentarray = new Student[studentArraySize];
    }

    //getter function to get studentarray
    public Student[] getStudentarray() {
        return studentarray;
    }
}
