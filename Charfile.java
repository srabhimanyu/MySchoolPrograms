import java.io.*;

  public class  Charfile
{
	public static void main(String  args[])throws Exception
	  {


		BufferedReader kk = new BufferedReader(new InputStreamReader(System.in));


   BufferedReader dd =new BufferedReader(new FileReader("puzzle.txt"));

	        String ss="",y="";

					while( (ss=dd.readLine() ) !=null)

					y=y+";"+ss;

					String ar[]=y.split(";");

					String c1[]=ar[1].split(" ");


       char a[][]=new char[ar.length-1][c1.length];





    for (int i=0 ; i<(ar.length-1) ; i++)
	      {
			  int j=0, c=-1;


		     while( ++c < ar[i+1].length())

			  {  if ((char)ar[i+1].charAt(c)!=' ')

			      a[i][j++]=(char)ar[i+1].charAt(c);

		       }
		   }



	        for (int i=0 ; i<(ar.length-1) ; i++)
	         {
			    for (int j=0 ; j<(c1.length) ; j++)
			    {
					System.out.print(a[i][j]+"  ");
				}
				System.out.println();
			}



      dd.close();


		}

	}

