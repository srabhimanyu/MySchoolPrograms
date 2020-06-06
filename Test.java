
 import java.io.*;

 import java.util.*;

  class Test

  {





    String str;int w;

    Test(String s)

    {
      str=s+" ";
      w=0;

      }



     void Count()

     {


      if(str.length()==0)
       return;


     String P="AEIOU";

     int l=str.indexOf(' ');

     if(P.indexOf(str.charAt(0))!=-1)

       w=w+1;


      str=str.substring(l+1);


      Count();

      }



      public static void main(String args[])throws Exception

      {

      String s="";


      System.out.println("Enter the sentence");


             s="India is my country"; // for accepting word


        Test dd=new Test(s);


        dd.Count();


        System.out.println("w="+dd.w);




    




      }
























  }
