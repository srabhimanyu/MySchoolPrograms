//Some Recursive functions

class Recursion
{
	//Function to calculate the sum of the digits

	int sumofd(int N)
	{
		if(N==0)
		return 0;
		return N%10+sumofd(N/10);
	}

	//Function for the Nth fibonacci term(The current term will be the sum of last two term

	int fibo(int N)
	{
		if(N==1)
		return 0;
		else if(N==2)
		return 1;
		else
		return fibo(N-1) + fibo(N-2);
	}

	//Function for the Nth Tribonacci term(The current term will be the sum of last three terms)
	int Tribo(int N)
	{
		if(N==1)
		return 0;
		else if(N==2)
		return 1;
		else if(N==3)
		return 1;
		else
		return Tribo(N-1) + Tribo(N-2) + Tribo(N-3);
	}
	//Recursive power function
	double power(int a,int b)
	{
		if(b == 0)
		return 1.0;
		else if(b > 0)
		return a*power(a,b-1);
		else
		return power(a,b+1)/a;
	}
	// Recursive factorial function

	double factorial(int a)
	{
		if(b==0)
		return 1.0;
		return a*power(a-1);
	}

	//Recursive HCF function

	int HCF(int a,int b)
	{
		if(b==0)
		return a;
		else if(b > a)
		return HCF(b,a);
		else
		return HCF(b,a%b);
	}

}