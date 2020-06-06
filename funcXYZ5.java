import java.io.*;
public class funcXYZ5
{
	void theorm(double x)
	{
System.out.println("value of  f(x)="+(2.4*x*x+5.3*x-1.6));
	}
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter value of x");
double a = Double.parseDouble(dd.readLine());
funcXYZ5 b= new funcXYZ5();
b.theorm(a);
    }
}