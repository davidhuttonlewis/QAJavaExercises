
public class Task1 {

	String doubleLetter = "";

	public String doubleLetter(String word) {

		for (int i = 0; i < word.length(); i++) {

			doubleLetter += word.charAt(i);
			doubleLetter += word.charAt(i);
		}
		// doubleLetter.
		return doubleLetter;

	}
}
