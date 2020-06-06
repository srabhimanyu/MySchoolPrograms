import java.io.*;
public class funcVolume3
{
	double volsphere(double a)
	{
	 return 4/3*3.14*a*a;
	}
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter radius");
double r = Double.parseDouble(dd.readLine());
funcVolume3 x= new funcVolume3();
double R = x.volsphere(r);
System.out.println("==============================================================");
System.out.println("volume of sphere ="+R);
    }
}