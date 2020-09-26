
public class InSufficientFundsException extends Exception {
	private double needs;

	
	public InSufficientFundsException(double needs) {
		this.needs= needs;
	}	
	public double getAmount() {
		return needs;
		
	}
}
	
		

	


