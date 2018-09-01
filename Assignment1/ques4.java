
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Type00{   //For type 0 Assignmnets
    private String Name;
    private String id00;
    private String Notes;
    private int Total_marks00;
    private static int count;
 
    public String getname()
    {
        return Name;
    }
    public String getNotes()
    {
        return Notes;
    }
    public String getid00()
    {
        return id00;
    }
    public int getTotal_Marks00()
    {
        return Total_marks00;
    }
    Type00(String id00,String name,String Notes,int Total_marks)
    {
        this.Name=name;
        this.Notes=Notes;
        this.Total_marks00=Total_marks;
        this.id00=id00;
        count = 0;
    }
 
    static void setCount(int c)
    {
        count = c;
    }
}
class Type01{  //For type 2 Assignmnets
    private String id01;
    private int Correct;
    private int Wrong;
    private int Total_marks01;
    private static int count1;
    public int getCorrect()
    {
        return Correct;
    }
    public int getWrong()
    {
        return Wrong;
    }
    public String getid01()
    {
        return id01;
    }
    public int getTotal_Marks01()
    {
        Total_marks01 = this.Correct*4 - this.Wrong;
        return Total_marks01;
    }
    Type01(String id01,int Correct,int Wrong,int total)
    {
        this.Correct=Correct;
        this.Wrong=Wrong;
        this.id01=id01;
        count1=0;
    }
    static void getCount1(int c)
    {
        count1=c;
    }
}
class Type02{      //For Type 2 Assignmnets
    private String id02;
    private int Total_time;
    private int total_penalty;
    private String lang_used;
    private int Total_marks02;
    static int Count2;
 
    public int gettotal_time()
    {
        return Total_time;
    }
    public int gettotal_penalty()
    {
        return total_penalty;
    }
    public String getlang_used()
    {
        return lang_used;
    }
    public int getTotal_marks02()
    {
        return Total_marks02;
    }
    public String getid02()
    {
        return id02;
    }
    public int getTotal_Marks02()
    {
        return Total_marks02;
    }
    Type02(String id02,int tt,int tp,String lu,int tm)
    {
        this.Total_time=tt;
        this.total_penalty=tp;
        this.lang_used=lu;
        this.Total_marks02=tm;
        this.id02=id02;
        Count2=0;
        Total_marks02 -= this.total_penalty;
    }
    static void getcount2(int c)
    {
        Count2=c;
    }
}
 
class Student {
    private String roll_no;
    private String Name;
    //private String no_of_asignm;
 
    public String getroll_no()
    {
        return roll_no;
    }
    public String getName()
    {
        return Name;
    }
    Student(String roll_no,String Name)
    {
        this.roll_no=roll_no;
        this.Name=Name;
 
    }
}
class Main
{
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            String Name=s.next();
            String roll_no=s.next();
 
            int no=s.nextInt();     //number of assignments
            Student S=new Student(roll_no,Name);
 
                Type00 T0[] = new Type00[no];
                Type01 T1[] = new Type01[no];
                Type02 T2[] = new Type02[no];
            int j=0,k=0,l=0;
            for(int i=0;i<no;i++)
            {
              String id=s.next();
              int type =s.nextInt();
              if(type==0)
              {
                  String name=s.next();    //input
                  String Notes=s.next();   //input
                  int total_marks=s.nextInt();   //input
                   T0[j]=new Type00(id,name,Notes,total_marks);
                  j++;
              }
              else if (type==1)
              {
                  int correct=s.nextInt();   //input
                  int wrong=s.nextInt();   //input
                  int total=(correct*4)-(wrong*1);   //input
                   T1[k]=new Type01(id,correct,wrong,total);
                  k++;
              }
              else if(type==2)
              {
                  int tt=s.nextInt();   //input
                  int tp=s.nextInt();   //input
                  String lu=s.next();   //input
                  int tm=s.nextInt();   //input
                  T2[l]=new Type02(id,tt,tp,lu,tm);
                  l++;
              }
            }
            System.out.println(S.getName() + " " + S.getroll_no());
 
            int total1=0;
            int total2=0;
            int total0=0;
 
             for (int x = 0; x < j; x++) {
                System.out.println(T0[x].getid00() + " " + T0[x].getTotal_Marks00()); //printing Type 0 Assignmnets of student object S
                total0+=T0[x].getTotal_Marks00();
            }
             
            System.out.println(total0); //printing total
             
            for(int x=0;  x< k; x++)
            {
                System.out.println(T1[x].getid01() + " " + T1[x].getTotal_Marks01());//printing Type 1 Assignmnets of student object S
                total1+=T1[x].getTotal_Marks01();
 
            }
            
            System.out.println(total1);//printing total
            
            for(int x=0;  x < l; x++)
            {
                System.out.println(T2[x].getid02() + " " + T2[x].getTotal_Marks02());//printing Type 2 Assignmnets of student object S
                total2+=T2[x].getTotal_Marks02();
            }
            
            System.out.println(total2);//printing total
        }  
 
    }
}
