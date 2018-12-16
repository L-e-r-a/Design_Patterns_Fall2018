import java.util.ArrayList;

public class Section implements BookElement{
	private String name;
	private ArrayList<BookElement> elements = new ArrayList<BookElement>();	
	
	
	public Section(String nume){
		name = nume;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int add(BookElement element) {
		elements.add(element);
		return elements.size() - 1;
	}

	@Override
	public void remove(BookElement element) {
		elements.remove(element);
	}

	@Override
	public BookElement getChild(int index) {
		return elements.get(index);
	}	

	@Override
	public void print() {
		for (BookElement element : elements) {
			element.print();
		}
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	    for (BookElement element : elements) {
	      element.accept(visitor);
	    }
	}


}
