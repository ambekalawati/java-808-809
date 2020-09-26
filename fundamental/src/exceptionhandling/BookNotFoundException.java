package exceptionhandling;

public class BookNotFoundException extends RuntimeException {
	private String message;
	public BookNotFoundException(String s){
		this.message= s;
		
	}
	public String getMessage() {
		return message;
	}
	
	

}
