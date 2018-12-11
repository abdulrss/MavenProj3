package DummyPackage;

public class FunctionsAndMethods {
	
	String globalVar = "Global variable";	//this is Non Static Global Variable, so available directly in a Non Static Method. 
											//For Static method, this will have to be pulled in via the Class Object (functionsAndMethods.globalVar)

	public static void main(String[] args) {
		FunctionsAndMethods functionsAndMethods = new FunctionsAndMethods();  //Class: Object Reference: Object
		
		functionsAndMethods.printMe();
		
		int returnSum = functionsAndMethods.sumMethod();
		System.out.println(returnSum);
		
		String s1 = functionsAndMethods.returnValue();
		System.out.println(s1);
		
		int returnMulitply = functionsAndMethods.multiplyMethod(5, 4);
		System.out.println(returnMulitply);
		
	}
	
	public void printMe() {			//No input, No output Method
		System.out.println("I am from a Method");
		System.out.println(globalVar);
	}
	
	public int sumMethod() {		//No input, some output method
		int a=10;
		int b=20;
		int c= a+b;
		return c;
	}
	
	public String returnValue() {		//No input, some output method
		String s= "I am a returned String from a method";
		return s;
	}
	
	public int multiplyMethod(int x, int y) {
		int z = x*y;
		return z;
	}

}
