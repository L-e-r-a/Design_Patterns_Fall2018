import java.util.*;  

public class Book {
	
	private String title;
	private ArrayList<Author> authors=new ArrayList<Author>();	
	private ArrayList<BookElement> elements = new ArrayList<BookElement>();	
	
	
	public Book(String titlu){
		title = titlu;
	}
	
	public void addAuthor(Author author) {
		authors.add(author);
	}

	public int addContent(BookElement element) {
		elements.add(element);
		return elements.size() - 1;
	}

	public void removeContent(BookElement element) {
		elements.remove(element);
	}

	public BookElement getContent(int index) {
		return elements.get(index);
	}	
	
	public void print() {
		System.out.println("Book: " + title);
		for (BookElement element : elements) {
			element.print();
		}
	}

}
