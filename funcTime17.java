import java.io.*;
public class funcTime17
{
public int hr, min, sec;
	funcTime17(int x1,int x2,int x3)
	{
	hr=x1;
	min=x2;
	sec=x3;
	}
	void convert()
	{
	    double sec1=(hr*3600)+(min*60)+sec;
	    System.out.println("total time in sec  =>  "+sec1+"  sec");
}	
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter current Hr/min/sec");
System.out.println("enter current Hr");
int h =Integer.parseInt(dd.readLine());
System.out.println("enter current min");
int m =Integer.parseInt(dd.readLine());
System.out.println("enter current sec");
int s =Integer.parseInt(dd.readLine());
funcTime17 x= new funcTime17(h,m,s);
x.convert();
    }
}