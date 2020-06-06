import java.io.*;
class Subsets
{
void recur(String s,String T,int n)
{
if(n==0)
{
System.out.println("{"+T+"}");
return;
}
for(int i=0;i<s.length();i++)
{

recur(s.substring(i+1),T+s.charAt(i),n-1);
}
}
public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any String ");
String s = br.readLine();
for(int i=0;i<=s.length();i++)
{

new Subsets().recur(s,"",i);
}
}

}
