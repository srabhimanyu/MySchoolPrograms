import java.io.*;
class fhmat
{
	public static void main(String pr[])throws Exception
	{
		BufferedReader kk = new BufferedReader(new InputStreamReader(System.in));

		BufferedReader br = new BufferedReader(new FileReader("asd.txt"));

		PrintWriter pw=new PrintWriter(new BufferedWriter((new FileWriter("output1.txt"))));

		String s="",y="";

		while( (s=br.readLine() ) !=null)

		y=y+";"+s;

		String ar[]=y.split(";");

		for(int i=0; i<ar.length; i++)

		System.out.println(ar[i]);



		for(int i=0; i<ar.length; i++)
		{
			String ars[]=(ar[i].split(" "));


			for(int d=0; d<ars.length; d++)
			{
				for(int j=0; j<ars.length-1; j++)
					{
						String k="";

						if(Integer.parseInt(ars[j])>Integer.parseInt(ars[j+1]))
						{
							k=ars[j];
							ars[j]=ars[j+1];
							ars[j+1]=k;

						}

					}

			}


			for(int x=0; x<ars.length; x++)
           {
			   System.out.print(ars[x]+" ");
			pw.print(ars[x]+" ");
	       }

			   System.out.println();
			pw.println();


		}


		pw.close();


	}


}

