package oldshelf;

public class Fiction extends Book {

	private final String name;
	
	private final FictionType type;

	public Fiction(String name,FictionType type) {
		this.name=name;
		this.type=type;
	}

	public String getName(){
		return name;
	}
	

	public FictionType getType() {
        return type;
    }
}
