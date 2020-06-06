

  import java.io.*;

   class output

   {

      int f=0;



     static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



      boolean check(String s,String s1)

      {

          if(s1.length()==0)
             return true;

            if(s.length()!=s1.length()&&f==0)  
              return false;

              f=1;
              

                          if(s.indexOf(s1.charAt(0))!=-1&&s.lastIndexOf(s1.charAt(0))!=-1&&
                 s.indexOf(s1.charAt(0))!=s.lastIndexOf(s1.charAt(0)))
                  return false;


               return check(s,s1.substring(1));


      }







      public static void main(String args[])throws Exception

      {

       output dd=new output();


      String a=br.readLine();

      String b=br.readLine();


        System.out.println(dd.check(a,b));









      }




























   }
