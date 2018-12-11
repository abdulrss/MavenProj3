package OOPsConcepts;

public class HSBCBank implements WorldBank, ReserveBank{
	//Multiple inheritance...Is-a relationship
	//If a Class is Implementing an Interface, than it is mandatory to define/override all the methods of the interface
	
	public void credit() {
		System.out.println("HSBCBank ---- Credit");
	}
	
	public void debit() {
		System.out.println("HSBCBank ---- Debit");
	}
	
	public void moneyTransfer() {
		System.out.println("HSBCBank ---- Money Transfer");
	}
	
	public void retailLoans() {
		System.out.println("HSBCBank ---- Retail Loan");
	}
	
	//ReserveBank Interface Methods
	
	public void interestRate() {
		System.out.println("HSBCBank ---- Interest Rate");
	}

}
