import java.io.*;
public class Fibonacci
{ 
static BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
static void fibo(int n) {
long[] F = new long[n+1];
F[0] = 0; F[1] = 1;
for (int i = 2; i <= n; i++)
F[i] = F[i-1] + F[i-2];
System.out.println(F[n]);
}
public static void main(String pr[])throws Exception
{System.out.println("no of terms");
int n=Integer.parseInt(dd.readLine());
fibo(n);
 }
}
        