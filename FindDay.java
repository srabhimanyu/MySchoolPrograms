/*
Enter the date
23/2/2011
Enter the day on First of Jan
SATURDAY
The desired day was
WEDNESDAY
*/
import java.io.*;
class FindDay
{

//this function extracts dd, mm and yy and returns one integer array of size 3
//at a[0] dd part is at a[1] mm part is and at a[2] yy part is
static int[] extract(String str)
{
int a[] = new int[3];
int count=0;
int c=0;
str = str + " ";
for(int i=0;i<=str.length()-1;i++)
{
char ch = str.charAt(i);
if(ch == '/' || ch == ' ')
{
a[count++] = Integer.parseInt(str.substring(c,i));
c = i + 1;
}

}
return a;
}
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
String dayN[]={"","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
int dd=0,mm=0,yy=0,p=0;
System.out.println("Enter the date");
String str = br.readLine();
System.out.println("Enter the day on First of Jan");
String day = br.readLine();

for(int i=1;i<=7;i++)
{
if(day.equals(dayN[i]))
p=i;
}
int b[] = extract(str);
dd = b[0];
mm=b[1];
yy=b[2];
int sum=0;
//checking for the leap year if it is length feb will be of 29 days
if(yy%4==0)
month[2] = 29;
// calculating total no of days up to the given date from the stating of the year.
for(int i=1;i<=mm-1;i++)
sum = sum + month[i];
sum = sum + dd;

sum = sum % 7;

sum = sum + p;
if(sum > 7)
sum = sum - 7;

sum = sum - 1;

System.out.println("The desired day was");
System.out.println(dayN[sum]);

}

}
