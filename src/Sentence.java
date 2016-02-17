import java.util.ArrayList;
import java.util.List;

public class Sentence {
	private String sent;
	private List<String> items;
	char[] charArray;

	public void getSentence(String ss) {
		sent = "";
		items = new ArrayList<String>();
		charArray = ss.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			sent += String.valueOf(charArray[i]);
			if (charArray[i] == '.' || charArray[i] == '!' || charArray[i] == '?') {
				items.add(sent.trim());
				sent = "";
			}
		}
	}

	public List<String> getSentences() {
		return items;
	}
}
