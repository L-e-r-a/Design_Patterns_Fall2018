import java.util.ArrayList;

public class SubChapter {
	private String name;
	ArrayList<Paragraph> paragraphs = new ArrayList<Paragraph>();	
	ArrayList<Image> images = new ArrayList<Image>();	
	ArrayList<Table> tables = new ArrayList<Table>();	
	
	
	public SubChapter(String nume){
		name = nume;
	}

	public void createNewParagraph(String text) {
		Paragraph par = new Paragraph(text);
		paragraphs.add(par);
	}
	
	public void createNewImage(String name) {
		Image img = new Image(name);
		images.add(img);
	}
	
	public void createNewTable(String title) {
		Table table = new Table(title);
		tables.add(table);
	}
	
	public void print() {
	    System.out.println("Subchapter: " + name);
	    for (Paragraph paragraph : paragraphs) {
	      paragraph.print();
	    }
	    for (Image image : images) {
	      image.print();
		}
	    for (Table table : tables) {
	      table.print();
	    }
	}

}
