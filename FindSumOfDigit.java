public class FindSumOfDigit
{
  public static void main(String []args)
  {
    int num = 4543;
    getSumOfDigit(num);

  }

  public static int getSumOfDigit(int n)
  {
  	int sum= 0;

  	while(n >0 || sum > 9)
  	{
		if(n==0)
		{
			n = sum;
			sum=0;
		}
		sum+= n%10;
		n /= 10;
	}
	System.out.println(sum);

  	return sum;
  }
}