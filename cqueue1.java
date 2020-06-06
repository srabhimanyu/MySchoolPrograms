import java.io.*;

class cqueue1 extends CQueue
{
  public cqueue1(int x1)
  {
	  super(x1);
  }


public static void main(String[] args)throws IOException
 {

	 BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));

	 System.out.println("enter the size --- ");
	         int n= Integer.parseInt(dd.readLine());

	         cqueue1 q1 =new cqueue1(n);

	         String s="1";
	         while(s.equals("1"))
	         {
				 System.out.println("enter the choice ");

				int ch = Integer.parseInt(dd.readLine());

				switch(ch)
				{

				case 1:

					System.out.println("enter the no.s ");

					int ch1 = Integer.parseInt(dd.readLine());

					q1.insert(ch1);

					for (int i=0; i< size ; i++)
					{
						if (a[i]==0)

					    System.out.print(" * ");

					    else

					    System.out.print(" "+a[i]);

					}

				System.out.println();

				break;


				case 2:

				     q1.delete();

				   for (int i=0; i< size ; i++)
					{
						if (a[i]==0)

					    System.out.print(" * ");

					    else

					    System.out.print(" "+a[i]);

					}

					System.out.println();

				    break;


				default:

				      System.out.println("wrong choice");

				      break;
			}

				System.out.println(" do you want to continue");
				s= dd.readLine();


			}

		}

	}

