import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class MarkdownParseTest extends MarkdownParse {
    @Test
    public void addtion() {
        assertEquals(2, 1+1);
    }
    @Test
    public void testparse() throws java.io.IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        List<String> list = List.of("https://something.com", "some-thing.html");
        assertEquals(list, getLinks(content)); 
	
    }
}
