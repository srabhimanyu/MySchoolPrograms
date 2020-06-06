import java.io.*;
public class funcNewton14
{
	double displacement(double a,double b,double c)
	{
	 return a*b+0.5*c*b*b;
	}
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter initial velocity ");
double u = Double.parseDouble(dd.readLine());
System.out.println("enter time");
double t = Double.parseDouble(dd.readLine());
System.out.println("enter accleration");
double A = Double.parseDouble(dd.readLine());
funcNewton14 x= new funcNewton14();
double s = x.displacement(u,t,A);
System.out.println("total displacement = "+s);
    }
}