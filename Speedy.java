package advancement;
import java.util.*;
public class Speedy
{ 
public static void uniComb(String al)
	{
System.out.println("***********************all combinations******************* ");
int i,j,c,t,y,v=2,c1=1;
	int n= al.length();
int  a[]=new int[n], b[]=new int[n], p=(int)Math.pow(10,n-1);
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
s+=al.charAt((y%10)-1);
y/=10;
    }
System.out.println(s);
}}
System.out.println("\n"+"******************all combinations printed ***************** ");
	    
	}
public static void palindrome(String s)
{ StringBuffer ss=new StringBuffer(s).reverse();
   System.out.println(s+" is Palindrome ===>"+ (s.equals(ss.toString())));
}

}
