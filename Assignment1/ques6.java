
import java.util.*;
import java.lang.*;
import java.io.*;

class Type00 {                  //class for type 00 type

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

class Type01 {             //class for type 01 type

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

class Type02 {             //class for type 02 type

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

class Student {           //class student

    private String roll_no;
    private String Name;
    private Type00 T0[];
    private Type01 T1[];
    private Type02 T2[];
    private int T0lim;
    private int T1lim;
    private int T2lim;
    //private String no_of_asignm;

    public Type00[] getT0() {
        return T0;
    }

    public Type01[] getT1() {
        return T1;
    }

    public Type02[] getT2() {
        return T2;
    }

    public void setT0lim(int j) {
        T0lim = j;
    }

    public void setT1lim(int k) {
        T1lim = k;
    }

    public void setT2lim(int l) {
        T2lim = l;
    }

    public int getT0lim() {
        return T0lim;
    }

    public int getT1lim() {
        return T1lim;
    }

    public int getT2lim() {
        return T2lim;
    }

    public String getroll_no() {
        return roll_no;
    }

    public String getName() {
        return Name;
    }

    Student(String roll_no, String Name) {
        this.roll_no = roll_no;
        this.Name = Name;

    }

    public void set(int no) {
        this.T0 = new Type00[no];
        this.T1 = new Type01[no];
        this.T2 = new Type02[no];
    }
}

class Batch {              //class Batch

    private Student S[];

    Batch(int n) {
        S = new Student[n];
    }

    public Student[] getBatch() {
        return S;
    }
}

class Toprint {               //class for the id and total that will get printed

    private String id;
    private int total;

    public String getid() {
        return id;
    }

    public int gettotal() {
        return total;
    }

    Toprint(String id, int total) {
        this.id = id;
        this.total = total;
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
                B.getBatch()[i] = new Student(roll_no, Name);  //initialising object student
            }
            for (int q = 0; q < m; q++) {
                int no = s.nextInt();
                B.getBatch()[q].set(no);
                int j = 0, k = 0, l = 0;
                Toprint T[] = new Toprint[no];
                for (int i = 0; i < no; i++) {
                    String id = s.next();
                    int type = s.nextInt();
                    if (type == 0) {
                        String name = s.next();
                        String Notes = s.next();
                        int total_marks = s.nextInt();
                        B.getBatch()[q].getT0()[j] = new Type00(id, name, Notes, total_marks);       //initialising  object
                        T[i] = new Toprint(id, B.getBatch()[q].getT0()[j].getTotal_Marks00());
                        j++;
                    } else if (type == 1) {
                        int correct = s.nextInt();
                        int wrong = s.nextInt();
                        int total = (correct * 4) - (wrong * 1);
                        B.getBatch()[q].getT1()[k] = new Type01(id, correct, wrong, total);      //initialising object
                        T[i] = new Toprint(id, B.getBatch()[q].getT1()[k].getTotal_Marks01());

                        k++;
                    } else if (type == 2) {
                        int tt = s.nextInt();
                        int tp = s.nextInt();
                        String lu = s.next();
                        int tm = s.nextInt();
                        B.getBatch()[q].getT2()[l] = new Type02(id, tt, tp, lu, tm);      //initialising object
                        T[i] = new Toprint(id, B.getBatch()[q].getT2()[l].getTotal_Marks02());

                        l++;
                    }

                }
                B.getBatch()[q].setT0lim(j);      //setting TO type assignments type with j size
                B.getBatch()[q].setT1lim(k);      //setting T1 type assignments type with k size
                B.getBatch()[q].setT2lim(l);      //setting T2 type assignments type with l size
            System.out.println(B.getBatch()[q].getName() + " " + B.getBatch()[q].getroll_no());
 int Grandtotal = 0;

                    int total1 = 0;
                    int total2 = 0;
                    int total0 = 0;
                   
                    for (int x = 0; x < B.getBatch()[q].getT0lim(); x++) {
                        total0 += B.getBatch()[q].getT0()[x].getTotal_Marks00();
                    }
                    for (int x = 0; x < B.getBatch()[q].getT1lim(); x++) {
                        total1 += B.getBatch()[q].getT1()[x].getTotal_Marks01();
                    }
                    for (int x = 0; x < B.getBatch()[q].getT2lim(); x++) {
                        total2 += B.getBatch()[q].getT2()[x].getTotal_Marks02();
                    }
                    Grandtotal = total0 + total1 + total2;
                System.out.println(Grandtotal);

                for (int i = 0; i < no; i++) {
                    System.out.println(T[i].getid()+ " " + T[i].gettotal());
                }
               
            }
        }
    }}
