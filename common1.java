import java.io.*;
import java.lang.*;
import java.util.*;
class common1
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int c=0,c1=0;
String str ="",str1="",comm="",t="";
System.out.println("Enter the string1");
str = br.readLine()+" ";
System.out.println("Enter the string2");
str1 = br.readLine()+" ";

for(int i=0;i<=str.length()-1;i++)
{
char ch = str.charAt(i);

if(ch == ' ')
{

t = str.substring(c,i);
c=i+1;

if(comm.indexOf(t)==-1)
{
c1=0;
for(int j=0;j<=str1.length()-1;j++)
{
char ch1 = str1.charAt(j);

if(ch1 == ' ')
{
String t1 = str1.substring(c1,j);
c1 = j+1;

if(t.equals(t1))
comm = comm + t1+" ";

}
}
}




}

}

System.out.println("The resultant string is");
System.out.println(comm);

}
}
/*
Enter the string1
india is my country
Enter the string2
india is my nation
The resultant string is
india is my
*/
