import java.io.*;
 public class trial
  { static int max=0, k,min=999999999;

    static int count(int k,int z)
    {
		if((int)Math.pow(2,z)<k && k<(int)Math.pow(2,z+1) ) return z;
		return count(k,z+1);
    }

  static void tiles(int r,int c,int a1,int n,int c1)
		   {   System.out.println("* r = "+ r+" c = "+ c+" a1 = "+ a1+" n = "+ n+" c1 = "+ c1);
			 if ((n==0 && c1==-1)||(a1!=(r*c) && c1==-1)) return;

			 if (a1==(r*c) && c1==-1) { if(n<min) min=n;  return; }

			   	 for(int i=0;i<=((r>c)?r:c);i++)
                 {   int p=(int)Math.pow(2,c1);
		            if((i*p*p)<(r*c)) { if(i>max) max=i;}

					else{  tiles(r,c,a1+((max-1)*p*p),n+max-1,c1-1);
					      max=0;
				      }
				 }
	       }

 public static void main(String[] args)throws IOException
 {  BufferedReader dd =new BufferedReader(new InputStreamReader(System.in));
 	int r=Integer.parseInt(dd.readLine());
    int c=Integer.parseInt(dd.readLine());
 //   System.out.println(count((r<c)?r:c,0));
 //System.out.println(r*c);
 tiles(r,c,0,0,count((r<c)?r:c,0));
 System.out.println(" min = "+min);
 }

}