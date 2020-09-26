package exceptionhandling;

public class Test {

	public static void main(String[] args)  {
		BookService bs= new BookService();
		Book book=  bs.getBookByName("java1");
		System.out.println(book.getBookId()+" "+book.getBookName());
//		try {
//			book = bs.getBookByName("java1");
//			System.out.println(book.getBookId()+" "+book.getBookName());
//		} catch (BookNotFoundException e) {
//			
//			System.out.println(e.getMessage());	
//			//System.out.println(e.getCause());
//			//e.printStackTrace();
//			}
//		
		

	}

}
