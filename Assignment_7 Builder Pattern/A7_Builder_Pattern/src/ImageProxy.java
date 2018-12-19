import java.util.concurrent.TimeUnit;

public class ImageProxy implements BookElement{
	private String imageName;	
	private Image image = null;
	
	public ImageProxy(String name){
		imageName = name;
	}
	
	public String getName() {
		return imageName;
	}

	@Override
	public void print() {
		if (this.image == null) {
			this.image = new Image(this.imageName);
		}
	    this.image.print();	
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
