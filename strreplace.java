/*
 Write a program to replace each and
every occurance of a substring by
another substring.
Input:
Enter the String
india is my country and all indians are
my brothers and sisters
Enter the substring1
india
Enter the substring2
Hind
Output:
The Original String is
india is my country and all indians are
my brothers and sisters
The resultant string is
Hind is my country and all Hindns are
my brothers and sisters
 
Algo
Step1: Declare the required variables str is for the main string,
	   sub is for the substring to be replaced and rep is for the string which
	   will replace sub.
	   Define a recursive function
	   String replace(String str,String sub,String rep,String result)
	   with four parameters(main string, substring1, substring2,resultant string)

	   [Algo for the main function replace()]
Step2: if sub.length() becomes more than the length of the main string then go to
	   Step 3 otherwise go to step 4
Step3:
		a)result will get appended with str and return result(resume from step 7)
Step4:  if str.substring(0,sub.length()) matches with sub then go to step 5 otherwise go to step 6

Step5: a) result will get appended by rep
	   b) Delete the substring sub from the main string by executing the statement
	   	  str = str.substring(sub.length())
	   c) call the function replace(str,sub,rep,result) again
Step6: a) append the result by the first letter of the main string
	   b) remove the first letter from the main string
	   c) call the function replace(str,sub,rep,result) again
Step7: Print the value retured by the function replace()
Step8: End
*/
import java.io.*;
    class strreplace
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "",sub="",rep="",result="";
            System.out.println("Enter the string");
            str = br.readLine();
            System.out.println("Enter the substring1");
            sub = br.readLine();
            System.out.println("Enter the substring2");
            rep = br.readLine();
            strreplace obj = new strreplace();
            result = obj.replace(str,sub,rep,result);
            System.out.println("The original string is \n"+str);
            System.out.println("The resultant string is \n"+result);
        }
           String replace(String str,String sub,String rep,String result)
           {
                if(sub.length() > str.length())
                {
                    result = result + str;
                    return result;
                }
                if(str.substring(0,sub.length()).equals(sub))
                {
                    result = result + rep;
                    str = str.substring(sub.length());
                    return replace(str,sub,rep,result);
                }
                else
                {
                    result = result + str.charAt(0);
                    str = str.substring(1);
                    return replace(str,sub,rep,result);
                }
           }
    }