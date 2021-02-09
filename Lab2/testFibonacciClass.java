import java.util.Scanner;

public class testFibonacciClass{



 public static void main(String[] args){


    FibonacciProgression newFibonacciProgression;
 

    newFibonacciProgression = new FibonacciProgression(2, 2) ;


    long x = newFibonacciProgression.returnCurrent();

    System.out.print(x);
    System.out.print(" ");
    newFibonacciProgression.advance2();
    x = newFibonacciProgression.returnCurrent();
    System.out.print(x);

    for(int i=0; i<=20; i++){

    	System.out.print(" ");
    	newFibonacciProgression.advance2();
    	x = newFibonacciProgression.returnCurrent();
		System.out.print(x);


    }

    System.out.println(" ");




    //System.out.println(newFibonacciProgression.current); 

 }






}