/*
 Write a program to check for Vampire
No.Consider these numbers these
numbers are knows as Vampire No.
(The Number must be of even
length ,Arrange the digits of the
No.Then divide the No. in two parts so
that the product gives The Original No.
21*60 = 1260
27*81 = 2781
81*27 = 8127
86*80 = 8680
80*86 = 8086
 Input:
Enter any number1260
Output: The No. is Vampire 
 
	Algo
Step1 :	Declare the required variables s to represent the no.
		Define a function
		boolean isVampire(String s) which divides the No. into two halves and returns true if
		the product of these halves otherwise false
		Define another function
		void display(String S, String T, int N) this function returns the permutations
		of a string where S is the original no, T is the permutation and N represents the length
		of the number.
Step2 :	[For the function void display(String s, String T, int N)]

		if N becomes 0  and function isVampire(T) returns true go to step 3 otherwise go to step4
Step3 :	print " The No is vampire" return

Step4:  start a loop i from 0 to s.length() -1 and repeat step 5

Step5:	execute the expression
		display((s.substring(0,i)+s.substring(i+1)).trim(),T+s.charAt(i),N-1);
Step6:	End
*/
import java.io.*;
class vampireNo
    {
        static int NN=0;
        void display(String s,String T,int N)
        {
            if(N==0)
            {
            if(isVampire(T))
            {
            System.out.println(T);
            System.out.println("The No is vampire");
            }
            return;
            }
            for(int i=0;i<=s.length()-1;i++)
            display((s.substring(0,i)+s.substring(i+1)).trim(),T+s.charAt(i),N-1);
        }
        boolean isVampire(String s)
        {
            int a = Integer.parseInt(s.substring(0,s.length()/2));
            int b = Integer.parseInt(s.substring(s.length()/2));
            if(a*b == NN)
            return ((a*b) == NN);
        }
        public static void main(String args[])throws IOException
        {
            vampireNo obj = new vampireNo();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the No.");
            String s = br.readLine();
			NN = Integer.parseInt(s);
            obj.display(s.trim(),"",s.length());

        }
    }