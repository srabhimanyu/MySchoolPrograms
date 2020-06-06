import java.io.*;
public class Factors
{
public static void main(String[] args)throws Exception
  {
	BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));

System.out.println("enter the no.");
 // Print the prime factors of N.
long N = Long.parseLong(dd.readLine());
long n = N;

int j;
for ( j = 2; j <= N/j; j++)
if (N % j == 0) break;
if (j > N/j) System.out.println(N + " is prime");
else  System.out.println(N + "  Not a prime");

/* for (long i = 2; i <= n/i; i++)

   { // Test whether i is a factor.

       while (n % i == 0)

        { // Cast out and print i factors.

            n /= i;

           System.out.print(i + " ");

        } // Any factors of n are greater than i.

     }


          if (n > 1) System.out.print(n);

        System.out.println();    */
}
}