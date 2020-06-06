import java.util.*;
import java.io.*;
public class universalCombinations
{
public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the word/number ");
String a1=dd.readLine();
System.out.println("***********************all combinations******************* ");
int n= a1.length();
int  a[]=new int[n] , b[]=new int[n],i,j, p=(int)Math.pow(10,n-1),c,t,y,v=2,c1=1;
String s="";
for(i=1;i<=n;i++)
{c1*=i+1;
  a[i-1]=i;  }
Arrays.sort(a);
for(i=p;i<(p*10);i++)
{ j=i;
    t=0;
       c=0;
   while(j!=0)
   {  b[t]=j%10;
       j/=10;
       t++;
    }
    Arrays.sort(b);
for(j=0;j<n;j++)
    { if(a[j]!=b[j])
        {c++;break;}
    }
if(c==0){ s="";
y=i;
while(y!=0){
s+=a1.charAt((y%10)-1);
y/=10;
    }
System.out.println(s);
}}
System.out.println("\n"+"******************all combinations printed ***************** ");

}}