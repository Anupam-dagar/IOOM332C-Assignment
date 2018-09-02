import java.util.*;
     
    class Assignment {   //class assignmnet 
        private String Assigmn_ID;
        private String Course_ID;
        private Date d = new Date(10,10,10);
        private int base_marks;
        private int diff_fact;
     
        Assignment(String Assigmn_ID, String Course_ID, Date d, int base_marks, int diff_fact) { //constructor
            this.Assigmn_ID = Assigmn_ID;
            this.Course_ID = Course_ID;
            this.d = d;
            this.base_marks = base_marks;
            this.diff_fact = diff_fact;
        }
     
        public Date getd() {
            return d;
        }
     
        public String getAssigmn_ID() {
            return Assigmn_ID;
        }
     
        public String getcourse_ID() {
            return Course_ID;
        }
     
        public int getdeadline_date() {
            return d.getdate();
        }
     
        public int getdeadline_month() {
            return d.getmonth();
        }
     
        public int getdeadline_year() {
            return d.getyear();
        }
     
        public int getdiff_fact() {
            return diff_fact;
        }
     
        public int getbase_marks() {
            return base_marks;
        }
    }
    class Date{      //class date
        private  int date;
        private int month;
        private int year;
        public Date(int date,int month,int year) //constructor
        {
            this.date=date;
            this.month=month;
            this.year=year;
        }
        public int getdate()
        {
            return date;
        }
        public int getmonth()
        {
            return month;
        }
        public int getyear()
        {
            return year;
        }
    }
    class Student {  //class Student
        private String roll_no;
        private String name;
        private int intel;
        private Assignment A[];
        private int Total[];
     
        public int[] gettotal()
        {
            return Total;
        }
        Student(String roll_no,String name,int intel)   //constructor
        {
            this.roll_no=roll_no;
            this.name=name;
            this.intel=intel;
        }
        public String getroll()
        {
            return roll_no;
        }
        public int getintel()
        {
            return intel;
        }
        public String getname()
        {
            return name;
        }
        public Assignment[] getA()
        {
            return A;
        }
        public void setA(int size){
            A = new Assignment[size];
        }
        public void sort(Assignment A[])    //to sort objject as per the date
        {
            Assignment temp;
            int one;
            int two;
            for(int i=0;i<A.length-1;i++)
            {
                for(int j=0;j<A.length-i-1;j++)
                {
                    if(A[j].getd().getyear()> A[j+1].getd().getyear() )
                    {
                        temp=A[j];
                        A[j]=A[j+1];
                        A[j+1]=temp;
                    }
                    else
                    {
                        if (A[j].getd().getyear()== A[j+1].getd().getyear()) {
                            if (A[j].getd().getmonth() > A[j+1].getd().getmonth()) {
                                temp = A[j];
                                A[j] = A[j+1];
                                A[j+1] = temp;
                            } else {
                                if (A[j].getd().getmonth()== A[j+1].getd().getmonth()) {
                                    if (A[j].getd().getdate() > A[j+1].getd().getdate()) {
                                        temp = A[j];
                                        A[j] = A[j+1];
                                        A[j+1] = temp;
                                    }
                                    else {
                                        if (A[j].getd().getdate()== A[j+1].getd().getdate()){
                                            if (A[j].getAssigmn_ID().charAt(0)>= 'A' && A[j+1].getAssigmn_ID().charAt(0)<= '9') {
                                                temp = A[j];
                                                A[j] = A[j+1];
                                                A[j+1] = temp;
                                            }
                                            else if (A[j].getAssigmn_ID().charAt(0)<= '9' && A[j+1].getAssigmn_ID().charAt(0)<= '9'){
                                                one = Integer.parseInt(A[j].getAssigmn_ID());
                                                two = Integer.parseInt(A[j+1].getAssigmn_ID());
                                                if (one > two){
                                                    temp = A[j];
                                                    A[j] = A[j+1];
                                                    A[j+1] = temp;
                                                }
                                            }
                                            else if (A[j].getAssigmn_ID().charAt(0)>= 'A' && A[j+1].getAssigmn_ID().charAt(0)>= 'A') {
                                                if (A[j].getAssigmn_ID().charAt(0)> A[j+1].getAssigmn_ID().charAt(0)){
                                                    temp = A[j];
                                                    A[j] = A[j+1];
                                                    A[j+1] = temp;
                                                }
                                                if (A[j].getAssigmn_ID().charAt(0)== A[j+1].getAssigmn_ID().charAt(0)){
                                                    one = Integer.parseInt(A[j].getAssigmn_ID().substring(1));
                                                    two = Integer.parseInt(A[j+1].getAssigmn_ID().substring(1));
                                                    if (one > two){
                                                        temp = A[j];
                                                        A[j] = A[j+1];
                                                        A[j+1] = temp;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    class Main
        {
            public static void main(String[] args)
            {
                Scanner s=new Scanner(System.in);
                int t=s.nextInt();
                while(t-->0)
                {
                    String roll_no= s.next();
                    String Name=s.next();
                    int intel=s.nextInt();
                    Student S=new Student(roll_no,Name,intel);       //initialising Student object
     
                    int no=s.nextInt();
                    S.setA(no);
                    for(int i=0;i<no;i++)
                    {
                        String id=s.next();
                        String c_id=s.next();
                        int date=s.nextInt();
                        int month=s.nextInt();
                        int year=s.nextInt();
                        int base_marks=s.nextInt();
                        int diff_factor=s.nextInt();
                        Date d = new Date(date,month,year);      //initialising date object
                        Assignment a = new Assignment(id,c_id,d,base_marks,diff_factor);  //initialising Assignment object
                        S.getA()[i] = a;
                     
                    }
                    System.out.println(S.getroll() + " " + S.getname());
                    S.sort(S.getA());
                    int total=0;
                    for(int i=0;i<no;i++) {
                        if (S.getA()[i].getdiff_fact() <= S.getintel()) {
                        	total+=S.getA()[i].getbase_marks()*S.getintel();
                            System.out.println(S.getA()[i].getAssigmn_ID() + " " + S.getA()[i].getcourse_ID() + " " + S.getA()[i].getbase_marks()*S.getintel());
                        }
                    }
                    System.out.println(total);
                }
            }
        }