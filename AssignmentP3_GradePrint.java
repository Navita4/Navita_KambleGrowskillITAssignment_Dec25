package loopprogram;

public class AssignmentP3_GradePrint {

	public static void main(String[] args) {
		float marks=83.23F;
		if(marks<=100)
		{
			if(marks>=90)
			{
				System.out.println("Grade is A");
			}
			else if(marks>=75)
			{
				System.out.println("Grade is B");
			}
			else if(marks>=50)
			{
				System.out.println("Grade is C");
			}
			else
			{
				System.out.println("Fail");
			}
		}

	}

}
