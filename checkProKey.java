import java.io.*;

 public class checkProKey
 {


 public static void main(String [] args)throws Exception

 	{

   BufferedReader dd1 =new BufferedReader(new FileReader("Office 2010 Keys.txt"));

   PrintWriter pw=new PrintWriter(new BufferedWriter((new FileWriter("Office 2010 Keys vaild.txt"))));

         char noE []={'1','5','0','A','E','I','L','N','S','U','Z'};
	        String ss1="";

					while( (ss1=dd1.readLine() ) !=null)
					{
						int c=0;
						for(int i=0;i<noE.length; i++)
						{
							if(ss1.indexOf(noE[i])!=-1)
							c=1;
						}

						if(c==0)
                         {
                           System.out.println(ss1);
                           pw.println(ss1);
                          }
					 }
dd1.close();
pw.close();

}


}
