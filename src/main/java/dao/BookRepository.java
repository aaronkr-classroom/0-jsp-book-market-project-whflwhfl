package dao;

import java.util.ArrayList;
import dto.Book;
public class BookRepository {

		private ArrayList<Book> listOfBooks = new ArrayList<Book>();
		
		public BookRepository() {
			Book book1 = new Book("ISBN1234", "C# 프로그래밍", 27000);
			book1.setAuthor(null);
			book1.setDescription(null);
			book1.setPublisher(null);
			book1.setCategory(null);
			book1.setUnitsInStock(0);
			book1.setReleaseDate(null);
			
			
			Book book2 = new Book("ISBN1235", "자바 마스터", 30000);
			book2.setAuthor(null);
			book2.setDescription(null);
			book2.setPublisher(null);
			book2.setCategory(null);
			book2.setUnitsInStock(0);
			book2.setReleaseDate(null);
			
			Book book3 = new Book("ISBN1236", "파이썬 프로그래밍", 30000);
			book3.setAuthor(null);
			book3.setDescription(null);
			book3.setPublisher(null);
			book3.setCategory(null);
			book3.setUnitsInStock(0);
			book3.setReleaseDate(null);
			
			listOfBooks.add(book1);
			listOfBooks.add(book2);
			listOfBooks.add(book3);
			
			
			
		}//생성자 끝
		public ArrayList<Book> getAllBooks() {
			return listOfBooks;
		}
}
