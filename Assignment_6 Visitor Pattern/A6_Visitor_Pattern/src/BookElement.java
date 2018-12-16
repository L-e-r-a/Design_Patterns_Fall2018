public interface BookElement {
	int add(BookElement element);
	void remove(BookElement element);
	BookElement getChild(int index);
	void print();
	void accept(Visitor visitor);
}
