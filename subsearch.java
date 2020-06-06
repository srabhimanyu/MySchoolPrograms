import java.io.*;
class subsearch
{
public static void main(String args[])throws IOException
{
BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
int count=0;
String str="";
System.out.println("Enter the substring");
String sub = br1.readLine();
System.out.println("Enter the substring to be replaced");
String rep = br1.readLine();
System.out.println(countFre(str,sub,rep));
}
static String countFre(String str,String sub,String rep)
{
String Result ="";
int c=0;
while(str.length() >= sub.length())
{
if(str.substring(0,sub.length()).equals(sub))
{
Result = Result + rep;
str = str.substring(sub.length());
continue;
}
str = str.substring(1);
}
Result = Result + str;
return Result;
}
}
