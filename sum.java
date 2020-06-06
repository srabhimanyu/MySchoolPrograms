import java.io.*;
 class  Sum
    {        static  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                 int S(int N,int i)
                         {        if(N==1)           return 0;
                                   if(N%i==0)      return S(N/i,i)+i;
                                         return S(N,++i);
                           }
public static void main(String args[])throws Exception
      {           System.out.println("Enter a no.");
               int N=Integer.parseInt(br.readLine());
               System.out.println(new Sum( ).S(N,i));
         }
  }
