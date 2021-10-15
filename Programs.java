import java.util.*;
class Programs
{

     //program to reverse a string
     public static void reverseString(String s)
     {
		char[] temp = s.toCharArray();
		for(int i=temp.length-1 ; i>=0 ; i--)
		{
			System.out.print(temp[i]);
		}
	 }

	 //program to reverse Number
	 public static void reverseNumber(int number)
	 {
		int reverse =0;
		 while(number != 0)
		 {
			 int remainder = number % 10;
			 reverse = reverse * 10 + remainder;
 			 number = number/10;
		 }
		 System.out.print("Reverse Number"+ reverse);
	 }

	 //program to palimdrom Number
	 public static void palimdromNumber(int num)
	 {

		 int temp =num;
		 int rev=0;
		 while(num != 0)
		 {
			 int rem = num%10;
			 rev = num*10+rem;
			 num = num/10;
		 }
		 if(temp == rev)
		 {
			 System.out.println(""+ temp + " is palimdrom Number");
		 }
		 else
		 {
		     System.out.println(""+ temp + "Not palimdrom Number");
	 	 }

	 }

	 public static boolean isPrimeNumber(int num)
	 {
		if(num<=1)
			return false;
		else if(num==2)
			return true;
		else if(num%2==0)
			return false;

		for(int i=3 ; i<Math.sqrt(num); i++)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		return true;
	 }

	 public static boolean isLeap(int year)
	 {
		 if(( (year%4==0)&&(year%100 !=0) || (year%400 ==0)  ))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }

	 public static void greatesAmongNumber(int[] a, int total)
	 {
		 int high=a[0];
		 for(int i=1 ; i<total ; i++)
		 {
			 if(high < a[i])
			 {
				 high = a[i];
			 }
		 }
		 System.out.println("High Number" + high );
	 }


	public static void fibonasis(int n)
	{
		int n1=0,n2=1,counter=0;

		while(counter < n)
		{
			System.out.print(n1 + " ");
			int n3 = n1+n2;
			n1=n2;
			n2=n3;
			counter = counter + 1;
		}

	}

	// Function to print the fibonacci series
	static int fib(int n)
	    {
	        // Base Case
	        if (n <= 1)
	            return n;

	        // Recursive call
	        return fib(n - 1)
	            + fib(n - 2);
    }

    public static int findGCD(int a , int b)
    {
		if(b == 0)
		{
			return a;
		}
		else
		{
			return findGCD(b, a%b);
		}
	}

	public static long findHCF(long a,long b)
	{
		while(b>0)
		{
			long temp = b;
			b= a%b;
			a=temp;
		}
		return a;
	}

	//Main Method start here......
	public static void main(String args[])
	{
		System.out.println(" ");
       reverseString("hello java");
       System.out.println(" ");

       reverseNumber(234);
		System.out.println(" ");
	   palimdromNumber(1234);
 		System.out.println(" ");

	   boolean prime = isPrimeNumber(12);
	   if(prime) {
		 System.out.println("12 is prime Number");
	    }
	    else{
		 System.out.println("12 Not prime Number");
		}

		if(isLeap(2005))
		{
			System.out.println("2005 is Leap Number");
		}
		else
		{
			System.out.println("2005 is Not Leap Number");
		}

		int a[]={1,2,5,6,3,2};
		int b[]={44,66,99,77,33,22,55};
		greatesAmongNumber(b, b.length);

		fibonasis(10);

		System.out.println(" ");

		// Given Number N
        int N = 10;

        // Print the first N numbers
        for (int i = 0; i < N; i++) {

            System.out.print(fib(i) + " ");
        }

        System.out.println("");

        int GCDResult = findGCD(98,56);
        System.out.println("98 and 56 GCD are: " + GCDResult);


        System.out.println("");
		long HCFResult = findHCF(625,125);
        System.out.println("4 and 16 HCF are: " + HCFResult);

	}
}