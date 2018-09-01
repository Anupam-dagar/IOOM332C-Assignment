import java.util.*;
 
        class Assignment {          //class Assignment
            private String Assigmn_ID;
            private String Course_ID;
            private Date d;
            private int base_marks;
            private int diff_fact;
 
            Assignment(String Assigmn_ID, String Course_ID, Date d, int base_marks, int diff_fact) {
                this.Assigmn_ID = Assigmn_ID;
                this.Course_ID = Course_ID;
                this.d = d;
                this.base_marks = base_marks;
                this.diff_fact = diff_fact;
            }
 
            public Date getd() {      //getter for Date object d
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
            public void setbase_marks(int n) {
                base_marks=n;
            }
        }
        class Date{             //class date
            private  int date;
            private int month;
            private int year;
            public Date(int date,int month,int year)
            {
                this.date=date;
                this.month=month;
                this.year=year;
            }
 
        Date(Date d)
        {
            this.date=d.date;
            this.month=d.month;
            this.year=d.year;
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
            Student(String roll_no,String name,int intel,int type)
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
            public void sort1(Assignment A[], int hTable[])   //sort for type 1
            {
                Assignment temp;
                int tmp;
                int one;
                int two;
                for(int i=0;i<A.length-1;i++)
                {
                    for(int j=0;j<A.length-i-1;j++)
                    {
                        if(A[j].getbase_marks()<A[j+1].getbase_marks())
                        {
                            temp=A[j];
                            A[j]=A[j+1];
                            A[j+1]=temp;
                            tmp = hTable[j];
                            hTable[j] = hTable[j+1];
                            hTable[j+1] = tmp;
                        }
                        else
                        {
                            if (A[j].getbase_marks()==A[j+1].getbase_marks()) {
                                if (A[j].getd().getmonth() > A[j+1].getd().getmonth()) {
                                    temp = A[j];
                                    A[j] = A[j+1];
                                    A[j+1] = temp;
                                    tmp = hTable[j];
                            		hTable[j] = hTable[j+1];
                            		hTable[j+1] = tmp;
                                } else {
                                    if (A[j].getd().getmonth()== A[j+1].getd().getmonth()) {
                                        if (A[j].getd().getdate() > A[j+1].getd().getdate()) {
                                            temp = A[j];
                                            A[j] = A[j+1];
                                            A[j+1] = temp;
                                            tmp = hTable[j];
                            				hTable[j] = hTable[j+1];
                            				hTable[j+1] = tmp;
                                        }
                                        else {
                                            if (A[j].getd().getdate()== A[j+1].getd().getdate()){
                                                if (A[j].getAssigmn_ID().charAt(0)>= 'A' && A[j+1].getAssigmn_ID().charAt(0)<= '9') {
                                                    temp = A[j];
                                                    A[j] = A[j+1];
                                                    A[j+1] = temp;
                                                    tmp = hTable[j];
                            						hTable[j] = hTable[j+1];
                            						hTable[j+1] = tmp;
                                                }
                                                else if (A[j].getAssigmn_ID().charAt(0)<= '9' && A[j+1].getAssigmn_ID().charAt(0)<= '9'){
                                                    one = Integer.parseInt(A[j].getAssigmn_ID());
                                                    two = Integer.parseInt(A[j+1].getAssigmn_ID());
                                                    if (one > two){
                                                        temp = A[j];
                                                        A[j] = A[j+1];
                                                        A[j+1] = temp;
                                                        tmp = hTable[j];
                            							hTable[j] = hTable[j+1];
                            							hTable[j+1] = tmp;
                                                    }
                                                }
                                                else if (A[j].getAssigmn_ID().charAt(0)>= 'A' && A[j+1].getAssigmn_ID().charAt(0)>= 'A') {
                                                    if (A[j].getAssigmn_ID().charAt(0)> A[j+1].getAssigmn_ID().charAt(0)){
                                                        temp = A[j];
                                                        A[j] = A[j+1];
                                                        A[j+1] = temp;
                                                        tmp = hTable[j];
                            							hTable[j] = hTable[j+1];
                            							hTable[j+1] = tmp;
                                                    }
                                                    if (A[j].getAssigmn_ID().charAt(0)== A[j+1].getAssigmn_ID().charAt(0)){
                                                        one = Integer.parseInt(A[j].getAssigmn_ID().substring(1));
                                                        two = Integer.parseInt(A[j+1].getAssigmn_ID().substring(1));
                                                        if (one > two){
                                                            temp = A[j];
                                                            A[j] = A[j+1];
                                                            A[j+1] = temp;
                                                            tmp = hTable[j];
                            								hTable[j] = hTable[j+1];
                            								hTable[j+1] = tmp;
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
            public void sort2(Assignment A[], int hTable[])   //sort for type 2
            {
                Assignment temp;
                int tmp;
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
                                                        tmp = hTable[j];
                            							hTable[j] = hTable[j+1];
                            							hTable[j+1] = tmp;
                                                    }
 
                         else if (A[j].getAssigmn_ID().charAt(0)>= 'A' && A[j+1].getAssigmn_ID().charAt(0)>= 'A') 
                         {
 
                             if (A[j].getAssigmn_ID().charAt(0)> A[j+1].getAssigmn_ID().charAt(0)){
 
                                            temp = A[j];
                                            A[j] = A[j+1];
                                            A[j+1] = temp;
 
                                            tmp = hTable[j];
                            				hTable[j] = hTable[j+1];
                            				hTable[j+1] = tmp;
 
                                            }
 
                             if (A[j].getAssigmn_ID().charAt(0)== A[j+1].getAssigmn_ID().charAt(0))
                             {
 
                                            one = Integer.parseInt(A[j].getAssigmn_ID().substring(1));
                                            two = Integer.parseInt(A[j+1].getAssigmn_ID().substring(1));
 
                                            if (one > two){
 
                                                temp = A[j];
                                                A[j] = A[j+1];
                                                 A[j+1] = temp;
                                                 tmp = hTable[j];
                            					hTable[j] = hTable[j+1];
                            					hTable[j+1] = tmp;
                                                        }
                              }
 
                            }
                    }
                }
 
          }
            }
 
 
            public void sort0(Assignment A[], int hTable[])             //sort for type 3
            {
                Assignment temp;
                int tmp;
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
                            tmp = hTable[j];
                            hTable[j] = hTable[j+1];
                            hTable[j+1] = tmp;
 
                        }
                        else
                        {
                            if (A[j].getd().getyear()== A[j+1].getd().getyear()) {
                                if (A[j].getd().getmonth() > A[j+1].getd().getmonth()) {
                                    temp = A[j];
                                    A[j] = A[j+1];
                                    A[j+1] = temp;
                                    tmp = hTable[j];
                            		hTable[j] = hTable[j+1];
                            		hTable[j+1] = tmp;
                                } else {
                                    if (A[j].getd().getmonth()== A[j+1].getd().getmonth()) {
                                        if (A[j].getd().getdate() > A[j+1].getd().getdate()) {
                                            temp = A[j];
                                            A[j] = A[j+1];
                                            A[j+1] = temp;
                                            tmp = hTable[j];
                            				hTable[j] = hTable[j+1];
                            				hTable[j+1] = tmp;
                                        }
                                        else {
                                            if (A[j].getd().getdate()== A[j+1].getd().getdate()){
                                                if (A[j].getAssigmn_ID().charAt(0)>= 'A' && A[j+1].getAssigmn_ID().charAt(0)<= '9') {
                                                    temp = A[j];
                                                    A[j] = A[j+1];
                                                    A[j+1] = temp;
                                                    tmp = hTable[j];
                            						hTable[j] = hTable[j+1];
                            						hTable[j+1] = tmp;
                                                }
                                                else if (A[j].getAssigmn_ID().charAt(0)<= '9' && A[j+1].getAssigmn_ID().charAt(0)<= '9'){
                                                    one = Integer.parseInt(A[j].getAssigmn_ID());
                                                    two = Integer.parseInt(A[j+1].getAssigmn_ID());
                                                    if (one > two){
                                                        temp = A[j];
                                                        A[j] = A[j+1];
                                                        A[j+1] = temp;
                                                        tmp = hTable[j];
                            							hTable[j] = hTable[j+1];
                            							hTable[j+1] = tmp;
                                                    }
                                                }
                                                else if (A[j].getAssigmn_ID().charAt(0)>= 'A' && A[j+1].getAssigmn_ID().charAt(0)>= 'A') {
                                                    if (A[j].getAssigmn_ID().charAt(0)> A[j+1].getAssigmn_ID().charAt(0)){
                                                        temp = A[j];
                                                        A[j] = A[j+1];
                                                        A[j+1] = temp;
                                                        tmp = hTable[j];
                            							hTable[j] = hTable[j+1];
                            							hTable[j+1] = tmp;
                                                    }
                                                    if (A[j].getAssigmn_ID().charAt(0)== A[j+1].getAssigmn_ID().charAt(0)){
                                                        one = Integer.parseInt(A[j].getAssigmn_ID().substring(1));
                                                        two = Integer.parseInt(A[j+1].getAssigmn_ID().substring(1));
                                                        if (one > two){
                                                            temp = A[j];
                                                            A[j] = A[j+1];
                                                            A[j+1] = temp;
                                                            tmp = hTable[j];
                            								hTable[j] = hTable[j+1];
                            								hTable[j+1] = tmp;
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
 
        class plagiarism           //class for checking plagiarism ,object having plag roll no.s
        {
        	private String roll, id;
        	plagiarism(String roll, String id)
        	{
        		this.roll = roll;
        		this.id = id;
        	}
 
        	String getroll()
        	{
        		return this.roll;
        	}
 
        	String getid()
        	{
        		return this.id;
        	}
        }
        class Main
            {
                public static void main(String[] args)
                {
                    Scanner s=new Scanner(System.in);
                    int t=s.nextInt();            //input
                    while(t-->0)
                    {
                        int m=s.nextInt();
                         Student S[]=new Student[m];
                        for(int i=0;i<m;i++)
                        {
                        String roll_no= s.next();           //input
                        String Name=s.next();           //input
                        int intel=s.nextInt();           //input
                        int type=s.nextInt();           //input
                        S[i]=new Student(roll_no,Name,intel,type);   //initialising object
                        }  			
                        int no=s.nextInt();           //input
                        for(int k=0;k<m;k++)
                        {
                        	S[k].setA(no);           //sets the assignment array with no;
                        }
                	for(int i=0;i<no;i++)
                          	{
                            	String id=s.next();           //input
                            	String c_id=s.next();           //input
                		        int date=s.nextInt();           //input
                            	 int month=s.nextInt();           //input
                              	 int year=s.nextInt();           //input
                            	 int base_marks=s.nextInt();           //input
                	             int diff_factor=s.nextInt();           //input
                            	 Date d = new Date(date,month,year);
                		for(int p=0;p<m;p++)
                            {
                                S[p].getA()[i] = new Assignment(id,c_id,d,base_marks,diff_factor);   //initialising object
                            }
 
                            }
 
                            int hTable[][] = new int[m][no];
                            for(int i = 0;i<m;i++)
                            {
                            	for(int j=0;j<no;j++)
                            		hTable[i][j] = 0;
                            }
 
                    int r=s.nextInt();
 
                    plagiarism p[] = new plagiarism[r];
                    for(int i=0;i<r;i++)
                    {
                        String roll=s.next();           //input
                        String Course_id=s.next();           //input
                        p[i] = new plagiarism(roll, Course_id);    //initialising object
                        for(int j=0;j<m;j++)
                        {
                            if(S[j].getroll().equals(roll))
                            {
                                for(int k=0;k<no;k++)
                                {
 
                                    if(S[j].getA()[k].getcourse_ID().equals(Course_id)){
 
                                    hTable[j][k] = 1;
 
                                    }
                                }
                            }
                        }
                    }
 
                        for(int k=0;k<m;k++)
                        {
                	System.out.println(S[k].getroll() + " " + S[k].getname());
                	if(S[k].gettype()==0) 
                    {
 
                        S[k].sort0(S[k].getA(), hTable[k]);          //sorting type 0 assignments
 
                    }
                    else if(S[k].gettype()==1)
                    {
                        S[k].sort1(S[k].getA(), hTable[k]);                //sorting type 1 assignments
                    }
                    else if(S[k].gettype()==2)
                    {
                        S[k].sort2(S[k].getA(), hTable[k]);          //sorting type 2 assignments
                    }
 
                	int total=0;
                	for(int i=0;i<no;i++) {
                            	if (S[k].getA()[i].getdiff_fact() <= S[k].getintel()) {
                            		if(hTable[k][i]==1)
                            		S[k].getA()[i].setbase_marks(0);
                            		total+=S[k].getA()[i].getbase_marks()*S[k].getintel();
 
                            	 System.out.println(S[k].getA()[i].getAssigmn_ID() + " " + S[k].getA()[i].getcourse_ID() + " " + S[k].getA()[i].getbase_marks()*S[k].getintel());
                            	}                      
                	 }
                	 System.out.println(total);
                        }
                    }
                }
            }