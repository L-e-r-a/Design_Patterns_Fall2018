import java.util.HashMap;

public interface Builder {
	BookElement getResult();
	void build();
	
	BookElement buildSection(HashMap<String, Object> map);
	BookElement buildParagraph(HashMap<String, Object> map);
	BookElement buildImage(HashMap<String, Object> map);
	BookElement buildImageProxy(HashMap<String, Object> map);
	BookElement buildTable(HashMap<String, Object> map);
}