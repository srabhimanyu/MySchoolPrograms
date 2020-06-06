import java.io.*;
public class conemployee
{
int c;
String n;
double b,h,d,p;
	conemployee()
	{
	 b=0.0;
	 h=0.0;
	 d=0.0;
	 p=0.0;
	 c=0;
	 n="";
	}
	conemployee(int x,String x2,int x3)
	{
	    b=x;
	    h=0.1*x;
	    d=0.15*x;
	    p=1000;
	    c=x3;
	    n=x2;
	   }
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter your salary");
System.out.println("enter your name");
System.out.println("enter your code no.");
int e = Integer.parseInt(dd.readLine());
String f= dd.readLine();
int g = Integer.parseInt(dd.readLine());
conemployee y=new conemployee(e,f,g);
double com = y.b+y.h+y.d+y.p;
System.out.println("==============================================================");
System.out.println("==============================================================");
System.out.println("your name is "+y.n);
System.out.println("your code no. is "+y.c);
System.out.println("your salary+commission = "+com);
    }
}