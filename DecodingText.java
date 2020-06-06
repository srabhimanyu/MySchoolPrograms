/*
The computer department of the agency of International Expionage is trying to decode intercepted messages.
The agency's spies have determined that the enemy encodes messages by first converting all characters to
their ASCII values and then reversing the String.
For example consider A_z (the underscore is just to highlight the space). The ASCII values of A.
, z are 65, 32, 122 respectively. Concatenate them to get 6532122, then reverse this to get
2212356 as the coded message.

Write a program which reads a coded message and decodes it. The coded message will not exceed 200 characters.
It will contain only alphabets(A.....Z, and a....z) and spaces. ASCII values of A....Z are 65....90
and those of a...z are 97....122.

Test your program for the following data and some random data.

Sample Data

Input:
Encoded Message:
2312179862310199501872379231018117927

Output:
Have A Nice Day
*************************


Input:
Encoded Message

23511011501782351112179911801562340161171141148

Output:
Truth Always Wins


*/
import java.io.*;
class DecodingText
{
public static void main(String args[])throws IOException
{
String str ="",t="";
int i=0,c=0,sum=0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the encoded text");
str = br.readLine();
StringBuffer bb = new StringBuffer(str).reverse();
str = bb.toString();

while(i < str.length())
{
sum = sum * 10 + (int)str.charAt(i)-48;

if(sum == 32)
{
System.out.print(" ");
sum=0;
}
if(sum >=65 && sum <= 90)
{
System.out.print((char)sum);
sum =0;
}
if(sum >= 97 && sum <= 122)
{
System.out.print((char)sum);
sum=0;
}

i = i + 1;
}
}
}
