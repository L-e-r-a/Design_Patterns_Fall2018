
public class Paragraph implements BookElement{
	private String text;	
	
	public Paragraph(String content){
		text = content;
	}
	
	public void print() {
	    System.out.println("Paragraph:" + text);
	}
}
