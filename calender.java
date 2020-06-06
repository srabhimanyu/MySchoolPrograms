import java.io.*;
class calender
{
static int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};

//This function returns the starting day ofthe month
//and takes two parameters m is for the month No and p is for the starting day of the year.
//sunday is the first day of the weak and which is 1.
static int dat(int m,int p)
{
int T=0;
for(int i=1;i<=m-1;i++)
T=T+month[i];
T=T+p;
return((T%7==0)?7:T%7);
}

public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int year=0,c=0,count=0,p=0,pp=0;
String dayName=" ";
String monthN[]={"","JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
String days[]={"","SUN","MON","TUE","WED","THU","FRI","SAT"};
System.out.println("Enter the Year");
year=Integer.parseInt(br.readLine());
System.out.println("Enter the Day on First Jan");
dayName=br.readLine();
for(int i=1;i<=7;i++)
{
if(dayName.equalsIgnoreCase(days[i]))
{
p=i;
break;
}
}

if (year%4==0)
month[2]=29;
for(int i=1;i<=12;i++)
{
System.out.println(monthN[i]+" ");
for(int j=1;j<=7;j++)
System.out.print(days[j]+"\t");
System.out.println();
c=count=dat(i,p);
pp=1;
for(int k=1;k<=c-1;k++)
System.out.print("\t");
while(pp<=month[i])
{
System.out.print((pp++)+"\t");
count=count+1;
if(count==8)
{
count=1;
System.out.println();
}
}
System.out.println("\n");
}

}
}




