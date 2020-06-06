import java.io.*;
public class ddapatern
{ public static void main(String pr[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter no.of rows ");
int r = Integer.parseInt(dd.readLine());
System.out.println("enter no.of colummn ");
int c = Integer.parseInt(dd.readLine());
int  A[][]=new int[r][c],i,j;
System.out.println("enter no one by one ");
for(i=0;i<r;i++)
{ for(j=0;j<c;j++)
 {
A[i][j]=i+11;}}
System.out.println("***************************************************");
for(i=0;i<r;i++)
{ for(j=0;j<c;j++)
 {
System.out.print(A[i][j]+" ");}
System.out.println();}
System.out.println("***************************************************");
for(i=0;i<r;i++)
{ for(j=0;j<c;j++)
 { if(j==0||i==r-1||i==0 || j==r-1 || i==j || i+j==c-1)//(j==0||i==r-1||i==0 || j==r-1 || i==j || i+j==c-1)j+i==r/2||j-i==r/2||i-j==r/2
    System.out.print(A[i][j]+""); //||i+j==r/2
     else
     System.out.print("  ");
}
System.out.println();}
System.out.println("***************************************************");
    }
}