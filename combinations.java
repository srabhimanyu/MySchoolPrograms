import java.io.*;
class combinations
{

static void perm(String s,String T,int N)
{
if(N==0)
{
System.out.println(T);
return;
}
for(int i=0;i<=s.length()-1;i++)
perm(s.substring(0,i)+s.substring(i+1),T+s.charAt(i),N-1);
}

public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
String str = br.readLine();
System.out.println("The permutaions are");
perm(str,"",str.length());
}
}

