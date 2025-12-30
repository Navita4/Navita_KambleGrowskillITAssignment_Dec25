package loopprogram;

public class Assignment_PrintfactorofNumber {

	public static void main(String[] args) {
		int number=12;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.println("The Factor of number is ="  +i);
			}
		}
		

	}

}
