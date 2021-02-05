


import java.util.Scanner;
import java.lang.Math;

public class pNormClass{


	public static void main(String[] args){


		int dimension = 0;

		double  p_norm = 0;
		int pvalue = 0;
		


		Scanner input = new Scanner(System.in);

		System.out.println("This program computes the p-norm");

		System.out.println("Provide value for p");
		pvalue = input.nextInt();

		System.out.println("Provide vector dimension");
		dimension = input.nextInt();
		double[] vector = new double[dimension];
		System.out.println("Provide vector components");

		vector[0] = input.nextDouble();
		for(int i=1; i<dimension; i++){

			vector[i] = input.nextDouble();


		}	

		System.out.println("vector is");


		for(int i=0; i<dimension; i++){

			System.out.println(vector[i]);


			p_norm += Math.pow(vector[i], pvalue);


		}	

		p_norm = Math.pow(p_norm, 1.0/pvalue);

		System.out.println("value of the norm is");
		System.out.println(p_norm);




	}




}