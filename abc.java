import java.io.*;

class abc

{


static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


String str;


int w;



abc(String s)

{

 str=s; 




}




void Count()

{

  if(str.length()>0){

     String P="AEIOU";

     String sub=str.substring(0,str.indexOf(' '));


    if(P.indexOf(sub.charAt(0))!=-1)w+=1;



     str=str.substring(str.indexOf(' ')+1);


     Count();



    }


}



public static void main(String args[])throws Exception


{


 System.out.println("enter the String");


 String s=br.readLine();



 abc dd=new abc(s);


 dd.Count();

System.out.println("w="+" "+dd.w);
 







}}




















