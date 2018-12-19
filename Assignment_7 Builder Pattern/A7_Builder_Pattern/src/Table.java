
public class Table implements BookElement{
	private String title;	
	
	public Table(String name){
		title = name;
	}

	public String getTitle() {
		return title;
	}
	
	public void print() {
	    System.out.println("Table:" + title);
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

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
