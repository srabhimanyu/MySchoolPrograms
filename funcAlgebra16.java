import java.io.*;
public class funcAlgebra16
{
	double ex(double a,double b)
	{
    double f1 = a*a+2*a+4;
    double f2 = -b*b-20*b-1;
    double f3 = f1-f2;
    return f3;
	}
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter value of x");
double x = Double.parseDouble(dd.readLine());
System.out.println("enter value of y");
double y = Double.parseDouble(dd.readLine());
funcAlgebra16 c= new funcAlgebra16();
double d = c.ex(x,y);
System.out.println("value of f3(x,y) ="+d);
    }
}