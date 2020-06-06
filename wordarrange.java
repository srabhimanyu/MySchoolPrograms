/* Read a single sentence which
terminates with a full stop(. ). The
word are to be separated with a single
blank space and are in lower case.
Arrange the words contained in the
sentence according to the length of
the words in ascending order. If two
words are of the same length then the
word occurring first in the input
sentence should come first. For both
input and output, the sentence must
begin in upper case. Test your
program for the following data and
some random data.
INPUT : the lines are
printed in reverse order.
OUTPUT : In the are
lines order printed reverse.
INPUT : Print the
sentence in ascending order.
OUTPUT : In the print
order sentence ascending.
INPUT : I love my
country.
OUTPUT : I my love
country. 

Algo
Step 1 : Declare the Required variables str for main string with dot,c for the index of first letter of the word, count is for
		 counting the words v is for the storage of space along with dot.
step 2 : Take input for the main string str and initialize the other required variables.
Step 3 : [count the No of words]
		 start a loop i from 0 to less then the length of the string
		 whenever space or dot is encountered increment the value of count by 1
step 4:  Initialize the the array a[] of size count
		 so that we can store the words in it.
step 5:	 [fill the array a[] with the words of the string]
		 start a loop i from 0 to less then the length of the string and do the following
		 a) if space or dot encountered extract the word and store the word at count index no in array a[]
		 b) increment the value of count by 1
step 6:	 Sort the array by using bubble sorting of the basis of the length of the words which we have stored earlier in step 5

Step 7:	 Print the Original string str
Step 8:	 [Print the resultant array a[]]
		 start a loop i from 0 to count -1 and do the following
		 a) print a[i]

step 9 : End
*/
import java.io.*;
class wordarrange
{
	public static void main(String args[])throws IOException
	{
		String str=" ";
		int c=0,count=0;String v=" .";
		String a[];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sentence");
		str=br.readLine();

		for(int i=0;i<=str.length()-1;i++)
		{
			char ch = str.charAt(i);
			if (v.indexOf(ch)!=-1)
			{
				count = count + 1;
			}

		}

		a = new String[count];

		count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch = str.charAt(i);
			if(v.indexOf(ch) != -1)
			{
				a[count] = str.substring(c,i);
				count = count + 1;
				c = i + 1;
			}
		}

		for(int i=0;i<=count-1;i++)
		{
			for(int j=0;j<=count - i - 2;j++)
			{
				if(a[j].length() > a[j+1].length())
				{
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

		System.out.println("The Original St ring is "+str);
		System.out.println("The Resultant String is");
		for(int k=0;k<=count-1;k++)
		System.out.print(a[k]+"  ");
	}


}