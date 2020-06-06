/*
 Write a program that accepts any
number, its base then converts that
number to decimal.
Hexadecimal to Decimal(base 16)
Octal to Decimal(base 8)
Binary to Decimal(base 2)
Penta to Decimal(base 5)
Input:
Enter the No
ABC
Enter the base
16
Output :
The Result is 2748
Input:
Enter the number
1100100
Enter base
2
The result is 100
 
	Algo
Step 1:	Decalare the required variables base for the base of the number, result for the decimal no, d is for the digit value.

Step 2:	[Initialize the required variables]
		Take input for the base and the number

Step 3:	start a loop i from 0 to s.length() -1 and repeat through step 7

Step 4: extract the digit at index number(s.length() - 1 - i) in ch

Step 5: recieve 0 in d

Step 6: if the digits belongs to Hexadecimal number then evaluate d = (int)ch - 55 otherwise evalulate d = (int)ch - 48

Step 7: evaluate result = result + d*(int)Math.pow(base,i)

Step 8: Print  result

Step 9: End

*/


import java.io.*;
class anticonversion
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int base=0,result=0;
            String s = "";
            System.out.println("Enter the Number");
            s = br.readLine();
            System.out.println("Enter the base");
            base = Integer.parseInt(br.readLine());

                for(int i=0;i<=s.length()-1;i++)
                {
                    char ch = s.charAt(s.length()-1-i);
                    int d = 0;
                    if(ch >='A')
                    d = (int)ch-55;
                    else
                    d = (int)ch-48;
                    result = result + d*(int)Math.pow(base,i);
                }
                System.out.println("The No will be \n");
                System.out.println(result);
        }
    }