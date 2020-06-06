
/*
 Write a program to check whether
saddle point in a given matrix is
present or not. (When the maximum
of row minima is same as minimum of
column maxima then saddle point is
present. Row minima is the array of
minimum elements from every row
Column maxima is the array of
maximum elements from every
column) Input:
Enter the size of the matrix
Enter Row: 3
Enter Column: 3
Enter the matrix elements 1, 2, 3, 1, 2,
3, 4 ,2, 3, 4 ,5, 3 ,3 ,4, 5
Output :
The array with Row minima is => 1 2
3
The array with Column maxima is => 3
4 5
The maximum from Row Minima is : 3
The minimum from Column maxima is
3
Saddle point is present 
	Algo :

Step1 :	Declare the required variables row for row of the matrix, col for column of the matrix, small is for minimum of the column maxima
		large is for maximum of row minima and a[][] is for the matrix


Step2 :	[Initialize the variables]
		Take input for the size of the matrix, then create  the matrix  of size row+1 and col+1 size
		Take input for the matrix elements

Step3 :	[Find row minima]
		start a loop i from 0 to row - 1 and repeat through step 6
		recieve a[i][0] in small
Step 4:	start a loop j from 1 to col -1 and and repeat step 5

Step 5: if small is more than a[i][j] then small will recieve a[i][j]

Step 6	a[i][col] will recieve small

Step 7 :[Find column maxima]
		start a loop i from 0 to col - 1 and repeat through step 10
		recieve a[0][i] in large
Step 8:	start a loop j from 1 to row -1 and and repeat step 9

Step 9: if large is less than a[j][i] then large will recieve a[j][i]

Step 10:	a[row][i] will recieve small

Step 11: [Find minimum of column maxima]
		 recieve a[row][0]  in small
Step 12: start a loop i from 1 to col -1 and repeat step 13

Step 13: if a[row][i] is less than small then small will recieve a[row][i]

Step 14: [Find maximum of the row minima]
		 recieve a[0][col]  in large
Step 15: start a loop i from 1 to row -1 and repeat step 16

Step 16: if a[i][col] is more than large then large will recieve a[i][col]

Step 17: print the following messages
		 a) Print the matrix
		 b) Print Array of row minima
		 c) Print Array of column maxima
		 d) Print minimum of column maxima
		 e) Print maximum of row minima

Step 18: if small and large both are same print "Saddle Point is present" otherwise print "Saddle poing is not present"

Step 19: End

*/
import java.io.*;
class saddle
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int row=0,col=0,small=0,large=0;
            int a[][];
            System.out.println("Enter row");
            row = Integer.parseInt(br.readLine());
            col = Integer.parseInt(br.readLine());
            a = new int[row+1][col+1];
            System.out.println("Enter matrix elements");
            for(int i=0;i<=row-1;i++)
            {
                for(int j=0;j<=col-1;j++)
                {
                    a[i][j] = Integer.parseInt(br.readLine());
                }
            }
            for(int i=0;i<=row-1;i++)
            {
                small = a[i][0];
                for(int j=1;j<=col-1;j++)
                {
                    if(small > a[i][j])
                    small = a[i][j];
                }
                a[i][col] = small;
            }
            for(int i=0;i<col;i++)
            {
                large = a[0][i];
                for(int j=1;j<row;j++)
                {
                    if(a[j][i] > large)
                    large = a[i][j];
                }
                a[row][i] = large;
            }
            small = a[row][0];
            for(int i=1;i<=col-1;i++)
            {
                if(small > a[row][i])
                small = a[row][i];
            }
            large = a[0][col];
            for(int i=1;i<=row-1;i++)
            {
                if(a[i][col] > large)
                large = a[i][col];
            }
            System.out.println("The matrix is as follows");
            for(int i=0;i<=a.length-1;i++)
            {
                for(int j=0;j<=a[0].length-1;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }

            System.out.print("The Array with Row minima is =>\t\t");
            for(int i=0;i<=row-1;i++)
            System.out.print(a[i][col]+"\t");
            System.out.println();
            System.out.print("The Array with Column maxima is =>\t");
			for(int i=0;i<=col-1;i++)
			System.out.print(a[row][i]+"\t");
            System.out.println();
            System.out.println("The Maximum from the row minima is "+large);
            System.out.println("The minimum from the column maxima is "+small);
	        if(small == large)
            System.out.println("Saddle point is present");
            else
            System.out.println("Saddle point is not present");
        }
    }