

import java.util.*;
import java.lang.*;
import java.io.*;

class Type00 {       //for type 00 Asignments

    private String Name;
    private String id00;
    private String Notes;
    private int Total_marks00;
    private static int count;

    public String getname() {
        return Name;
    }

    public String getNotes() {
        return Notes;
    }

    public String getid00() {
        return id00;
    }

    public int getTotal_Marks00() {
        return Total_marks00;
    }

    Type00(String id00, String name, String Notes, int Total_marks) {
        this.Name = name;
        this.Notes = Notes;
        this.Total_marks00 = Total_marks;
        this.id00 = id00;
        count = 0;
    }

    static void setCount(int c) {
        count = c;
    }
}

class Type01 {       //for type 01 Asignments

    private String id01;
    private int Correct;
    private int Wrong;
    private int Total_marks01;
    private static int count1;

    public int getCorrect() {
        return Correct;
    }

    public int getWrong() {
        return Wrong;
    }

    public String getid01() {
        return id01;
    }

    public int getTotal_Marks01() {
        Total_marks01 = this.Correct * 4 - this.Wrong;
        return Total_marks01;
    }

    Type01(String id01, int Correct, int Wrong, int total) {
        this.Correct = Correct;
        this.Wrong = Wrong;
        this.id01 = id01;
        count1 = 0;
    }

    static void getCount1(int c) {
        count1 = c;
    }
}

class Type02 {       //for type 02 Asignments

    private String id02;
    private int Total_time;
    private int total_penalty;
    private String lang_used;
    private int Total_marks02;
    static int Count2;

    public int gettotal_time() {
        return Total_time;
    }

    public int gettotal_penalty() {
        return total_penalty;
    }

    public String getlang_used() {
        return lang_used;
    }

    public int getTotal_marks02() {
        return Total_marks02;
    }

    public String getid02() {
        return id02;
    }

    public int getTotal_Marks02() {
        return Total_marks02;
    }

    Type02(String id02, int tt, int tp, String lu, int tm) {
        this.Total_time = tt;
        this.total_penalty = tp;
        this.lang_used = lu;
        this.Total_marks02 = tm;
        this.id02 = id02;
        Count2 = 0;
        Total_marks02 -= this.total_penalty;
    }

    static void getcount2(int c) {
        Count2 = c;
    }
}

class Student {         //for class Student

    private String roll_no;
    private String Name;
    private Type00 T0[];
    private Type01 T1[];
    private Type02 T2[];
    private int T0lim;
    private int T1lim;
    private int T2lim;

    public Type00[] getT0() {
        return T0;
    }

    public Type01[] getT1() {
        return T1;
    }

    public Type02[] getT2() {
        return T2;
    }
    public void setT0lim(int j)
     {
     T0lim=j;           
     }
    public void setT1lim(int k)
     {
      T1lim=k;           
     }  
    public void setT2lim(int l)
     {
     T2lim=l;           
     }
    public int getT0lim()
    {
        return T0lim;
    }
    public int getT1lim()
    {
        return T1lim;
    }
    public int getT2lim()
    {
        return T2lim;
    }
    
    public String getroll_no() {
        return roll_no;
    }

    public String getName() {
        return Name;
    }

    Student(String roll_no, String Name) {   //constructor
        this.roll_no = roll_no;
        this.Name = Name;

    }

    public void set(int no) {
        this.T0 = new Type00[no];
        this.T1 = new Type01[no];
        this.T2 = new Type02[no];
    }
}

class Batch {          //class Batch having an array of students

    private Student S[];

    Batch(int n) {
        S = new Student[n];
    }

    public Student[] getBatch() {
        return S;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int m = s.nextInt();
            Batch B = new Batch(m);
            for (int i = 0; i < m; i++) {
                String Name = s.next();
                String roll_no = s.next();
                B.getBatch()[i] = new Student(roll_no, Name);  //initialising array(batch) of object Students
            }
         
//number of assignments 
            for (int q = 0; q < m; q++) {
                int no = s.nextInt();
                B.getBatch()[q].set(no);
                int j = 0, k = 0, l = 0;
                for (int i = 0; i < no; i++) {
                    String id = s.next();
                    int type = s.nextInt();
                    if (type == 0) {
                        String name = s.next();
                        String Notes = s.next();
                        int total_marks = s.nextInt();
                        B.getBatch()[q].getT0()[j] = new Type00(id, name, Notes, total_marks);  //initilaising
                        j++;
                    } else if (type == 1) {
                        int correct = s.nextInt();
                        int wrong = s.nextInt();
                        int total = (correct * 4) - (wrong * 1);
                        B.getBatch()[q].getT1()[k] = new Type01(id, correct, wrong, total);  //initilaising
                        k++;
                    } else if (type == 2) {
                        int tt = s.nextInt();
                        int tp = s.nextInt();
                        String lu = s.next();
                        int tm = s.nextInt();
                        B.getBatch()[q].getT2()[l] = new Type02(id, tt, tp, lu, tm);  //initilaising
                        l++;
                    }
                }
                B.getBatch()[q].setT0lim(j);
                B.getBatch()[q].setT1lim(k);
                B.getBatch()[q].setT2lim(l);
            }
            for (int i = 0; i < m; i++) {
                System.out.println(B.getBatch()[i].getName() + " " + B.getBatch()[i].getroll_no());

                int total1 = 0;
                int total2 = 0;
                int total0 = 0;

                for (int x = 0; x < B.getBatch()[i].getT0lim(); x++) {
                    System.out.println(B.getBatch()[i].getT0()[x].getid00() + " " + B.getBatch()[i].getT0()[x].getTotal_Marks00());
                    total0 += B.getBatch()[i].getT0()[x].getTotal_Marks00();
                }

                System.out.println(total0);

                for (int x = 0; x < B.getBatch()[i].getT1lim(); x++) {
                    System.out.println(B.getBatch()[i].getT1()[x].getid01() + " " + B.getBatch()[i].getT1()[x].getTotal_Marks01());
                    total1 += B.getBatch()[i].getT1()[x].getTotal_Marks01();

                }

                System.out.println(total1);

                for (int x = 0; x < B.getBatch()[i].getT2lim(); x++) {
                    System.out.println(B.getBatch()[i].getT2()[x].getid02() + " " + B.getBatch()[i].getT2()[x].getTotal_Marks02());
                    total2 += B.getBatch()[i].getT2()[x].getTotal_Marks02();
                }

                System.out.println(total2);
            }
        }
    }
}
