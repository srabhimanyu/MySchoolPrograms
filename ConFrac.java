import java.io.*;
public class ConFrac
{
static void rec(int a, int b,String s)
{

 if(b==1)
 {
	 System.out.println(s+a);
	 return;
 }

 rec(b,(a%b),s+((a-(a%b))/b)+" ,");

}




public static void main(String[] args)throws IOException
 {
 BufferedReader dd =new BufferedReader(new InputStreamReader(System.in));

 rec(19,8,"");
}
}
