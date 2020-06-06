import java.io.*;
public class LinkedList extends node
 {
	 LinkedList(int q)
	 { super(q);
	 }
	 public static void main(String[] args)throws IOException
    {  BufferedReader dd =new BufferedReader(new InputStreamReader(System.in));
       int d=0, n=0;
       LinkedList root,s,temp;
       System.out.println("enter the root data");
       d = Integer.parseInt(dd.readLine());
       root = new LinkedList(d);
       System.out.println("enter enter total no. of node you want to create after Root Node ");
       n = Integer.parseInt(dd.readLine());
       s=root ;
       for ( int i =0; i <n ; i ++ )
         { System.out.println("enter the data ");
           d =  Integer.parseInt(dd.readLine());
           temp = new LinkedList(d);
           s.next=temp; s=temp ;
          }   s =root ;
         root.display (s);
    }

static void display (node s)
  {
	System.out.println(" The linked list is as follows ");
        while (s!=null )
        { System.out.println(s.data +"  ");
           s=s.next;
        }
  }
}