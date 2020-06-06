
  import java.io.*;


   class fill

   {


   static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


     public static void main(String args[])throws Exception

     {

       int N=0;

       System.out.println("Enter  odd size");


        N=Integer.parseInt(br.readLine());


         if(N%2==0)

         {

         System.out.println("Kindly Input Odd no");

           return ;

           }


           int a[][]=new int[N][N];


           int r=N/2,c=N/2,k=N/2;

             int d=3,b=1;


             for(int i=0;b<=N*N;i++)

             {


              while(r<N)

              a[r++][c]=b++;

               r--;

              if(i%2==0)
                c++;

                else
                 c--;


               while(r>=k)

               a[r--][c]=b++;


               if(i%2==0)

               {

               for(int J=1;J<=d;J++)
               a[r][c--]=b++;

                 c=c+1;


              }

               else

               {

               for(int J=1;J<=d;J++)
                a[r][c++]=b++;

                 c--;


               }




               while(r<N)
                {

                if(a[r++][c]==0)
                  a[r][c]=b++;

               }

                 k--;

                  d=d+2;


                }



                for(int i=0;i<N;i++)

                {


                for(int J=0;J<N;J++)

                 

                   System.out.print(a[i][J]+"\t");

                   


                   System.out.println();


                   }



                 }


                 }
