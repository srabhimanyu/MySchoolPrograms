import java.io.*;
public class insertnode extends node
 {
	insertnode(int q)
	 { super(q);
	 }

   static BufferedReader dd =new BufferedReader(new InputStreamReader(System.in));

	 insertnode insert(int d, insertnode root)throws Exception
	 {  int c=0;
		 insertnode s,t;
		 System.out.println("Enter the Choice \n 1 ... Begining \n 2 ... End \n 3 ... middle");
		 c=Integer.parseInt(dd.readLine());
		 s=root;

		 if(c==0)
		 {
			 t = new insertnode(d);
             t.next=root;
             return t;
		 }
		 else if(c==2)
		 {  while (s.next!=null)
		     s=s.next;
		     t= new insertnode(d);
	    	 s.next=t;
			 return root;
	     }
	     else if(c==3)
	     {
			 int dd1=0, f=0;
			 System.out.println(" After which node data you want to enter");
			 dd1=Integer.parseInt(dd.readLine());
			 while (s.next!=null)
			 { if(s.data==dd1)
			    {
					t= new insertnode(d);
			        t.next=s.next;  s.next=t;
			        f=1; break;
				}
			   s=s.next;
		      }
		      if(f==0) System.out.println(" The specified node not found ");
			  return root;
		  }
		  else
		  {
			  while (s.next!=null)
		        s=s.next;
		        t= new insertnode(d);
	    	    s.next=t;
			    return root;
		   }
	}
}

