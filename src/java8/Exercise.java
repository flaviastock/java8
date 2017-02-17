package java8;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public interface Exercise {
	   void perform();

	    default List<String> getWordsAsList() {
	        String content;
	        try {
	            content = new String(Files.readAllBytes(Paths.get("src//resources//alice.txt")), StandardCharsets.UTF_8);
	            return Arrays.asList(content.split("[\\P{L}]+"));
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException(e);
	        }
	    }

	    default String[] getWordsAsArray() {
	        String content;
	        try {
	            content = new String(Files.readAllBytes(Paths.get("src//resources//alice.txt")), StandardCharsets.UTF_8);
	            return content.split("[\\P{L}]+");
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException(e);
	        }
	    }

}
