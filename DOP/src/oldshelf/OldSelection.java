package oldshelf;

public class OldSelection {

	public static String getAgeOrTitle(Object o) {
		/*if (o instanceof Book) {
			if(o instanceof Comic){
				Comic comic=(Comic) o;
				return comic.getTitle();
			}
			else if(o instanceof Fiction){
				Fiction fiction=(Fiction) o;
				return fiction.getName();
			}
			else if(o instanceof TextBook){
				TextBook tb=(TextBook) o;
				return tb.getSubject();
			}
		}
		return null;*/
		

		//using switch 

		return switch (o) {
			case Comic comic -> comic.getTitle();
			case Fiction fiction -> fiction.getName();
			case TextBook textBook -> textBook.getSubject();
			default -> "";
		};
	}

	public static void main(String[] args) {
		
		Comic comic=new Comic("Spider man", 23);
		Fiction fiction=new Fiction("Alice story",FictionType.Tragedy);
		TextBook t = new TextBook("Physics");
		
		System.out.println(getAgeOrTitle(comic));
		System.out.println(getAgeOrTitle(fiction));
		System.out.println(getAgeOrTitle(t));
	}
}
