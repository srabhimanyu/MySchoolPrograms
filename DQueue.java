import java.io.*;

 public class DQueue
{
static int a[],size,f,r;
static BufferedReader dd =new BufferedReader(new InputStreamReader(System.in));

  DQueue(int n)
  {
	  size=n;
	  f=r=-1;
	  a=new int[n];
  }

static void insert(int n)
  {
	  if(f==0 && r==size-1)
	  {
           System.out.println("DQueue is full");
          return;
	  }
      else if(f==-1)  f=r=0;

      else if(f>0)  f--;

      else r++;

    a[f]=n;
  }

static int delete()throws Exception
  { int c=0,v=0;

	  if(f==-1) return f;

	  else if(f==r)
	  {
		  v=a[f]; f=r=-1;
      }

      else
	  {
		 System.out.println("Enter 0 to Delete from Front ");
           c=Integer.parseInt(dd.readLine());

           if(c==0) { v=a[f]; f++; }
           else     { v=a[f]; r--; }

	   }
      return v;
  }

static void display()
   {
	   System.out.println("DQueue is -");
	   if(f==-1)
       {
		   System.out.println("Empty");
	       return;
	   }
	 for(int i=f; i<=r; i++)
	 System.out.print(a[i]+" ");
   }
}

