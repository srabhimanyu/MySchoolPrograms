import java.io.*;
public class eencode
{ public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a string ");
String str=dd.readLine();
System.out.println("enter the value of gap ");
int gap = Integer.parseInt(dd.readLine());
String enc="";
int len=str.length();
gap=gap%26;
for(int i=0;i<len;i++)
{
char x=str.charAt(i);
x+=gap;
if(x>'z')
x-=26;
enc+=x;
    }
System.out.println(enc);
     }   }