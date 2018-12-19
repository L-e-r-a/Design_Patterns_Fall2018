import java.util.concurrent.TimeUnit;

public class Image implements BookElement{
	private String imageName;	
	
	public Image(String name){
		imageName = name;
	}
	
	public String getName() {
		return imageName;
	}


	@Override
	public void print() {
	    System.out.println("Image: " + imageName);
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
