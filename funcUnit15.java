import java.io.*;
public class funcUnit15
{
 double kg,g,km,m,l,ml;
	funcUnit15(double a,double b,double c)
	{
	 kg = a;
	 km = b;
	 l=c;
	}
	void convert()
	{
     g=kg*1000;
     m=km*1000;
     ml=l*1000;
     System.out.println(kg+"kg"+"="+g+"g");
     System.out.println(km+"km"+"="+m+"m");
     System.out.println(l+"l"+"="+ml+"ml");
}	
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("no. of kg");
double d = Double.parseDouble(dd.readLine());
System.out.println("no. of km");
double e = Double.parseDouble(dd.readLine());
System.out.println("no. of l");
double f = Double.parseDouble(dd.readLine());
funcUnit15 x= new funcUnit15(d,e,f);
x.convert();
    }
}