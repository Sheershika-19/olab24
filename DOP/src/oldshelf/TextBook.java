package oldshelf;

public class TextBook extends Book {

	private final String subject;

	public TextBook(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return "TextBook { Subject : " + subject + " }";
	}
}
