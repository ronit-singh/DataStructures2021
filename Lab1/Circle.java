


import java.util.Scanner;

public class Circle{
	
	public static void main(String[] args){

		double radius = 0;
		double diameter = 0;
		double perimeter = 0;


		Scanner input = new Scanner(System.in);
		System.out.println("Provide a radius");
		radius = input.nextDouble();

		perimeter = 2*Math.PI*radius;

		String s = "radius is" + radius;

		String s2 = "perimeter is" + perimeter;

		System.out.println(s);
		System.out.println(s2);

	}















}