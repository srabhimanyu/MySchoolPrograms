import java.io.*;
public class SubSeq
{
  public static void display(String P ,String r, int k)
  {
    if(k==0) { System.out.println(P); return;}
    if(r.length()==0) return;
    display( P+r.charAt(0), r.substring(1), k-1);
    display( P, r.substring(1), k);
  }
  	public static void main(String [] args)throws Exception
  	{

  		BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("enter a String");
          String r=dd.readLine();
          System.out.println("enter the length of substring");
		int k=Integer.parseInt(dd.readLine());
		display("",r,k);
	}
}