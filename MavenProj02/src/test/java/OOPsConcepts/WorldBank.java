package OOPsConcepts;

public interface WorldBank {
	
	int min_balance = 200;
	
	public void debit();		
	
	public void credit();
	
	public void moneyTransfer();
	
	//In interface, the method is defined without any body/code. So only method prototype
	//In Interface, variables can be declared, but they are Static & Final...i.e it cannot be changed
	//No Static method can be created in Interface
	//No Main method is needed in Interface
	//Interface is abstract in nature, so we cannot create an Object of an interface.
	
}
