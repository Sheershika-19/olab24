
import oldshelf.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OldSelectionTest {

    @Test
    public void testgetAgeorTitle_Comic(){
        Comic comic=new Comic("Superman",23);
        String result=OldSelection.getAgeOrTitle(comic);
        assertEquals("Superman",result,"Correct outcome obtained");
    }

    @Test
    public void testgetAgeorTitle_Fiction(){
        Fiction fiction=new Fiction("Alice",FictionType.Tragedy);
        String result=OldSelection.getAgeOrTitle(fiction);
        assertEquals("Alice",result,"Correct outcome obtained");
    }

    @Test
    public void testgetAgeorTitle_TextBook(){
        TextBook tb=new TextBook("Physics");
        String result=OldSelection.getAgeOrTitle(tb);
        assertEquals("Physics",result,"Correct outcome obtained");
    }

    @Test
    public void test_negative(){
        String nonBook = "NotABook";
        String result = OldSelection.getAgeOrTitle(nonBook);
        assertEquals("", result, "Expected empty string for non-Book instance");
    } 
    
}
