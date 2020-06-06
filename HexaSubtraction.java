
/*
Note: in this program wherever <' appears kindly replace it by <
*/


import java.io.*;
class HexaSubtraction
{

static int compare(String s, String s1)
{
for(int i=0;i<=s.length()-1;i++)
{
if(s.charAt(i) > s1.charAt(i))
return 1;
if(s.charAt(i) < s1.charAt(i))
return -1;
}
return 0;
}
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the First No");
String str = br.readLine();
System.out.println("Enter the second No.");
String str1 = br.readLine();
String v = "0123456789ABCDEF";
while(str.length() != str1.length())
{
if(str.length() > str1.length())
str1 = "0"+str1;

if(str.length() < str1.length())
str = "0"+str;
}
int c = compare(str,str1);
System.out.println(c);

if(c<0)
{
String t = str;
str = str1;
str1 = t;
}
int m=0;

String R="";

for(int i=str.length()-1;i>=0;i--)
{
if( ( c+v.indexOf(str.charAt(i)) )==0 )
{
m = (16 + v.indexOf(str.charAt(i))) - v.indexOf(str1.charAt(i));
c=-1;
}
else
{
m = c + v.indexOf(str.charAt(i)) - v.indexOf(str1.charAt(i));
c=0;
}
R = v.charAt(m) + R;
}

System.out.println("The result is "+R);
}

}


