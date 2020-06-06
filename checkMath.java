import java.io.*;
public class checkMath
{
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
int n1=0;
do{
System.out.println("enter 1 for math.ceil() \n enter 2 for math.floor() \n enter 3 for math.rint() \n enter 4 for math.round()");
int n= Integer.parseInt(dd.readLine());
for(float i=1.8f ; i<=4.1f ; i+= 0.10f)
{
if(n==1)
System.out.println( i+" math.ceil() ==>  "+ Math.ceil(i));
if(n==2)
System.out.println( i+" math.floor() ==>  "+ Math.floor(i));
if(n==3)
System.out.println( i+" math.rint() ==> "+ Math.rint(i));
if(n==4)
System.out.println( i+" math.round() ==> "+ Math.round(i));
    }
    System.out.println("enter 0 to continue");
    n1= Integer.parseInt(dd.readLine());}
    while (n1==0);
}
    }