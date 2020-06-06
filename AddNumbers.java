/*
 Write a program to add two numbers
of any Number System ( Generic
Code) 

Algo

	Define a recursive function
	String add(String first, String second)
	with two arguments first and second representing two numbers of any number system along with
	String return type

Step 1:	Declare the required variables base for the base of the number system
		str is for the first number , str1 is for the second number , result is for the result,
		f is for the status , z is for the carry , x is for the possible digits of the number system
		N is for the length of the numbers and p is for the sum of the digits with carry

Step 2: Input two numbers
Step 3:	call the function add(String first, String second)

Step 4:	Perform the following
		a) calculate the value of N as length of the number [ N = first.length]
		b) if the length of first and second both becomes zero return "" ( to the calling code as Step 5)
		   otherwise go to sub step c
		c) if the length of first is more than second then
		   append "0" in front of second and call the function add() otherwise go to sub step d
		d) if the length of second is more than first then
		   append "0" in front of first and call the function add() otherwise go to sub step e
		e) if the length of both the numbers is same and the status f is 0 then
		   append "0" in both these numbers change the status f to 1 and call the function add()
		   otherwise go to sub step f
		f) evaluate
		   a) p = z + x.indexOf(first.charAt(N-1)) + x.indexOf(second.charAt(N-1))
		   b) z = p / base;
		   c) return add(first.substring(0,N-1),second.substring(0,N-1))+""+x.charAt(p%base);


Step 6:	Print the result

Step 7:	End
*/
import java.io.*;
class AddNumbers
    {
    static int f=0;
    static int base =0,z=0;
            String add(String first,String second)
            {
                String x = "0123456789ABCDEF";
                int N = first.length();
                if(first.length() == 0 || second.length()==0)
                return "";
                else if(first.length() > second.length())
                return add(first,"0"+second);
                else if(second.length() > first.length())
                return add("0"+first,second);
                else if(first.length() == second.length()&& f==0)
                {
                f=1;
                return add("0"+first,"0"+second);
                }
                else
                {
                int p = z + x.indexOf(first.charAt(N-1)) + x.indexOf(second.charAt(N-1));
                z = p / base;
                return add(first.substring(0,N-1),second.substring(0,N-1))+""+x.charAt(p%base);
                }
            }
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str="",str1="",Result="";
            System.out.println("Enter the first No.");
            str = br.readLine();
            System.out.println("Enter the second No.");
            str1 = br.readLine();
            System.out.println("Enter the base");
            base = Integer.parseInt(br.readLine());
            z=0;
            AddNumbers obj = new AddNumbers();
            String result = obj.add(str,str1);
            System.out.println("The Result is "+result);
        }
    }