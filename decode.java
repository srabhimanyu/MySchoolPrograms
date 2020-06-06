import java.io.*;
public class decode
{ public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the limit ");
String sen=dd.readLine(); 
StringBuffer ss=new StringBuffer(sen).reverse();
sen=ss.toString();
int c,a;
for (int i=0; i<sen.length();)
{
c=Integer.parseInt(sen.substring(i,i+1));
if((c>=65&&c<=90)||(c>=97&&c<=122)||(c==32))
a=1;
else
{c=Integer.parseInt(sen.substring(i,i+1));
a=0;}
System.out.print((char)c);
i=(a==1)?(i+2):(i+3);
} }}