/*
 Write a program to check whether a
Number is magical prime or not.
Any Number is said to be magical
prime is its all permutations are prime
No.
Input:
Enter any number : 295
Output : Its is magical Prime
Input:
Enter any number : 997
Output : Its is magical Prime
Input:
Enter any number : 998
Output : Its is Not magical Prime 

	Algo
Step1 :	Declare the required variables s to represent the no and f is for the status intitially f is 0
		Define a function
		boolean isPrime(int N) which calculates and returns the total no. of factors of any number
		Define another function
		void display(String S, String T, int N) this function returns the permutations
		of a string where S is the original no, T is the permutation and N represents the length
		of the number.
Step2 :	[For the function void display(String s, String T, int N)]

		if N becomes 0  and function isPrime(T) returns 2 change f to 1 otherwise go to step4
Step3 :	print " The No is magical Prime" return

Step4:  start a loop i from 0 to s.length() -1 and repeat step 5

Step5:	execute the expression
		display((s.substring(0,i)+s.substring(i+1)).trim(),T+s.charAt(i),N-1);
Step6:	if f is still 1 print "The No is magical Prime" otherwise print "No is not magical Prime"
*/

import java.io.*;
class MagicalPrime
    {
        static int f=0;
        void display(String s,String T,int N)
        {
            if(N==0)
            {
            if(isprime(Integer.parseInt(T))!=2)
            f=1;
            return;
            }
            for(int i=0;i<s.length();i++)
            display(s.substring(0,i)+s.substring(i+1),T+s.charAt(i),N-1);
        }
        int isprime(int N)
        {
            int c=0;
            for(int j=1;j<=N;j++)
            {
                if(N%j==0)
                c = c + 1;
            }
            return c;
        }
        public static void main(String args[])throws IOException
        {
            MagicalPrime obj = new MagicalPrime();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the Number");
            String s = br.readLine();
            obj.display(s,"",s.length());
            if(f==0)
            System.out.println("The No is magical prime");
            else
            System.out.println("The No is not magical prime");
        }
    }