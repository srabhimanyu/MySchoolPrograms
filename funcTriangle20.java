import java.io.*;
public class funcTriangle20
{
	double area(double a,double b)
	{
     return 0.5*a*b;   
	}
	int area(int c,int d,int e)
	{
	    int s=(c+d+e)/2;
	    int h= (int)Math.sqrt(s*(s-c)*(s-d)*(s-e));
    return h;
	}
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter height of triangle ");
double f = Double.parseDouble(dd.readLine());
System.out.println("enter base of triangle ");
double g = Double.parseDouble(dd.readLine());
System.out.println("enter side1 of triangle ");
int h = Integer.parseInt(dd.readLine());
System.out.println("enter side2 of triangle ");
int i = Integer.parseInt(dd.readLine());
System.out.println("enter side3 of triangle ");
int j = Integer.parseInt(dd.readLine());
funcTriangle20 x= new funcTriangle20();
double y = x.area(f,g);
int z =x.area(h,i,j);
System.out.println("area1 = "+y);
System.out.println("area2 = "+z);
    }
}