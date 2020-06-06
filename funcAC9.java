import java.io.*;
public class funcAC9
{
int ac_num;
String ac_name;
double  bal;
	funcAC9()
	{
	    ac_num=0;
        ac_name="";
        bal=0;
	}
 void getValues(int a,String b,double c)
	  {
	    ac_num=a;
        ac_name=b;
        bal=c;
	   }
   void deposit(double d)
	   {
	       bal+= d;
	   }
   void withdrawl(double e)
	   {
	       bal-= e;
	   }
	void display()
	   {
System.out.println("your ac no. is "+ac_num);
System.out.println("your name is "+ac_name);
System.out.println("now your accont balance is "+bal);
	   }
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter your ac no.");
int f = Integer.parseInt(dd.readLine());
System.out.println("enter your name");
String g = dd.readLine();
System.out.println("enter your current balance");
double h = Double.parseDouble(dd.readLine());
System.out.println("enter your deposit");
double i = Double.parseDouble(dd.readLine());
System.out.println("enter your withdrawl");
double j = Double.parseDouble(dd.readLine());
funcAC9 x= new funcAC9();
x.getValues(f,g,h);
x.deposit(i);
x.withdrawl(j);
System.out.println("your current status now is ");
x.display();
    }}