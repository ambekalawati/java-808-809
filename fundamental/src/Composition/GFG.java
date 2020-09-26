package Composition;

import java.util.ArrayList;
import java.util.List;

public class GFG { public static void main(String[] args)
{
	Book b1= new Book("java: reference", "robert", 325.55); 
	Book b2= new Book("python: reference","joshua", 500.67, 1);
	List<Book>books = new ArrayList<Book>();
	books.add(b1);
	books.add(b2);
	Library library= new Library(books);
	List<Book>bks= library.getTotalBooksInLibrary();
	for(Book bk:bks) {
		System.out.println("name:"  +bk.name   +"author:"  +bk.author   +"price:"  +bk.price   +"qty:"  +bk.qty);
	}
}

}
