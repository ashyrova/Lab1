import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner TextScanner = new Scanner(System.in);
		System.out.print("Вывод: ");
		String str = TextScanner.nextLine();

		System.out.print("Вывод (Вывод) вывод: ");
		int position = TextScanner.nextInt();

		System.out.print("фф (вывод): ");
		char c = TextScanner.next().charAt(0);

		Text InputText = new Text();
		InputText.setText(str);

		Sentence InputSentence = new Sentence();
		InputSentence.getSentence(InputText.getText());

		Word InputWord = new Word();
		InputWord.getWords(InputSentence.getSentences(), position, c);

	}

}
