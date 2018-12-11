package DummyPackage;

public class Car {
	
	int model;
	int wheel;
	

	public static void main(String[] args) {
		
		Car a = new Car();  //new Car() is the Object of the Car Class
		Car b = new Car();	//new keyword is used to create the Object
		Car c = new Car();	//a,b,c are Object reference variables
		
		a.model=2015;
		a.wheel=4;
		
		b.model=2016;
		b.wheel=4;
		
		c.model=2017;
		c.wheel=4;
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println(b.model);
		System.out.println(b.wheel);
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		//Now shift the references:
		a=b;
		b=c;
		c=a;
		
		System.out.println("After Shifting the references: ");
		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println(b.model);
		System.out.println(b.wheel);
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		
		
		
				

	}

}
