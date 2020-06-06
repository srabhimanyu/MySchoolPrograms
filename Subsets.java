/*
 Write a program to input the elements
of the set and generate all its substes
Enter the set
123
The subsets are:
{}
{1}
{2}
{3}
{12}
{13}
{23}
{123}
 
		define a function
		void display(String s, String T, int N)
		in which  s represent the set, T represent the subset when N becomes zero

Algo for the function display

Step1 : if N becomes zero then print T and return otherwise go to step 2

Step2 : start a loop i from 0 to s.length()-1 and repeat step 3

Step3 : call the function display(s.substring(i+1),T+s.charAt(i),N-1)

Step4 : End

Algo for the main function

Step1 : Declare the required variables s for the set

Step2 : start a loop i from 0 to s.length() - 1 and repeat step 3

Step3 : execute the statement    display(s,"",i)

Step4 : end
*/
import java.io.*;
class Subsets
    {
        void display(String s,String T,int N)
        {
            if(N==0)
            {
            System.out.println("{"+T+"}");
            return;
            }
            for(int i=0;i<=s.length()-1;i++)
            display(s.substring(i+1),T+s.charAt(i),N-1);
        }
        public static void main(String args[])throws IOException
        {
            Subsets obj = new Subsets();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the set");
            String s = br.readLine();
            for(int i=0;i<=s.length();i++)
            obj.display(s,"",i);
        }
    }
