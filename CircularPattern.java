import java.io.*;
public class CircularPattern {

	public static void main(String [] args)throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the odd no");

		int n=Integer.parseInt(br.readLine());

		int ar[][]=new int[n][n];
		int num=1;
		int x,y,xdiff,ydiff;
		y=0;
		x=n/2;
		xdiff=-1;
		ydiff=1;

		for (int i=(n-1)/2;i>0;i--){

			for (int k=1;k<=4;k++){

				for (int j=0;j<i;j++){
					ar[x][y]=num++;

					x+=xdiff;
					y+=ydiff;
				}

				if (k%2==0){
					ydiff*=-1;
				} else {
					xdiff*=-1;
				}

			}

			y++;

		}

		ar[n/2][n/2]=num;

		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				int a=ar[i][j];

				System.out.print(a==0?"   ": ((a<10?"  ":" ")+a) );
			}

			System.out.println();
		}

	}
}