import java.util.Scanner;


public class Prime {
		
	//todo: write a method isPrime which tells you if a given number is a prime or not
	//then, write another method findDoublette which takes an integer value as input and 
	//is looking for the first prime-doublette it findes. A prime-doublette consists of
	//two prime values with the difference of 2 (e.g. 3 and 5).
	//The function should return the smaller one of the doublette. If there exists no
	//prime doublette between the given parameter and the maximal int-value (Integer.MAX_VALUE)
	//the function should return 0.
	static Scanner scan = new Scanner(System.in);
	static int n = scan.nextInt();
	public static boolean isprime(int n) {
		for(int i=2; i<n; i++) {
	 if(n%i==0) {
		return false;
	 		}
		}
		return true;
	}
	public static int findDoublette(int n) {
		
		for(int i= n; i<Integer.MAX_VALUE; i++) {
			boolean r = isprime(i);
			if(r) {
				int j=i+2;
				boolean r1= isprime(j);
				if(r1) {
				return i;
				}
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		isprime(n);
		System.out.println(isprime(n));
		System.out.println(findDoublette(n));
	}
	
}
