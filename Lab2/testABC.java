public class testABC {


	
	public static void main(String[] args){

		C objectC = new C();
	
		int xC = objectC.accessMyx();
		int xB = objectC.accessxParent();
		int xA = objectC.accessxGrandParent();

		System.out.println(xA);
		System.out.println(xB);
		System.out.println(xC);


	}





}