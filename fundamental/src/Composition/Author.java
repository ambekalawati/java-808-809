package Composition;

public class Author {
	public String name;
	public String email;
	public char gender;
	Author(String name, String email, char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}

	public static void main(String[] args) {
		Author a1= new Author("robert" , "xyz" , 'M');
		

	}

}
