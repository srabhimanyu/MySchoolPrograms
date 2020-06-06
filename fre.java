import java.io.*;
import java.lang.*;
class fre
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int c=0,c1=0,count=0;
String str ="",comm="",t="";
System.out.println("Enter the string1");
str = br.readLine()+" ";

for(int i=0;i<=str.length()-1;i++)
{
char ch = str.charAt(i);

if(ch == ' ')
{

t = str.substring(c,i);
c=i+1;
if(comm.indexOf(t)==-1)
{
comm = comm+t+" ";
c1=0;
count=0;
for(int j=0;j<=str.length()-1;j++)
{
char ch1 = str.charAt(j);
if(ch1==' ')
{
String t1 = str.substring(c1,j);
c1 = j+1;
if(t.equals(t1))
count+=1;
}
}
System.out.println(t+" "+count);
}

}

}


}
}
/*
Enter the string1
india is my country
india 1
is 1
my 1
country 1
*/
