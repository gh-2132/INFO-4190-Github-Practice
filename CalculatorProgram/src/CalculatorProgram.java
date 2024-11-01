import java.util.Scanner;

// This is a simple calculator app
// The independent features will be: add, subtract, multiply, and divide

public class CalculatorProgram {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		CalculatorProgram calc = new CalculatorProgram();
		
		int input = 0;
		double a;
		double b;
		// You can keep going until you quit
		while(input != 5) {
			System.out.println("What do you want to do?");
			System.out.println("1: Add");
			System.out.println("2: Subtract");
			System.out.println("3: Multiply");
			System.out.println("4: Divide");
			System.out.println("5: Quit");
			
			input = scan.nextInt();
			
			switch(input) {
				
				case 1:
					System.out.println("Type two numbers to add");
					a = scan.nextDouble();
					b = scan.nextDouble();
					System.out.println(a + " + " + b + " = " + calc.add(a, b));
				break;
				
				case 2:
					System.out.println("Type two numbers to subtract");
					a = scan.nextDouble();
					b = scan.nextDouble();
					System.out.println(a + " - " + b + " = " + calc.subtract(a, b));
				break;
				
				case 3:
					System.out.println("Type two numbers to multiply");
					a = scan.nextDouble();
					b = scan.nextDouble();
					System.out.println(a + " * " + b + " = " + calc.multiply(a, b));
				break;
				
				case 4:
					System.out.println("Type two numbers to divide");
					a = scan.nextDouble();
					b = scan.nextDouble();
					System.out.println(a + " / " + b + " = " + calc.divide(a, b));
				break;
				
				case 5:
					System.out.println("Exiting");
				break;
				
				default:
					System.out.println("Choose between 1-5");
					input = scan.nextInt();
				break;
			}
		}	
	}
	public double add(double a, double b) {
		return a + b;
	}
	public double subtract(double a, double b) {
		return a - b;
	}
	public double multiply(double a, double b) {
		return a * b;
	}
	public double divide(double a, double b) {
		return a / b;
	}
}