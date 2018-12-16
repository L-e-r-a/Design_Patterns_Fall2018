
public class Paragraph implements BookElement{
	private String text;	
	
	public Paragraph(String content){
		text = content;
	}
	
	@Override
	public void print() {
	    System.out.println("Paragraph: " + text);
	}

	@Override
	public int add(BookElement element) {
		return 0;
	}

	@Override
	public void remove(BookElement element) {	
	}

	@Override
	public BookElement getChild(int index) {
		return null;
	}
}
