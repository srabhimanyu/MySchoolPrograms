import java.io.*;

class series


{

public static void main(String ars[])throws Exception


{


BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));

System.out.println("enter the Number");

int N=Integer.parseInt(ob.readLine());


int a=1,b=1,c=2,d=0,sum=0,sum1=0;



if(N==1)

System.out.print(a);


else if(N==2)

System.out.print(a+" "+b);


else

System.out.print(a+" "+b+" "+c);



System.out.print(" ");

for(int i=1;i<=(N-3);i++)

{

 sum=a+c;


 System.out.print(sum);

 System.out.print(" ");


 sum1=b+sum;

a=b;d=sum;

b=c;c=d;


sum=sum1;






}







 }



 }
