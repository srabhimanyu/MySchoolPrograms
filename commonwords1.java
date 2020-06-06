/*
 Write a program to input two strings
and find the common words.
Example:
Input:
Enter the First string
india india india
Enter the second string
india india
Output:
The First String is
india india india
The Second String is
india india
The common words are
india india 

Algo
Step1 : Declare the required variables str is for the first string,
		str1 is for the second string, common is for the common words, c is for the index of the
		first letter of the word(one by one) and t is for the extracted word.
Step2 :	[Initialize]
		Take input for the first String in str and Second String in str1
		append one space at the end of the first string(str)
		and at both the ends in the second string(str1)
Step3 : Start a loop i from 0 to str.length() -1 and repeat through step 8

Step4 : extract the current letter at index no i in ch

Step 4: if ch contains space go to step 5 otherwise go to step 4

Step 5: extract the word using inbuild function substring(c,i) and store it in
		t(representing current word)

Step 6: if the current extracted word is not present in the resultant string(common) but
		present in the second string then go to step 7 otherwise go to step 8
Step 7: a)resultant string(common) will get appended by the adding the word t in last
		b)remove the word t from the second string by using the statement
		  a)p = str1.indexOf(" "+t+" ");
		    where p represents the index at which the word is found
		  b)str1 = str1.substring(0,p)+str1.substring(p+t.length()); // removing the word

Step 8: execute  c = i + 1 (so that c will represent the index of the first letter of the next word)

Step 9: [Print the Output]
		a) Print the First String
		b) Print the Second String
		c) Print the Resultant String
Step 10: End

*/

import java.io.*;
class commonwords1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str="",str1="",str2="",common=" ";
		int c=0;
		System.out.println("Enter the string1");
		str =br.readLine()+" ";
		System.out.println("Enter the second string");
		str2=str1 = " "+br.readLine()+" ";
		for(int i=0;i<=str.length()-1;i++)
		{
				char ch = str.charAt(i);
				if(ch == ' ')
				{
					String t = str.substring(c,i);
					if(str1.indexOf(" "+t+" ")!= -1)
					{
					common = common + t+" ";
					int p = str1.indexOf(" "+t+" ");
					str1 = str1.substring(0,p)+str1.substring(p+t.length());
					}
					c=i+1;
				}
		}

		common = common.trim();
		str1 = str1.trim();
		System.out.println("The First String is");
		System.out.println(str);
		System.out.println("The Second string is");
		System.out.println(str2);
		System.out.println("Common Words are");
		System.out.println(common);
	}
}