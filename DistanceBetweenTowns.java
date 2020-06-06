import java.io.*;
 public class DistanceBetweenTowns
  { static int min,D[],N=0,N1=0;
    static String T[],P[],ar[];
    static char start,end;

     static int count(char c)
	     {   String s="";
	 		for(int i=0;i<T.length;i++)
	 		{
	 			if(T[i].indexOf(c)!=-1)
	 			{
	 				if(T[i].indexOf(c)==0)
	 				s=s+""+T[i].charAt(1)+""+D[i]+";";
	 				else
	 			 s=s+""+T[i].charAt(0)+""+D[i]+";";
	 			}
	 		}     P=s.split(";");
	 		return (P.length);
	}

     static void shortdist(char A ,char B ,int n,int p)
    { 	if( ((B==start) &&  A!='0') || p>N )  return;

        if(B==end) {if(n<min) min=n; return; }

            for(int i=0;i<(count(B));i++)
            {  if(A!=P[i].charAt(0))
		       shortdist(B ,P[i].charAt(0) ,n+((int)(P[i].charAt(1)-48)), p+1 );
		   }
    }
   static void display(int n, int t)
     { min=t;
		 if(n==ar.length) return;
      start=ar[n].charAt(0); end=ar[n].charAt(1);
      System.out.println(" Shortest Distance between "+start+" to  "+end+" is");
	  shortdist('0',start,0,0);
	  System.out.println(min+" Kms");
	  System.out.println("************************************");
	  display(n+1,t);
     }


 public static void main(String[] args)throws IOException
 { BufferedReader dd =new BufferedReader(new FileReader("towns.txt"));

  	        String ss="",y="";
  					while( (ss=dd.readLine() ) !=null)
  					y=y+ss+";";

  					 ar=y.split(";");
System.out.println("****************INPUT**************");
     for(int i=0;i<ar.length;i++)
     { System.out.println(ar[i]);
	 }

   int t=0;
     N=Integer.parseInt(ar[0]);  T=new String[N]; D=new int[N];
     for(int i=0;i<N;i++)
     { T[i]=ar[i+1].substring(0,2);
     t+=D[i]=(int)(ar[i+1].charAt(3)-48);
	 }

	System.out.println("****************OUTPUT**************");
    display(N+1,t);

 dd.close();
 }
}