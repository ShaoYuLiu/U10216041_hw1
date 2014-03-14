import java.util.Scanner;

public class TestFunction {
	public static void main(String[] args){
		// ask the user to key the argument.
		System.out.println("Please enter the x: ");
		// new the scanner
		Scanner input = new Scanner(System.in);
		// let the argument that keyed by user becomes x
		double x = input.nextDouble();
		// create the object
		Function1 f1 = new Function1();
		Function2 f2 = new Function2();
		Function3 f3 = new Function3();
		Function4 f4 = new Function4();
		Function5 f5 = new Function5();
		Function6 f6 = new Function6();
		Function7 f7 = new Function7();

		// print out the answers and use the method in these class
		System.out.println(x + "^2 = " + f1.f(x));
		System.out.println("sin" + x + " = " + f2.f(x));		
		System.out.println("cos" + x + " = " + f3.f(x));		
		System.out.println("tan" + x + " = " + f4.f(x));		
		System.out.println("cos" + x + "+5sin" + x + " = " + f5.f(x));		
		System.out.println("5cos" + x + "+sin" + x + " = " + f6.f(x));		
		System.out.println("log" + x + "+" + x + "^2" + " = " + f7.f(x));
	}
}
