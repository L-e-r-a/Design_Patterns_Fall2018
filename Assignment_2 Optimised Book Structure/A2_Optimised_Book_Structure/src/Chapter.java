import java.util.ArrayList;

public class Chapter {
	private String name;
	private ArrayList<SubChapter> subchapters = new ArrayList<SubChapter>();	
	
	
	public Chapter(String nume){
		name = nume;
	}

	public int createSubChapter(String schpName) {
		SubChapter schp = new SubChapter(schpName);
		subchapters.add(schp);
		return subchapters.size() - 1;
	}
	
	public SubChapter getSubChapter(int index) {
		return subchapters.get(index);
	}
	
	public void print() {
		System.out.println("Chapter: " + name);
		for (SubChapter subchapter : subchapters) {
			subchapter.print();
		}
	}	

}
