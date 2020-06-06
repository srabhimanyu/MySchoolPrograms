 import java.io.*;
 class decompress
 {
	 static void dec(String s,int n)
  {
 	int l=s.length();
    if(l>=3 && s.indexOf('*')!=-1)
      {
           if(n>0  && (s.charAt(l-2))=='*')
 	         {
 				 dec(s,(n-1));
 	          System.out.print(s.charAt(l-3));
 	         }
 	       else if(n==0  && (s.charAt(l-2))=='*')
             {
				 String ss=s.substring(0,l-2);
				 if(  (ss).indexOf('*')!=-1 &&  ss.lastIndexOf('*')<l-4 )
				        dec(s.substring(0,l-3) ,((int)((s.charAt(l-4))-48)));
				 else
				        dec(s.substring(0,l-2) ,((int)((s.charAt(l-3))-48)));
		      }
            else
         {
			 dec(s.substring(0,l-1) , ((int)((s.charAt(l-2))-48)) );
             System.out.print(s.charAt(l-1));
	     }
    }
   else
       { if(s.length()!=1)
          System.out.print(s.substring(0,(s.length())-1));
          return;
       }
 }

 public static void main(String args[])throws IOException
 {
 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter the String to decompress");
 String s1=br.readLine();
 int l1=s1.length();
 dec(s1,((int)((s1.charAt(l1-1))-48)));
 System.out.println();
 }
 }