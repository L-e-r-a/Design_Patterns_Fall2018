
public class Image implements BookElement{
	private String imageName;	
	
	public Image(String name){
		imageName = name;
	}

	public void print() {
	    System.out.println("Image: " + imageName);
	}
}
