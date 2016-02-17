import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Word {
	private String convSent = "";
	String sentence = "";
	String word = "";
	String temp = "";
	char[] array;
	List<String> words = new ArrayList<String>();

	public void getWords(List<String> s, int p, char sym) {
		for (int i = 0; i < s.size(); i++) {
			sentence = s.get(i);
			words = Arrays.asList(sentence.split("\\s"));
			for (int j = 0; j < words.size(); j++) {
				word = words.get(j);
				word = changeSym(word, p, sym);
				convSent += word + " ";
			}
		}
		System.out.println("вывод: " + convSent);
	}

	public String changeSym(String word, int p, char s) {
		char[] letters = word.toCharArray();
		for (int i = 0; i <= letters.length; i++) {
			if (i != 0 && p != 0 && i % p == 0) {
				letters[i - 1] = s;
			}
		}
		word = String.valueOf(letters);
		return word;
	}
}
