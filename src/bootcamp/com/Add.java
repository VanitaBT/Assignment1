package bootcamp.com;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		int x=sc.nextInt();
		System.out.println("Enter Second Number");
		int y=sc.nextInt();
		
		int z=x+y;
		
		System.out.println("The Addition of two numbers:"+z);
	}

}
