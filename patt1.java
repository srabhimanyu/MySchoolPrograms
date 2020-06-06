import java.io.*;

class patt1

{

public static void main(String args[])throws Exception

{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


System.out.println("enter the odd size");

int N=Integer.parseInt(br.readLine());

int ar[][]=new int[N][N];

int r=0,c=0,q=N/2+1;

int a=0;

r=c=N/2;

a=q;


int k=1;

for(int i=r;i<N;i++)ar[i][c]=k++;


int i=1;


r=N-1;c++;

   


  for(int b=0;b<q;b++)ar[r--][c]=k++;



 for(int b=1;b<a;b++)ar[r][c--]=k++;



  for(int b=0;b<q;b++)ar[++r][c+1]=k++;



  


  






















for(int cc=0;cc<N;cc++){


for(int j=0;j<N;j++){

if(ar[cc][j]<=9)

 System.out.print("  "+ar[cc][j]);


 else

 System.out.print(" "+ar[cc][j]);



}


System.out.println();

}


}


}












