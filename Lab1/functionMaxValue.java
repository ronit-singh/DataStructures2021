


public class functionMaxValue{


	public static int f(int x){

  		int result;
  		result = -x*x + 3*x - 2;
  		return result;
}


	public static void main(String[] args){


		int valueFunction = 0;

		int[] funArray = new int[11];


		int currentValue = f(-5);

		for (int j=-5; j<=5; j++){


			valueFunction = f(j);


			if (valueFunction > currentValue){

				currentValue = valueFunction;

			}
				
			funArray[j+5] = valueFunction;

			System.out.println(valueFunction);
		}

		System.out.println("Max value of f is :" + currentValue);


	}


}