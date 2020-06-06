import java.io.*;
 public class FullCalander1
  { static String year="LGABJEFGHCDEMABCKFGAIDEFNBCD",str9,ar[];
    static String M[]={"144725736146",
                       "255136147257",
                       "366247251361",
                       "477351362472",
                       "511462473513",
                       "622573514624",
                       "733614625735",
                       "145136147257",
                       "256247251361",
                       "367351362472",
                       "471462473513",
                       "512573514624",
                       "623614625735",
                       "734725736146"};
    static String day[]={"MON","TUE","WED","THUS","FRI","SAT","SUN"};
    static String mnths[]={"JAN","FEB","MAR","APR","MAY","JUN","JULY","AUG","SEP","OCT","NOV","DEC"};
    static int cal[]={1,2,3,4,5,6,7,8,9,10,
                      11,12,13,14,15,16,17,18,19,20,
                      21,22,23,24,25,26,27,28,29,30,
                      31};

 public static void main(String[] args)throws Exception
 {
	 BufferedReader dd =new BufferedReader(new InputStreamReader(System.in));
     int c=1988;
     for (int i=0;i<20;i++)
     {
		 System.out.println(c+"("+(c%28)+")"+" _ "+(c+27)+"("+((c+27)%28)+")");
		 c+=28;
	 }

	 for(int j=2016;j<=2043;j++)
	 {
		 System.out.print("("+j%28+") \t = "+j+"\t"+year.charAt(j%28)+" \t = "+M[year.charAt(j%28)-'A']+"\n");
	 }

     for(int j=0;j<7;j++)
     System.out.print(day[j]+"\t");
     System.out.println();

    int t=2,k=0;
     for(int j=1-t+1;j<=31;j++)
     { k++;
		 if(j>0)
     {
		 System.out.print(j+"\t");
		 if(k%7==0)
		 System.out.println();
	 }
	 else
		 System.out.print("\t");

	 }
	 		 System.out.println();
 }
}