/*
 Write a program to input long integer
data not less than 5 digits. Your
program should reject it if data is less
than 5 digits and ask to reenter. In the
input last four digits will be taken as
year(the validity of the year should be
checked that the year should be
within 1900 to 3000, both inclusive,
otherwise the computer  should
reject the input and ask to reenter
data) and remaining digits as  total
number of days . your program
should display the output as actual
data.(using number of days extracted)
followed by month name and actual
year. Test your program for
the following data and some random
data.
Sample Input : 272008
Sample Output: 27 january
2008
Sample Input : 2008
Sample output : Invalid Data! Reenter
value not less than 5 Digits. 

ALGO

Step 1 :	Declare the Required Variables Num for the Number , year is for the year , dd is for
			day part and m is for the month, month[] for maximum no of days month wise,
			monthN[] for Name of the months

Step 2:		Initialize the variables
			Take input for Num

Step 3:		count the Number of the digits for the entered number Num if digits are less
			than 5 then go to step    otherwise go to step 4
Step 4:		Extract the year and day part by the following statements
			year = Num % 10000
			dd	 = Num / 10000
Step 5:		Check for the leap year if the year is leap then month[2] will recieve 29

Step 6:		start a while loop till dd is more than month[m] and repeat step 6
			a) dd = dd - month[m]
			b) increment the value of m by 1
			c) if m becomes 13
			   a) increment the value of year by 1
			   b) m will become 1
			   c) if year is a leap year then month[2] will recieve 29 otherwise month[2] will recieve 28
Step 7:		Print the desired date
Step 8:		End

*/
import java.io.*;
class FindDate
{

	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Num=0,year=0,dd=0,m=0;
		int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		String monthN[]={"","JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		System.out.println("Enter the number");
		Num = Integer.parseInt(br.readLine());

                if(count(Num) < 5)
				{
                        System.out.println("Invalid entry");
						return;
				}

                year = Num%10000;
                dd = Num / 10000;

                if(year % 4 == 0)month[2] = 29;

		m = 1;
		while(dd > month[m])
		{
			dd = dd - month[m];
			m=m+1;
			if(m == 13)
			{
				m=1;
				year = year + 1;
				if(year %4 == 0)
				month[2] = 29;
				else
				month[2] = 28;
			}

		}

		System.out.println("The desired date is "+dd+"/"+monthN[m]+"/"+year);
	}

	static int count(int N)
	{
		if(N==0)
		return 0;
		return 1+count(N/10);
	}

}
