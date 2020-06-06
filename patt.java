import java.io.*;
class patt
{
public static void main(String args[])throws Exception
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

   System.out.println("enter the odd no");

  int N=Integer.parseInt(br.readLine());
  int r=0,c=1,k=0;

  int ar[][]=new int[N][N];

  r=c=N/2; k=1;

int a=3,q=N/2+1;

for(int i=r;i<N;i++)ar[i][c]=k++;  r=N-1;c++;

 for(int i=1;k<=N*N;i++)
  {
     if(i%2!=0){

   for(int b=0;b<q;b++)ar[r--][c]=k++;

   for(int b=1;b<=a;b++)ar[r][c--]=k++;  c=c+1;

   for(int b=0;b<q;b++)ar[++r][c]=k++;   a+=2;q+=1;

  }

    else{      c=c-1;

   for(int b=0;b<q;b++)ar[r--][c]=k++;


   for(int b=0;b<a;b++)ar[r][c++]=k++;


   for(int b=r+1;b<N;b++)

    {   ar[b][c-1]=k++; r=b;  }

        a+=2;q+=1;

     }

  }

  for(int i=0;i<N;i++)
  {
    for(int j=0;j<N;j++)
    {
     if(ar[i][j]<10) System.out.print("  "+ar[i][j]);

     else System.out.print(" "+ar[i][j]);
    }
   System.out.println();
  }


  }
}
