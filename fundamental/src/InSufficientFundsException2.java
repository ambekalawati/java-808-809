
public class InSufficientFundsException2 extends Exception {
	private double needs;

	
	public InSufficientFundsException2(double needs) {
		this.needs= needs;
	}	
	public double getAmount() {
		return needs;
		
	}
}
	
		

	


