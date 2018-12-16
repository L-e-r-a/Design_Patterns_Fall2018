
public class Paragraph implements BookElement{
	private String text;
	private AlignStrategy align;
	
	public Paragraph(String content){
		text = content;
	}
	
	public String getText() {
		return text;
	}


	public void setAlignStrategy(AlignStrategy alignStrategy) {
		align = alignStrategy;
	}
	
	@Override
	public void print() {
		if (align != null) {
			align.print(text);
		} else {
			System.out.println("Paragraph: " + text);
		}
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
