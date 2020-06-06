import java.io.*;
public class funcTemp2
{
	double tempconvert(double a)
	{
	 double c = 5/9*(a-32);
	 return c;
	}
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter temp in fhernheit");
double f = Double.parseDouble(dd.readLine());
funcTemp2 x= new funcTemp2();
double b = x.tempconvert(f);
System.out.println("==============================================================");
System.out.println("Temp in celcius ="+b);
    }
}