package bootcamp.com;

import java.util.Scanner;

public class SI {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		float r=sc.nextFloat();
		int t=sc.nextInt();
		float si=(p*r*t)/100;
		System.out.println("Simple interst is: "+si);
	}

}
