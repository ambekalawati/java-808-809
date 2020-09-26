package exceptionhandling;

public class BookService {
	public Book getBookByName(String name) throws BookNotFoundException {
		if(name=="java") {
			Book b1 = new Book();
			b1.setBookId(123);
			b1.setBookName("java");
			return b1;
		}
		else {
			throw new BookNotFoundException(name+" Book is not available" ); 
		}
	} 

}
