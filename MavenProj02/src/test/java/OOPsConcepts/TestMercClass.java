package OOPsConcepts;

public class TestMercClass {
	
	public static void main (String[] args) {
		Mercedies merc = new Mercedies();
		//Static Polymorphism...compile time polymorphism....during complie time java will determine which method to call...1 to many
		merc.start();  
		merc.stop();
		merc.refuel();
		merc.theftMode();
		
		System.out.println("*********");
		
		Cars car = new Cars();
		car.start();
		car.stop();
		car.refuel();
		
		System.out.println("*********");
		
		Cars c1 = new Mercedies(); //Parent Class Cars refrencing the child glass Merc and hence gets access to the common methods. 
									//This is called as dynamic polymorphism or run time polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		
		
	}

}
