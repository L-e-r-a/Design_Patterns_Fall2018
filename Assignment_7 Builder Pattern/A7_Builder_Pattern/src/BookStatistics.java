public class BookStatistics implements Visitor{
	private int paragraphsNumber = 0;
	private int imagesNumber = 0;
	private int sectionsNumber = 0;
	private int tablesNumber = 0;

	@Override
	public void visit(Image image) {
		imagesNumber++;
	}

	@Override
	public void visit(ImageProxy imageProxy) {
		imagesNumber++;
	}

	@Override
	public void visit(Paragraph paragraph) {
		paragraphsNumber++;
	}

	@Override
	public void visit(Table table) {
		tablesNumber++;
	}

	@Override
	public void visit(Section Section) {
		sectionsNumber++;
	}
	
	public void printStatistics() {
	    System.out.println("Book Statistics:");
	    System.out.println("\tNumber of images: " + imagesNumber);
	    System.out.println("\tNumber of tables: " + tablesNumber);
	    System.out.println("\tNumber of paragraphs: " + paragraphsNumber);
	    System.out.println("\tNumber of sections: " + sectionsNumber);
	  }

}
