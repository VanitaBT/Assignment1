package bootcamp.com;

import java.util.Scanner;

public class CelsToFaren {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Celsious Value:");
		double c=sc.nextDouble();
		double f=(c*(9/5))+32;
		System.out.println("The Farenheit is:"+f);
	}

}
