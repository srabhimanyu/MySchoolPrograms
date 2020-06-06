import java.io.*;
class DaysElapsed
{
public static void main(String args[])throws IOException
{
String str="",str1="";
int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
int dd=0,mm=0,yy=0,dd1=0,yy1=0,mm1=0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first date in dd/mm/yyyy format");
str = br.readLine();
System.out.println("Enter the second date in dd/mm/yyyy format");
str1 = br.readLine();
int first[] = get(str);
dd=first[0];mm=first[1];yy=first[2];
int second[] = get(str1);
dd1=second[0];mm1=second[1];yy1=second[2];
int Total=0;
if((yy> yy1) || (yy==yy1 && mm > mm1)||(yy==yy1 && mm == mm1 && dd > dd1))
{
yy = yy + yy1;
yy1 = yy - yy1;
yy = yy - yy1;

mm = mm + mm1;
mm1 = mm - mm1;
mm = mm - mm1;

dd = dd + dd1;
dd1 = dd - dd1;
dd = dd - dd1;

}
if(yy1%4==0)
month[2] = 29;

if(yy == yy1 && mm == mm1)
{
Total = dd1 - dd;
System.out.println("Days elapsed "+Total);
return;
}

if(yy == yy1)
{

Total = month[mm] - dd;
for(int i=mm+1;i<=mm1-1;i++)
Total = Total + month[i];
Total = Total + dd1;
System.out.println("Days elapsed "+Total);
return;
}

Total = month[mm] - dd;
for(int i=mm+1;i<13;i++)
Total = Total + month[i];

for(int i=yy+1;i<=yy1-1;i++)
{
if(i%4!=0)
Total = Total + 365;
else
Total = Total + 366;
}
if(yy1 %4==0)
month[2] = 29;
else
month[2] = 28;

for(int i=1;i<=mm1-1;i++)
Total = Total + month[i];

Total = Total + dd1;
System.out.println("Days elapsed "+Total);
}

static int[] get(String s)
{
s=s+" ";
int a[]= new int[3];
int count=-1;
int c=0;
for(int i=0;i<=s.length()-1;i++)
{
char ch = s.charAt(i);
if(ch==' '||ch=='/')
{
a[++count] = Integer.parseInt(s.substring(c,i));
c=i+1;
}
}
return a;
}
}

