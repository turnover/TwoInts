import java.util.Scanner;


public class TwoInts 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		
		int num1;
		int num2;
		
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		
		System.out.printf("Hello, you entered %d and %d.", num1, num2);
	}

}
