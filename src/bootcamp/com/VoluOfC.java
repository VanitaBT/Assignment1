package bootcamp.com;

import java.util.Scanner;

public class VoluOfC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius value");
		double r=sc.nextDouble();
		System.out.println("Enter height value");
		double h=sc.nextDouble();
		double v=3.14*r*r*h;
		System.out.println("The volume of Cylinder is: "+v);
	}

}
