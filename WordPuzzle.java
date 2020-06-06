 import java.io.*;

 public class  WordPuzzle
 {

    static  boolean Up(int r , int c , char a[][], String s )
    {
 	   int l = s.length()-1;

 	   String s1="";

        if ((r-l)<0) return false;

 	   for(int i=r; i>=(r-l); i--)  s1 = s1 + a[i][c] ;

 	   return (s.equalsIgnoreCase(s1));


    }

 	static  boolean Down(int r , int c , char a[][], String s )
    {
 	   int l = s.length()-1;

 	   String s1="";

 	   int r0 = a.length-1;

        if ( (r+l) > r0) return false;

 	   for(int i=r; i<=(r+l); i++)  s1 = s1 + a[i][c];

 	   return (s.equalsIgnoreCase(s1));


    }


    static  boolean Right(int r , int c , char a[][], String s )

       {
 		  int l = s.length()-1;

    	   String s1="";

    	   int c0 = a[0].length-1;

           if ( (c+l) > c0) return false;

    	   for(int i=c; i<=(c+l); i++)  s1= s1 + a[r][i];

    	   return (s.equalsIgnoreCase(s1));


       }


       static  boolean Left(int r , int c , char a[][], String s )

          {
 			 int l = s.length()-1;

       	   String s1="";

              if ( (c-l) < 0) return false;

       	   for(int i=c; i>=(c-l); i--)  s1 = s1 + a[r][i];

       	   return (s.equalsIgnoreCase(s1));


          }

    	 static  boolean RUD(int r , int c , char a[][], String s )

 	      {
 			  int l = s.length()-1;

 	   	   String s1="";

 	   	   int c0 = a[0].length-1;

 	          if ( ((r-l) <0 ) || ((c+l) > c0 )) return false;

 	   	   for(int i=r , j=c ; i>=(r-l); i-- , j++)  s1 = s1 + a[i][j];

 	   	   return (s.equalsIgnoreCase(s1));


 	      }


      	 static  boolean LUD(int r , int c , char a[][], String s )

   	      {
 			  int l = s.length()-1;

   	   	   String s1="";

   	          if ( ((r-l)<0 ) || ((c-l)< 0 )) return false;

   	   	   for(int i=r , j=c ; i>=(r-l); i-- , j--)  s1 = s1 + a[i][j] ;

   	   	   return (s.equalsIgnoreCase(s1));


   	      }

   	   static  boolean RLD(int r , int c , char a[][], String s )

 		  {
 			  int l = s.length()-1;

 		  	  String s1="";

 		  	  int r0 = a.length-1;

 		  	  int c0 = a[0].length-1;

 		      if ( ((r+l) > r0 ) || ((c+l) > c0 )) return false;

 		  	  for(int i=r , j=c ; i<=(r+l); i++ , j++)  s1 = s1 + a[i][j];

 		  	   return (s.equalsIgnoreCase(s1));


 	      }

 	       static  boolean LLD(int r , int c , char a[][], String s )

 		  		  {
 					  int l = s.length()-1;

 		  		  	  String s1="";

 		  		  	  int r0 = a.length-1;

 		  		      if ( ((r+l) > r0 ) || ((c-l) < 0 )) return false;

 		  		  	  for(int i=r , j=c ; j>=(c-l); i++ , j--)  s1= s1 + a[i][j];

 		  		  	   return (s.equalsIgnoreCase(s1));


 	        }

static  void CheckWordPos(int r , int c , char a[][], String s )
{
	 if (Up( r , c , a, s ))

     System.out.println(" Word "+ s +"  found on UP Side = = From position { "+(r+1)+" , "+(c+1)+" }");

   	if (Down( r , c , a, s ))

     System.out.println(" Word "+ s +"  found on Lower Side = = From position { "+(r+1)+" , "+(c+1)+" }");

   if  (Left( r , c , a, s ))

     System.out.println(" Word "+ s +"  found on Left Side = = From position { "+(r+1)+" , "+(c+1)+" }");

   	 if (Right( r , c , a, s ))

     System.out.println(" Word "+ s +"  found on Right Side = = From position { "+(r+1)+" , "+(c+1)+" }");

   	 if (RUD( r , c , a, s ))

     System.out.println(" Word "+ s +"  found Right Upper Diagonally = = From position { "+(r+1)+" , "+(c+1)+" }");

   	  if (LUD( r , c , a, s ))

     System.out.println(" Word "+ s +"  found Left Upper Diagonally = = From position { "+(r+1)+" , "+(c+1)+" }");

   	 if  (RLD( r , c , a, s ))

     System.out.println(" Word "+ s +"  found Right Lower Diagonally = = From position { "+(r+1)+" , "+(c+1)+" }");

   	  if  (LLD( r , c , a, s ))

     System.out.println(" Word "+ s +"  found Left Lower Diagonally = = From position { "+(r+1)+" , "+(c+1)+" }");


      }

static void FindWord( char a[][] , String s )
{
	char c =' ';

   	c = s.charAt(0);

	for(int i=0; i < a.length; i++)

	{ 	for( int j=0; j < a[0].length; j++)

	     {  if(Character.toUpperCase(a[i][j])==Character.toUpperCase(c))
	         {
	             CheckWordPos( i , j , a, s ) ;
	       }

		 }

	}

}



 public static void main(String [] args)throws Exception

 	{

   BufferedReader dd1 =new BufferedReader(new FileReader("puzzle1.txt"));

	        String ss1="",y1="";

					while( (ss1=dd1.readLine() ) !=null)

					y1=y1+";"+ss1;

					String ar1[]=y1.split(";");

					String c1[]=ar1[1].split(" ");


       char a1[][]=new char[ar1.length-1][c1.length];





    for (int i=0 ; i<(ar1.length-1) ; i++)
	      {
			  int j=0, c=-1;


		     while( ++c < ar1[i+1].length())

			  {  if ((char)ar1[i+1].charAt(c)!=' ')

			      a1[i][j++]=(char)ar1[i+1].charAt(c);

		       }
		   }





  BufferedReader dd =new BufferedReader(new FileReader("dict1.txt"));

	        String ss="",y="";

					while( (ss=dd.readLine() ) !=null)

					y=y+";"+ss;

					String ar[]=y.split(";");


  System.out.println(" \t === Word to be found in the dda are ===  \t ");

 			for(int i=1; i<ar.length; i++)

 			  {
 					System.out.println("  [=="+" \t "+ar[i]+" \t ");

 	     	      }


System.out.println(" \t \t ===== OutPut  ==== ");
System.out.println("__________________________________________________________________");


           for(int i=1; i<ar.length; i++)

 			  {
				  System.out.println();

 					FindWord( a1 , ar[i] );

System.out.println("__________________________________________________________________");

 	     	      }
dd1.close();
dd.close();

}


}
