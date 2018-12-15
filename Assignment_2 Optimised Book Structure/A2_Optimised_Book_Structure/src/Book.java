import java.util.*;  

public class Book {
	
	private String title;
	private ArrayList<Author> authors=new ArrayList<Author>();	
	private ArrayList<Chapter> chapters = new ArrayList<Chapter>();	
	
	
	public Book(String titlu){
		title = titlu;
	}
	
	public void addAuthor(Author author) {
		authors.add(author);
	}

	public int createChapter(String string) {
		Chapter chp = new Chapter(string);
		chapters.add(chp);
		return chapters.size() - 1;
	}
	
	public Chapter getChapter(int index) {
		return chapters.get(index);
	}
	
	public void print() {
		System.out.println("Book: " + title);
		for (Author author : authors) {
			author.print();
		}
		for (Chapter chapter : chapters) {
			chapter.print();
		}
	}

}
