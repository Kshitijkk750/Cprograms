package nioStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class ReadFile {

	public static void main(String[] args) {
        try{
        Path path=Paths.get("/home/dell/CDAC_JAVA/ifelse.java");
        List<String> lst=Files.readAllLines(path);
        for(String str:lst){
            System.out.println(str);
        }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
	