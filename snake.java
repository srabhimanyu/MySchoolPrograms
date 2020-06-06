/*
 Write a program to input any Odd No
and print the Snake Pattern 

Algo
Step1 : Declare required variables N for the Limit, c is for the values,a[][] is for matrix and p is for column index
Step2 : [Initialize]
		Take input for the Limit N
		check if it is even if yes print "Kindly enter odd No." and go to step end otherwise initialize the matrix of size N by N
Step3 : Start a multiple variable loop from i=N/2, j = N/2 to 0  and repeat through step 9 ( i will decrement and j will increment

Step4: if p is even  then go to step 5 otherwise go to step 7

Step 5: start a loop k from i to j and repeat step 6

Step 6: a[k][p] will recieve ++c

Step 7: go to step 9

Step 8: start a loop k from j to i and repeat step 8

Step 9: p = p + 1;

Step10 : Start a multiple variable loop from i=1, j = N-2 to (N/2 - 1)  and repeat through step 16(i will increment and j will decrement)

Step11 : if p is even  then go to step 12 otherwise go to step 15

Step12 : start a loop k from i to j and repeat step 13

Step13 : a[k][p] will recieve ++c

Step14 : go to step 16

Step15 : start a loop k from j to i and repeat step 16

Step16 : p = p + 1;

Step 17: [print the snake pattern by printing the matrix]

Step 18: End
*/

import java.io.*;
class snake
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N=0,c=0,p=0;
            System.out.println("Enter the Limit");
            N = Integer.parseInt(br.readLine());
            if(N%2 == 0)
            {
                System.out.println("Kindly enter odd No");
                return;
            }
            int a[][] = new int[N][N];

            for(int i=N/2,j=N/2;i>=0;i--,j++)
            {
                if(p%2==0)
                {
                for(int k=i;k<=j;k++)
                a[k][p] = ++c;
                }
                else
                {
                for(int k=j;k>=i;k--)
                a[k][p] = ++c;
                }
                p++;
            }
            for(int i=1,j=N-2;i<=N/2;i++,j--)
            {
                if(p%2==0)
                {
                for(int k=i;k<=j;k++)
                a[k][p] = ++c;
                }
                else
                {
                for(int k=j;k>=i;k--)
                a[k][p] = ++c;
                }
                p++;
            }
            System.out.println("The Snake pattern is as  follows");
            for(int i=0;i<=N-1;i++)
            {
                for(int j=0;j<=N-1;j++)
                {
					if(a[i][j] == 0)
					System.out.print("\t");
					else
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }