
/*
Enter the NO.
5
The output is
1 2 6 7 15
3 5 8 14 19
4 9 13 18 20
10 12 17 21 24
11 16 22 23 25

Enter the NO.
7
The output is
1 2 6 7 15 16 28
3 5 8 14 17 27 34
4 9 13 18 26 33 35
10 12 19 25 32 36 43
11 20 24 31 37 42 44
21 23 30 38 41 45 48
22 29 39 40 46 47 49
**/



import java.io.*;
class zigzag
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the NO.");
int N = Integer.parseInt(br.readLine());
int a[][] = new int[N][N];
int cc=1;
for(int i=0,j=0;i<=N-1;i++,j++)
{
if(i%2==0)
{
for(int k=i,l=0;k>=0;k--,l++)
a[k][l]=cc++;

}
else
{

for(int k=0,l=j;l>=0;k++,l--)
a[k][l]=cc++;

}
}

for(int i=1,j=1;i<=N-1;i++,j++)
{

if(i%2==0)
{
for(int k=i,l=N-1;k<=N-1;k++,l--)
a[k][l]=cc++;


}
else
{

for(int k=N-1,l=j;k>=i;k--,l++)
a[k][l]=cc++;

}
}


System.out.println("The output is");
for(int i=0;i<=a.length-1;i++)
{
for(int j=0;j<=a[0].length-1;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}


}
}
