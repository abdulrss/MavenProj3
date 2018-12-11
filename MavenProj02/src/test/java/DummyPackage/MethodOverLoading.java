package DummyPackage;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	//Example of Method Overloading...method with same Names but with different nos of arguments or different arguments types
	//We can also Overload a Main Method using above principles
	//Cannot create a Method inside a Method
	
	public void sumMethod() {
		System.out.println("Sum method with no parameters");
	}
	
	public void sumMethod(int i) {
		System.out.println("Sum method with one parameter");
	}
	
	public void sunMethod(int i, int j) {
		System.out.println("Sum method with two parameters");
	}
	
	public void sumMethod(String s) {
		System.out.println("Sum method with diff argument type: String");
	}

}
