import java.util.Scanner;

public class Circle {
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
	//diameter 2r; area of circle pir^2; circumference 2* pi* r;
	static Scanner scan = new Scanner(System.in);
	static float r = scan.nextInt();

	
	public static double diameter() {
		return 2* r;
	}
	public static double circumference() {
		return 2*Math.PI* r ;
	}
	public static double area() {
		return  Math.PI*r*r;
	}
	public static void main(String[] args) {
		double d = diameter();
		double c = circumference();
		double A = area();
		System.out.println("diameter of a circle ="+ d);
		System.out.println("circumference of a circle ="+ c);
		System.out.println(" area of a circle = "+ A );
	}
	
	
	
}

