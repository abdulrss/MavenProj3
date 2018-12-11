package OOPsConcepts;

public class TestHSBCBank {

	public static void main(String[] args) {
		HSBCBank hsbcBank =  new HSBCBank();
		ReserveBank rBank = new HSBCBank();
		
		hsbcBank.credit();
		hsbcBank.debit();
		hsbcBank.moneyTransfer();
		hsbcBank.retailLoans();
		System.out.println(hsbcBank.min_balance);
		rBank.interestRate();
		
		//Above methods are static polymorphism...method overloading...compile time polymorphism
		
		//Below are Dymanic polymorphism...child class objects (only common ones that exists in both Parent & child) can be referenced by Parent Interface reference variable
		WorldBank wb = new HSBCBank();
		
		wb.credit();
		wb.debit();
		wb.moneyTransfer();
		

	}

}
