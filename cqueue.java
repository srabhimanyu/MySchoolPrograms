import java.io.*;

class CQueue
{  static int a[],size,f,r;

   CQueue(int n)
   {
	  size=n;
	  f=r=-1;
	  a=new int[n];
   }

  static void insert(int n)
  {
	   if((f==0 && r==size-1)||(r+1==f))
	    {
           System.out.println("CQueue is full");
           return;
	    }
       else if(f==-1) f=r=0;

	   else if(r==size-1) r=0;

	   else r++;

     a[r]=n;
  }

  static int delete()
  { int v=0;

	  if(f==-1) return f;

	  else if(f==r)
	  {
		  v=a[f]; f=r=-1; return v;
	  }

	  else
	  {
		  v=a[f]; f++; return v;
	  }
  }

  static void display()
  {
	  if(f==-1)
	  {
           System.out.println("CQueue is Empty");
           return;
	  }
     else if(f<r)
     {
		 System.out.println("The CQueue is ");

        for(int i=f; i<=r; i++)
	      System.out.print(a[i]+" ");
     }

     else
     {		 System.out.println("The CQueue is ");

	         for(int i=f; i<=size; i++)
	 	      System.out.print(a[i]+" ");

	 	      for(int i=0; i<=r; i++)
	 	      System.out.print(a[i]+" ");
	  }
  }
}