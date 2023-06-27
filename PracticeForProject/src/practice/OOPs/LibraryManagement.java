package practice.OOPs;

import java.util.ArrayList;
import java.util.List;

class Library{

	String[] books;
	int noOfBooks;
	public Library(String[] books, int noOfBooks) {
		super();
		this.books = books;
		this.noOfBooks = noOfBooks;
	}
	void addBook(String book) {
		books[noOfBooks]=book;
		noOfBooks++;
	}
	void returnBook(String book) {
		noOfBooks--;
	}
}

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
