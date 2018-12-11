package DummyPackage;

public class CallByValueAndReference {

	public static void main(String[] args) {
		
		CallByValueAndReference callByVnR = new CallByValueAndReference();
		
		int retC = callByVnR.sumMethod(5, 10);
		System.out.println(retC);		//this is called as Return By Value or Pass By Value

	}
	
	public int sumMethod(int a, int b) {
//		a = 20;
//		b = 25;
		int c = a+b;
		return c;
	}

}
