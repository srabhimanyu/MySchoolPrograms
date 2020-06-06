import java.io.*;
 public class FullCalander
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

 public static void main(String[] args)throws Exception
 {
	 BufferedReader dd =new BufferedReader(new InputStreamReader(System.in));
     int c=1988;
     for (int i=0;i<20;i++)
     {
		 System.out.println(c+"("+(c%28)+")"+" _ "+(c+27)+"("+((c+27)%28)+")");
		 c+=28;
	 }

	 for(int j=1988;j<=2015;j++)
	 {
		 System.out.println("("+j%28+")");
		 if(j%28==0)
		 System.out.println(j);
	 }


 }
}