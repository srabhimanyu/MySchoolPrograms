import java.io.*;
public class comission
{
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
int n;
double c=0.0, C=0.0;
System.out.println("enter salary");
n = Integer.parseInt(dd.readLine());
c=(n>25000)?(n*0.25):((n>15000)?(n*0.185):((n>10000)?(n*0.125):(n*0.08)))+((c>200)?(200):0)+200;
System.out.println("salary = "+ n +"     value of c =  "+c);
    }
}