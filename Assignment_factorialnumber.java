package loopprogram;

public class Assignment_factorialnumber {

	public static void main(String[] args) {
		int number=5;
		int i, fact=1;
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of number is =" +fact);

	}

}
