import java.io.*;
 public class T9Dictionary
  { static String str,str9,ar[];
    static String T[]={"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

     static boolean T9Predict(String T9)
    {
	        for(int i=0;i<ar.length;i++)
          {
			  if(ar[i].indexOf(T9)==0)
                {   str9=ar[i];
                   return true;
                }
	     }
	 }

	 static  void set(int x,String T9)
	   {
		    if(x==0 && T9Predict(T9))
		      System.out.println(str9);

		 	for(int i=0;i<T[x%10].length();i++)
		       set(x/10,T9+T[x%10].charAt(i));
       }

 public static void main(String[] args)throws IOException
 {  BufferedReader dd =new BufferedReader(new InputStreamReader(System.in));
	BufferedReader dd1 =new BufferedReader(new FileReader("dict-A.txt"));

 	        String ss="",y="";
 					while( (ss=dd1.readLine() ) !=null)
 					y+=";"+ss;

 					 ar=y.split(";");

     System.out.println("ENTER THE CODE");
      str=dd.readLine();
     int x=Integer.parseInt((new StringBuffer(str).reverse()).toString());
      set(x,"");

dd1.close();
 }
}