import java.util.*;
 
class Undergraduate extends Student {
 
    private int Duration;
    private int CGPA;
    private int Credits;
    private String Department;
    private int grad;
 
    Undergraduate(String type, String roll, String name, String Department, int Duration, int CGPA, int Credits) {
        super(type, roll, name);
        this.Duration = Duration;
        this.CGPA = CGPA;
        this.Department = Department;
        this.Credits = Credits;
        this.grad = 0;
    }
 
    public int calGrad() {
        if ((this.Duration >= 4 && this.Duration <= 7) && this.Credits >= 185) {
            this.grad = 1;
        }
        return this.grad;
    }
 
    public String getDepartment() {
        return Department;
    }
 
    public int getDuration() {
        return Duration;
    }
 
    public int getCGPA() {
        return CGPA;
    }
 
    public int getCredits() {
        return Credits;
    }
 
    @Override
    public void display() {
        if (this.grad == 1) {
            System.out.println(super.getRoll() + " " + super.getname() + " " + super.gettype() + " " + this.Department + " " + this.CGPA);
        }
    }
}
 
class Postgraduate extends Student {
 
    private String Department;
    private String Specialization;
    private int Duration;
    private int CGPA;
    private int Credits;
    private String Thesis;
    private int grad;
 
    Postgraduate(String type, String roll, String name, String Department, String Specialisation, int Duration, int CGPA, int Credits, String thesis) {
        super(type, roll, name);
        this.Department = Department;
        this.CGPA = CGPA;
        this.Specialization = Specialisation;
        this.Duration = Duration;
        this.Credits = Credits;
        this.Thesis = thesis;
        this.grad = 0;
    }
 
    public int calGrad() {
        if ((this.Duration <= 4 && this.Duration >= 2) && this.Credits >= 80) {
            this.grad = 1;
        }
        return this.grad;
    }
 
    public String getDepartment() {
        return Department;
    }
 
    public String getSpecialization() {
        return Specialization;
    }
 
    public int getDuration() {
        return Duration;
    }
 
    public int getCGPA() {
        return CGPA;
    }
 
    public int getCredits() {
        return Credits;
    }
 
    public String getThesis() {
        return Thesis;
    }
 
    @Override
    public void display() {
        if (this.grad == 1) {
            System.out.println(super.getRoll() + " " + super.getname() + " " + super.gettype() + " " + this.Department + " " + this.Specialization + " " + this.CGPA);
        }
    }
}
 
class DualUGPG extends Student {
 
    private int Registration;
    private int CGPA;
    private int Credits;
    private String Thesis;
    private int Year;
    private String Specialization;
    private String Department;
    private int grad;
 
    public int calGrad() {
        if ((this.Registration <= 8 && this.Registration >= 5) && this.Credits >= 265) {
            this.grad = 1;
        }
        return this.grad;
    }
 
    DualUGPG(String type, String roll, String name, String Department, String sptn, int reg, int CGPA, int Credits, String Thesis, int Year) {
        super(type, roll, name);
        this.Registration = reg;
        this.CGPA = CGPA;
        this.Credits = Credits;
        this.Thesis = Thesis;
        this.Year = Year;
        this.Department = Department;
        this.Specialization = sptn;
        this.grad = 0;
    }
 
    public String getDepartment() {
        return Department;
    }
 
    public String getSpecialization() {
        return Specialization;
    }
 
    public int getRegistration() {
        return Registration;
    }
 
    public int getCGPA() {
        return CGPA;
    }
 
    public int getCredits() {
        return Credits;
    }
 
    public String getThesis() {
        return Thesis;
    }
 
    public int getYear() {
        return Year;
    }
 
    @Override
    public void display() {
        if (this.grad == 1) {
            System.out.println(super.getRoll() + " " + super.getname() + " " + super.gettype() + " " + this.Department + " " + this.Specialization + " " + this.CGPA);
        }
    }
}
 
class PhD extends Student {
 
    private int Credits;
    private String Thesis;
    private int postgraduation_year;
    private int grad;
 
    public int calGrad() {
        if ((this.postgraduation_year <= 6 && this.postgraduation_year >= 2) && this.Credits >= 64) {
            this.grad = 1;
        }
        return this.grad;
    }
 
    PhD(String type, String roll, String name, int year, int credits, String Thesis) {
        super(type, roll, name);
        this.Credits = credits;
        this.Thesis = Thesis;
        this.postgraduation_year = year;
        this.grad = 0;
    }
 
    public int getCredits() {
        return Credits;
    }
 
    public String getThesis() {
        return Thesis;
    }
 
    public int getpostgraduation_year() {
        return postgraduation_year;
    }
 
    @Override
    public void display() {
        if (this.grad == 1) {
            System.out.println(super.getRoll() + " " + super.getname() + " " + super.gettype());
        }
    }
}
 
class DualPGPhd extends Student {
 
    private int Duration;
    private int CGPA;
    private int Credits;
    private String Thesis;
    private int year;
    private int grad;
 
    public int calGrad() {
        if ((this.Duration <= 7 && this.Duration >= 4) && this.Credits >= 138) {
            this.grad = 1;
        }
        return this.grad;
    }
 
    DualPGPhd(String type, String roll, String name, int Duration, int CGPA, int Credits, String Thesis, int year) {
        super(type, roll, name);
        this.year = year;
        this.Duration = Duration;
        this.CGPA = CGPA;
        this.Credits = Credits;
        this.Thesis = Thesis;
        this.grad = 0;
    }
 
    public int getyear() {
        return year;
    }
 
    public int getDuration() {
        return Duration;
    }
 
    public int getCGPA() {
        return CGPA;
    }
 
    public int getCredits() {
        return Credits;
    }
 
    public String getThesis() {
        return Thesis;
    }
 
    @Override
    public void display() {
        if (this.grad == 1) {
            System.out.println(super.getRoll() + " " + super.getname() + " " + super.gettype() + " " + this.CGPA);
        }
    }
}
 
abstract class Student {
 
    private String Roll;
    private String name;
    private String type;
 
    public String getRoll() {
        return Roll;
    }
 
    public String getname() {
        return name;
    }
 
    public String gettype() {
        return type;
    }
 
    Student(String type, String Roll, String name) {
        this.Roll = Roll;
        this.name = name;
        this.type = type;
 
    }
 
    abstract public void display();
}
 
class main {
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
 
            int n = sc.nextInt();
            Student[] S = new Student[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                String type = sc.next();
                String roll = sc.next();
                String name = sc.next();
                if (type.equals("UG")) {
                    Undergraduate UG;
                    UG = new Undergraduate(type, roll, name, sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                    if (UG.calGrad() == 1) {
                        count++;
                    }
                    S[i] = UG;
                } else if (type.equals("PG")) {
                    Postgraduate PG;
                    PG = new Postgraduate(type, roll, name, sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next());
                    if (PG.calGrad() == 1) {
                        count++;
                    }
                    S[i] = PG;
                } else if (type.equals("UG+PG")) {
                    DualUGPG UGPG;
                    UGPG = new DualUGPG(type, roll, name, sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt());
                    if (UGPG.calGrad() == 1) {
                        count++;
                    }
                    S[i] = UGPG;
                } else if (type.equals("PhD")) {
                    PhD Phd;
                    Phd = new PhD(type, roll, name, sc.nextInt(), sc.nextInt(), sc.next());
                    if (Phd.calGrad() == 1) {
                        count++;
                    }
                    S[i] = Phd;
                } else if (type.equals("PG+PhD")) {
                    DualPGPhd PGPhd;
                    PGPhd = new DualPGPhd(type, roll, name, sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt());
                    if (PGPhd.calGrad() == 1) {
                        count++;
                    }
                    S[i] = PGPhd;
                }
 
            }
            System.out.println(count);
            for (int i = 0; i < n; i++) {
                S[i].display();
            }
 
        }
    }
}