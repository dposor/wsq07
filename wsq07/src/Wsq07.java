import java.util.Scanner;

public class Wsq07{

	public static void main(String finn[]){
		
		System.out.println("Hello, this program compute the square root of a number you choose, using the Babylonian method.");	
		
		System.out.println("Give me a number.");	
		Scanner usersNumber1 = new Scanner(System.in);
		int value = usersNumber1.nextInt();
		FinnNumber num1 = new FinnNumber(value);
		
		System.out.println("What is the number to start at?");	
		Scanner usersNumber2 = new Scanner(System.in);
		int start = usersNumber2.nextInt();
		num1.setPointX(start);
		
		System.out.println("How many iterations of the Babylonian method should be performed?");	
		Scanner usersNumber3 = new Scanner(System.in);
		int iterations = usersNumber3.nextInt();
		num1.setIterations(iterations);
		
		num1.calcBaby();		
		
		System.out.println("Using " + num1.iterations + " iterations of the Babylonian method leads to the result that the square root of " + num1.giveValue() + " is " + num1.x + ".");
	}	
}
