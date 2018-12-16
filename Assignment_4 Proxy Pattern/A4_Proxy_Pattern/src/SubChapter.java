import java.util.ArrayList;

public class SubChapter {
	private String name;
	ArrayList<BookElement> elements = new ArrayList<BookElement>();	
	
	public SubChapter(String nume){
		name = nume;
	}

	public void createNewParagraph(String text) {
		Paragraph par = new Paragraph(text);
		elements.add(par);
	}
	
	public void createNewImage(String name) {
		Image img = new Image(name);
		elements.add(img);
	}
	
	public void createNewTable(String title) {
		Table table = new Table(title);
		elements.add(table);
	}
	
	public void print() {
	    System.out.println("Subchapter: " + name);
	    for (BookElement element : elements) {
	      element.print();
	    }
	}

}
