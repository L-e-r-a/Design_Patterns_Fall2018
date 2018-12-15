
public class Table implements BookElement{
	private String title;	
	
	public Table(String name){
		title = name;
	}

	public void print() {
	    System.out.println("Table:" + title);
	}
}
