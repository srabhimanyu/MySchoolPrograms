import java.io.*;
public class common
{
        int present(String sub1,String str1)
        {
        if(sub1.length()>str1.length())
        return 0;
        if(str1.substring(0,sub1.length()).equalsIgnoreCase(sub1))
        return 1;
        else
        return present(sub1,str1.substring(1));
        }


public static void main (String br[])throws Exception
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
String sub="",str="",x="",subcopy="",com="",com1="";
common obj=new common();int a=0,k=0,b=0;
System.out.println("enter first string");
sub=ob.readLine();
System.out.println("enter second  string");
str=ob.readLine();
if(sub.length()>str.length())
{
x=str;
str=sub;
sub=x;
}
subcopy=sub;



        while(sub.length()!=0)
        {
                k=obj.present(sub,str);
                  if(k==1)
           {
                com=sub;System.out.println("enter first string");
                break;
           }
                else
                {
                sub=sub.substring(0,a-1);
                }
        }

                      b=subcopy.length();
                while(b!=0)
                {
                k=obj.present(subcopy,str);


                if(k==1)
                {
                com1=subcopy;
                break;
                }
                else
               { subcopy=subcopy.substring(1);
                  b=b-1;}
                }



if(com.length()>=com1.length())
System.out.println("Largest subsequence is   " + com);

if(com.length()<com1.length())
System.out.println("Largest subsequence is  " + com1);
}
}





