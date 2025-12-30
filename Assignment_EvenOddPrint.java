package loopprogram;

public class Assignment_EvenOddPrint {

	public static void main(String[] args) {
		int number=24879;
		int evenCount=0;
		int oddCount=0;
		while(number>0)
		{
			int rem=number%10;
			if(rem%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			number=number/10;

	}
		System.out.println("The even number count is =" +evenCount);
		System.out.println("The odd number count is =" +oddCount);

		
}
}