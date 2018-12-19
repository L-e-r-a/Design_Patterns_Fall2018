
public class Main {

	public static void main(String[] args) throws Exception {
		Builder jsonBuilder = new JSONBuilder("book.json");
		jsonBuilder.build();
		BookElement myBook = jsonBuilder.getResult();
		myBook.print();
		
	}
}
