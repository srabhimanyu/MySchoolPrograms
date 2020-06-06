import java.io.*;
class Fractions
    {static int c=0;
        String seq(int a,int b)
        { int x=(a>b)?a:b;
          int y=(a>b)?b:a;
          if(c==0 && (a/b)==0 && x!=1 && y!=1)
           {  c++;
            return ""+(a/b)+","+seq(a/(b%a),b/(b%a));}
          if(x==1)
           {  c++;
             return ""+y+"";}
           if(y==1)
           {  c++;
              return ""+x+""; }
         c++;
        return ""+(x/y)+", "+seq(x%y,y);

        }
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a and then b");
            int a =Integer.parseInt(br.readLine());
            int b =Integer.parseInt(br.readLine());
            Fractions dd=new Fractions();
            System.out.println(dd.seq(a,b));
            }
    }
