/*
A Sentence is terminated by either ",",".","!","?" followed by a space.
Input a piece of text consisting of sentences.
Assume that there will be a maximum of 10 sentences in block letters.

Class name 	:Sentence
Data Members
String Str
Member functions
void input()
int vowel(char)
int words(String s)
void out_graph()

SCALE  is  1/3

Input:
HELLO! HOW ARE YOU? HOPE EVERYTHING IS FINE. BEST OF LUCK.
OUTPUT

SENTENCE 		NO OF VOWELS		NO OF WORDS
1				2					1
2				5					3
3				8					4
4				3					3
GRAPH
Sentence		NO OF WORDS/VOWELS
1				VVVVVV
				WWW

2				VVVVVVVVVVVVVVV
				WWWWWWWWW

3				VVVVVVVVVVVVVVVVVVVVVVVV
				WWWWWWWWWWWW

4				VVVVVVVVV
				WWWWWWWWW


*/

import java.io.*;
import java.util.*;
class Sentence
{
	String str;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	void input()throws IOException
	{
		System.out.println("Enter the String ");
		str = br.readLine();
	}

	int vowel(char ch)
	{
		String v = "aeiouAEIOU";
		return v.indexOf(ch);
	}
	int words(String p)
	{
		StringTokenizer ss = new StringTokenizer(p);
		return ss.countTokens();
	}
	void out_graph()
	{
		int c=0,w=0,count=0,T=1;
		String q = ",.?!";
		String temp="";
		System.out.println("SENTENCE\tNO OF WORDS\tNO OF VOWELS");
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch = str.charAt(i);
			if(q.indexOf(ch)!= -1)
			{
				temp = str.substring(c,i);
				w = words(temp);
				count=0;
				for(int j=0;j<=temp.length()-1;j++)
				{
					if(vowel(temp.charAt(j))!= -1)
					count = count + 1;
				}
				System.out.println(T+++"\t\t"+w+"\t\t"+count);
				c = i + 1;
			}
		}
		System.out.println("GRAPH");
		System.out.println("Sentence\tNO OF WORDS/VOWELS");
		c=0;T=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch = str.charAt(i);
			if(q.indexOf(ch)!= -1)
			{
				temp = str.substring(c,i);
				w = words(temp);
				count=0;
				for(int j=0;j<=temp.length()-1;j++)
				{
					if(vowel(temp.charAt(j))!= -1)
					count = count + 1;
				}
				System.out.print((++T)+"\t\t");
				for(;count>0;count--)
				System.out.print("VVV");
				System.out.println();
				System.out.print("\t\t");
				for(;w>0;w--)
				System.out.print("WWW");
				System.out.println("\n");
				c = i + 1;
			}
		}


	}
	public static void main(String args[])throws IOException
	{
		Sentence obj = new Sentence();
		obj.input();
		obj.out_graph();
	}
}
























