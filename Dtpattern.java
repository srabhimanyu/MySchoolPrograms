import java.io.*;
class Dtpattern
{

public static void main(String Pr[])throws Exception
  {
	BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the limit");

		int N=Integer.parseInt(dd.readLine());

		String s;

		int a=((N-1)/2), b=0 , j, i , n=1;

		for(int ii=1;ii<=N;ii++)

		{
			s="";

			if( ii== ((n+1)/2)+1 )

			{
				a+=2;
				b-=2;
			}
			else if( ii > ((n+1)/2)+1 )

			{
				a+=1;
				b-=2;

			}

			else

			b+=2;



		for(j=a; j>=ii; j--)

			System.out.print(" ");

		  for(i=1; i<b; j+=2)

			{
				if(!(ii%2==0))

				s=(n++)+" "+s;

				else
				s+=(n++)+" ";

				if(n==10)

				n-=9;


			}

			System.out.print(s+"\n");

		}



	}


}



