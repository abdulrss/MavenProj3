package OOPsConcepts;

public class Mercedies extends Cars {
	
	//Static Polymorphism...compile time poly..the start method is present in both parent and child
	//same name, and same nos of arguments, the child method will override the parent method..called as method Overriding
	public void start() {
		System.out.println("Merc----Start");
	}
	
	public void stop() {
		System.out.println("Merc----Start");
	}
	
	public void theftMode() {
		
		System.out.println("Merc----Theft Mode");
		
	}

	
	
}

