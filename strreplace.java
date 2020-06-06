import java.io.*;
class strreplace
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str = "",sub="",rep="",result="";
System.out.println("Enter the string");
str = br.readLine();
System.out.println("Enter the substring1");
sub = br.readLine();
System.out.println("Enter the substring2");
rep = br.readLine();
strreplace obj = new strreplace();
result = obj.replace(str,sub,rep,result);
System.out.println("The original string is \n"+str);
System.out.println("The resultant string is \n"+result);
}
String replace(String str,String sub,String rep,String result)
{
if(sub.length() > str.length())
{
result = result + str;
return result;
}
if(str.substring(0,sub.length()).equals(sub))
{
result = result + rep;
str = str.substring(sub.length());
return replace(str,sub,rep,result);
}
else
{
result = result + str.charAt(0);
str = str.substring(1);
return replace(str,sub,rep,result);
}
}
}
