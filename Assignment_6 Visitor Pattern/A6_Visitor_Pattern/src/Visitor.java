public interface Visitor {
	void visit(Image image);
	void visit(ImageProxy imageProxy);
	void visit(Paragraph paragraph);
	void visit(Table table);
	void visit(Section Section);
}
