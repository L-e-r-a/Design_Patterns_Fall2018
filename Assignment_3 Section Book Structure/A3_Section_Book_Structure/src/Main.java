
public class Main {

	public static void main(String[] args) throws Exception {
		Book discoTitanic = new Book("Disco Titanic");
		Author rpGheo = new Author("Radu Pavel Gheo");
		discoTitanic.addAuthor(rpGheo);
		
		Section chapter1 = new Section("Chapter 1");
		chapter1.add(new Paragraph("First paragraph of first chapter."));
		chapter1.add(new Image("Also some image."));
		
		Section chapter2 = new Section("Chapter 2");
		chapter2.add(new Paragraph("First paragraph of second chapter."));
		chapter2.add(new Table("Pretend it's a table."));
		
		discoTitanic.addContent(chapter1);
		discoTitanic.addContent(chapter2);
		discoTitanic.addContent(new Image("Last image."));
		
		discoTitanic.print();

	}
}
