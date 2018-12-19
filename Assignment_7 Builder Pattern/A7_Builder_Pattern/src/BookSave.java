import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BookSave implements Visitor{
	private String path;
	private boolean append_to_file = true;
	private FileWriter write;
	private PrintWriter print_line;
	
	public BookSave(String file_path) throws IOException{
		path = file_path;
	}
	
	public void write_to_file(String text) {
		try {
			write = new FileWriter( path , append_to_file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		print_line = new PrintWriter( write );
		print_line.printf( "%s" + "%n" , text);
		print_line.close();
	}
		

	@Override
	public void visit(Image image) {
		write_to_file("Image: " + image.getName());
	}

	@Override
	public void visit(ImageProxy imageProxy) {
		write_to_file("ImageProxy: " + imageProxy.getName());
	}

	@Override
	public void visit(Paragraph paragraph) {
		write_to_file("Paragraph: " + paragraph.getText());
	}

	@Override
	public void visit(Table table) {
		write_to_file("Table: " + table.getTitle());
	}

	@Override
	public void visit(Section section) {
		write_to_file("Section: " + section.getName());
	}
}
