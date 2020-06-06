import java.io.*;
public class FracToDeci
{
static void recur(double f,int n)
{
	double f1=0.0,f2=0.0; String s="";

    f1=f*((int)Math.pow(10,n));

    if ((f1-(int)f1)==0.0)


    { System.out.println(f); return; }

    f2= (f1-(int)f1)*((int)Math.pow(10,n));

    if( ((int)f1==(int)f2) && ((int)f2!=0) )

	{	 while(((int)(f*10))==0){ s+="0"; f*=10;}

    System.out.println("0.("+s+(int)f2+")"); return;}

    if (n>30)

    { System.out.println("Non Sequence Found"); return; }

    recur(f,n+1);
}

public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("INPUT: ENTER A FRACTION");
            String str=dd.readLine();
            double a=Double.parseDouble(str.substring(0,str.indexOf("/")));
            double b=Double.parseDouble(str.substring(str.indexOf("/")+1));
            System.out.println(str+" = "+a/b);
            System.out.println("OUTPUT");
            recur((a/b),1);
   }
 }