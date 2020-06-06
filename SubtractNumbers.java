/*
 Write a program to subtract two
numbers with any base (Generic
code) 
Algo
Step 1:	Declare the required variables
		base for the base of the number system ,
		str for the first number, str1 is for the second number, v is for the possible
		digits of the number system, m is for difference and  R is for the result

Step 2:	Initialize the required variables
		Take the input for both the numbers str and str1

Step 3: start a while loop  untill the length of both the numbers becomes equal
		and repeat step 3
		a) if length of str is more than str1 then add "0" in front of str1
		b) if length of str1 is more than str then add "0" in front of str
Step 4:	compare both the numbers str and str1 if str(the first number) is smaller than
		the second the swap both these numbers
		for this a function has been made which returns 1 if first number is bigger,
		returns -1 if second number is bigger and returns 0 if both the numbers are same

Step 5:	start a loop i from str.length() - 1 to 0 and repeat through step 12

Step 6:	if(v.indexOf(str1.charAt(i)) is more than  c + v.indexOf(str.charAt(i)))) then go to step 7 otherwise go to step 10

Step 7:	m = (base + v.indexOf(str.charAt(i))) - v.indexOf(str1.charAt(i));

Step 8: make c = -1

Step 9: go to step 12

Step 10: m = c + v.indexOf(str.charAt(i)) - v.indexOf(str1.charAt(i));

Step 11: make c = 0

Step 12: evaluate
		 R = v.charAt(m) + R;

Step 13: Print the Result R

Step 14: End
*/
import java.io.*;
class SubtractNumbers
{

		static int compare(String s, String s1)
		{
				for(int i=0;i<=s.length()-1;i++)
				{
						if(s.charAt(i) > s1.charAt(i))
						return 1;
						if(s1.charAt(i) <  s.charAt(i))
						return -1;
				}
				return 0;
		}
		public static void main(String args[])throws IOException
		{
			int base=0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the base");
			base = Integer.parseInt(br.readLine());
			System.out.println("Enter the First No");
			String str = br.readLine();
			System.out.println("Enter the second No.");
			String str1 = br.readLine();
			String v = "0123456789ABCDEF";
			while(str.length() != str1.length())
			{
					if(str.length() > str1.length())
					str1 = "0"+str1;

					if(str.length() <' str1.length())
					str = "0"+str;
			}
			int c = compare(str,str1);
			System.out.println(c);

			if(c<0)
			{
				String t = str;
				str = str1;
				str1 = t;
			}
			int m=0;

			String R="";

			for(int i=str.length()-1;i>=0;i--)
			{
				if(v.indexOf(str1.charAt(i)) > (  c + v.indexOf(str.charAt(i))))
				{
				m = (base + v.indexOf(str.charAt(i))) - v.indexOf(str1.charAt(i));
				c=-1;
				}
				else
				{
					m = c + v.indexOf(str.charAt(i)) - v.indexOf(str1.charAt(i));
					c=0;
				}
				R = v.charAt(m) + R;
			}

			System.out.println("The result is "+R);
		}

}


