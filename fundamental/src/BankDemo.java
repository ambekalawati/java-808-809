
public class BankDemo {
	public static void main(String []args) {
		CheckingAccount c= new CheckingAccount(101);
		System.out.println("Depositing $500...");
		c.deposit(500.00);
		try {
			System.out.println("\nWithdrawing $100...");
			c.withdraw(100.00);
			System.out.println("\nwithdrawing $600...");
			c.withdraw(600.00);
			
		}
		catch(InSufficientFundsException e) {
			System.out.println("sorry,but you are short $" +e.getAmount());
			e.printStackTrace();
		}
	}

}
