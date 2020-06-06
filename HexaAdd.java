import java.io.*;
class HexaAdd
{
public static void main(String args[])throws IOException
{
String str="",str1="",p="0123456789ABCDEF",R="";
int c=0,m=0;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the first Number");
str = br.readLine();

System.out.println("Enter the second Number");
str1 = br.readLine();

while(str.length() != str1.length())
{
if(str.length() > str1.length())
str1 = "0"+str1;
if(str1.length() < str.length())
str = "0"+str;
}

str="0"+str;
str1="0"+str1;

for(int i=str.length()-1;i>=0;i--)
{

m = c + p.indexOf(str.charAt(i)) + p.indexOf(str1.charAt(i));

R = p.charAt(m%16) + R;

c = m / 16;

}

System.out.println("The Addition is "+R);

}
}
