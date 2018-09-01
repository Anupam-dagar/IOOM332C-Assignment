    import java.util.*;
     
    class Assignment {
        private String Assigmn_ID;
        private String Course_ID;
        private Date d = new Date(10,10,10);
        private int base_marks;
        private int diff_fact;
     
        Assignment(String Assigmn_ID, String Course_ID, Date d, int base_marks, int diff_fact) {   //constructor
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
    class Date{
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
    class Student {
        private String roll_no;
        private String name;
        private int intel;
        private Assignment A[];
        private int Total[];
        private int type;
        
        
        public int gettype()
        {
            return type;
        }
        public int[] gettotal()
        {
            return Total;
        }
        Student(String roll_no,String name,int intel,int type) //constructor
        {
            this.roll_no=roll_no;
            this.name=name;
            this.intel=intel;
            this.type=type;
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
        public void sort1(Assignment A[])//for sort of type 1 asignments
        {
            Assignment temp;
            for(int i=0;i<A.length-1;i++)
            {
                for(int j=0;j<A.length-i-1;j++)
                {
                    if(A[j].getbase_marks()<A[j+1].getbase_marks())
                    {
                        temp=A[j];
                        A[j]=A[j+1];
                        A[j+1]=temp;
                    }
                }
            }
                
        }
        public void sort2(Assignment A[])    //for sort of type 2 asignments
        {
            Assignment temp;
             int one,two;
            for(int i=0;i<A.length-1;i++){
                for(int j=0;j<A.length-i-1;j++)
                {
                     if (A[j].getAssigmn_ID().charAt(0)<= '9' && A[j+1].getAssigmn_ID().charAt(0)<= '9'){
                                                one = Integer.parseInt(A[j].getAssigmn_ID());
                                                two = Integer.parseInt(A[j+1].getAssigmn_ID());
                                                if (one > two){
                                                    temp = A[j];
                                                    A[j] = A[j+1];
                                                    A[j+1] = temp;
                                                }
                                            
                     else if (A[j].getAssigmn_ID().charAt(0)>= 'A' && A[j+1].getAssigmn_ID().charAt(0)>= 'A') 
                     {
                              
                         if (A[j].getAssigmn_ID().charAt(0)> A[j+1].getAssigmn_ID().charAt(0)){
                                         
                                        temp = A[j];
                                        A[j] = A[j+1];
                                        A[j+1] = temp;
                                              
                                        }
                                               
                         if (A[j].getAssigmn_ID().charAt(0)== A[j+1].getAssigmn_ID().charAt(0))
                         {
                                        
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
            
                
        public void sort0(Assignment A[])//for sort of type 0 asignments
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
                    int m=s.nextInt();
                     Student S[]=new Student[m];
                    for(int i=0;i<m;i++)
                    {
                    String roll_no= s.next();
                    String Name=s.next();
                    int intel=s.nextInt();
                    int type=s.nextInt();
                    S[i]=new Student(roll_no,Name,intel,type);
                    }           
                    int no=s.nextInt();
                    for(int k=0;k<m;k++)
                    {
                        S[k].setA(no);
                    }
                for(int i=0;i<no;i++)
                        {
                            String id=s.next();
                            String c_id=s.next();
                     int date=s.nextInt();
                             int month=s.nextInt();
                             int year=s.nextInt();
                             int base_marks=s.nextInt();
                             int diff_factor=s.nextInt();
                             Date d = new Date(date,month,year);
                     Assignment a = new Assignment(id,c_id,d,base_marks,diff_factor);
                    for(int p=0;p<m;p++)
                        {
                            S[p].getA()[i] = a;
                        }
                     
                        }
                    
                    for(int k=0;k<m;k++)
                    {
                System.out.println(S[k].getroll() + " " + S[k].getname());
                if(S[k].gettype()==0) 
                {

                    S[k].sort0(S[k].getA());

                }
                else if(S[k].gettype()==1)
                {
                    S[k].sort1(S[k].getA());
                }
                else if(S[k].gettype()==2)
                {
                    S[k].sort2(S[k].getA());
                }
                                     
                int total=0;
                for(int i=0;i<no;i++) {
                            if (S[k].getA()[i].getdiff_fact() <= S[k].getintel()) {
                                total+=S[k].getA()[i].getbase_marks()*S[k].getintel();
                                
                             System.out.println(S[k].getA()[i].getAssigmn_ID() + " " + S[k].getA()[i].getcourse_ID() + " " + S[k].getA()[i].getbase_marks()*S[k].getintel());
                            }                      
                 }
                 System.out.println(total);
                    }
                }
            }
        }