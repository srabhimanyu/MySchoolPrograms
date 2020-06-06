import java.io.*;
public class lcm
{
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a no. to print Lcm ");
int l =Integer.parseInt(dd.readLine());
int s=Integer.parseInt(dd.readLine());
for (int w=1;;w++)
{ if(w%l==0&&w%s==0){
System.out.println("LCM of "+l+"&"+s+" =  "+w);
break;
    }}
}}