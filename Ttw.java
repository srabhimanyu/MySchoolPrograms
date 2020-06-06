import java.io.*;
public class Ttw
{

public static void main (String br[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));

	      String st[]=new String[30];
	      String s="";
	      int h=0,m=0;


          st[0]=" ";
          st[1]="one";
          st[2]="two";
          st[3]="three";
          st[4]="four";
          st[5]="five";
          st[6]="six";
          st[7]="seven";
          st[8]="eight";
          st[9]="nine";
          st[10]="ten";
          st[11]="eleven";
          st[12]="twelve";
          st[13]="thirteen";
          st[14]="fourteen";
          st[15]="fifteen";
          st[16]="sixteen";
          st[17]="seventeen";
          st[18]="eighteen";
          st[19]="nineteen";
          st[20]="twenty";

         for (int i=21; i<30 ; i++)
			{
				st[i]=st[(i/10)*10]+"  "+st[i%10];

			}

         int c=0;


	      do{

	      System.out.println("enter time");

             s = dd.readLine();

             if(s.indexOf(':')==-1)
             {

		System.out.println("invalid entery ! try again");

		return;

		      }
          h=new Integer(s.substring(0,s.indexOf(':'))).intValue();

          m=new Integer(s.substring(s.indexOf(':')+1)).intValue();
				if (m==0)
				System.out.println(st[h]+"  O' clock");
                else if (m==15)
				System.out.println("Quarter Past "+st[h]);
				else if (m==30)
				System.out.println("Half Past "+st[h]);
                else if (m==45)
				System.out.println("Quarter to "+st[h+1]);
				else if (m<30)
				System.out.println(st[m]+" minutes Past "+st[h]);
                else
				System.out.println(st[60-m]+" minutes to  "+st[h+1]);

                   System.out.println("enter 1 to continue");

                c = Integer.parseInt(dd.readLine());

                }while(c==1);



		}


	}