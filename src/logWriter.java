import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class logWriter {
    private static logWriter instance = null;

    private logWriter() {}

    public static logWriter getInstance(){
    if (instance == null) {
        instance = new logWriter();
    }
    return instance;
    }

    public void writeToFile(String content) throws IOException {
        String file = "C:\\Users\\ben10";
        Files.writeString(Path.of(file), content + "\n", StandardOpenOption.APPEND);
    }

}
