package oldshelf;

public class Comic extends Book {

	private String Title;

	private final int ageOfMainCharacter;

	public Comic(String Title, int ageOfMainCharacter) {
		this.Title = Title;
		this.ageOfMainCharacter = ageOfMainCharacter;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	public int getageofMainCharacter() {
		return ageOfMainCharacter;
	}

	@Override
	public String toString() {
		return "Comic {Title :" + Title + " ," + "Age of Main character :" + ageOfMainCharacter + " }";
	}

	@Override
	public int hashCode() {
		int result = Title != null ? Title.hashCode() : 0;
		result = 31 * result + ageOfMainCharacter;
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Comic))
			return false;
		Comic comic = (Comic) o;
		return ageOfMainCharacter == comic.ageOfMainCharacter && Title.equals(comic.Title);
	}
}
