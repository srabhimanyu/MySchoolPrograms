/*Gray codes. An order n Gray code is an n-bit encoding of the integers 0 to 2n - 1 such that adjacent numbers differ in only one bit. The following is a 3-bit Gray code.
000 001 011 010 110 111 101 100
0 1 3 2 6 7 5 4

Input:
Enter the number
5
Output:
00000
00001
00011
00010
00110
00111
00101
00100
01100
01101
01111
01110
01010
01011
01001
*/
import java.io.*;
public class GrayCode {


static void yarg(String prefix, int n) {
if (n == 0) System.out.println(prefix);
else {
gray(prefix + "0", n - 1);
yarg(prefix + "1", n - 1);
}
}


static void gray(String prefix, int n) {
if (n == 0) System.out.println(prefix);
else {
gray(prefix + "0", n - 1);
yarg(prefix + "1", n - 1);
}
}

public static void main(String[] args)throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number");
int N = Integer.parseInt(br.readLine());
gray("", N);
}

}


