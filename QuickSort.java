/*
 Write a program to sort an array using
QuickSorting.
Input :
Enter array size
10
Enter array elements
10  9 2  4 6 5  7 3 8 1
Output:
The unsorted array is
10  9 2  4 6 5  7 3 8  1
The Sorted array is
1  2 3 4  5 6 7  8 9 10
 
Algo
Sort(a[],first,last)
where  a[]-> Represents the list of elements,
	   first-> Represents the position of the first element in the list
	   [only at the starting poind, it's value changes during the execution of the
	   function]
	   last->Represents the position of the last element in the list[Only at starting
	   point the value of it's changes during the execution of the function]

Step1: [initially]
	   low = first
	   high= last
	   pivot = a[(low+high)/2] [middle element of the list]
Step2: Repeat through step7 while(pivot > a[low])
Step3: Repeat Step4 while (a[high] > pivot)
Step4: low = low + 1
Step5: Repeat Step6 while (a[high] > pivot)
Step6: high = high - 1
Step7: if(low <= high)
	   a) temp = a[low]
	   b) a[low] = a[high]
	   c) a[high] = temp
	   d) low = low + 1
	   e) high = high - 1
Step8: if(high > first) Sort(a,first,high)
Step9: if(last > low)Sort(a,low,last)
Step10: End
*/
import java.io.*;
class QuickSort
{
	void Sort(int a[],int first,int last)
	{

		int temp=0,low=first,high=last,pivot=0;
		pivot = a[(first + last)/2];
		do{
			while(pivot > a[low])
			low++;
			while(a[high] > pivot)
			high--;
			if(low <= high)
			{
				temp = a[low];
				a[low++] = a[high];
				a[high--] = temp;
			}
		}while(low<=high);

		if(high > first)
		Sort(a,first,high);
		if(last > low)
		Sort(a,low,last);
	}
	public static void main(String args[])throws IOException
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int size=0,a[];
		 System.out.println("Enter the array size");
		 size = Integer.parseInt(br.readLine());
		 a = new int[size];
		 System.out.println("Enter the array elements");
		 for(int i=0;i<size;i++)
		 a[i] = Integer.parseInt(br.readLine());
		 QuickSort obj = new QuickSort();
		 System.out.println("The Unsorted array is");
		 for(int i=0;i<=size-1;i++)
		 System.out.print(a[i]+"  ");
		 System.out.println();
		 obj.Sort(a,0,size-1);
		 System.out.println("The Sorted array is");
		 for(int i=0;i<=size-1;i++)
		 System.out.print(a[i]+"  ");
	}
}