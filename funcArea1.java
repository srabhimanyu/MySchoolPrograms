import java.io.*;
public class funcArea1
{
double  side1,side2,radius;
	funcArea1(double a,double b)
	{
	 side1=a;side2=b;
	}
	funcArea1(double r)
	{
	    radius=r;
	   }
	   double rectarea()
	   {
	       return side1*side2;
	   }
	   double circarea()
	   {
	       return 2*3.14*radius*radius;
	   }
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter first side");
double e = Double.parseDouble(dd.readLine());
System.out.println("enter second side");
double f = Double.parseDouble(dd.readLine());
System.out.println("enter radius");
double g = Double.parseDouble(dd.readLine());
funcArea1 x= new funcArea1(e,f);
funcArea1 y= new funcArea1(g);
double M = x.rectarea();
double m = y.circarea();
System.out.println("==============================================================");
System.out.println("==============================================================");
System.out.println("Area of rectangle =  "+M);
System.out.println("Area of circle =  "+m);
    }
}