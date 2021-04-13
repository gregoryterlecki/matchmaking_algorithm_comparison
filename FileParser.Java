import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParser {

    // consider making it use Integer keys, not String keys???
    private HashMap<String, List<String>> studentSelections;

    // Seems like this function has three responsibilities:
    // to read each line, to parse each line, then to actually place it correctly in 'studentSelections'
    public FileParser(String path) {
        BufferedReader r;
        this.studentSelections = new HashMap<String, List<String>>();
        try {
            r = new BufferedReader(new FileReader(path));
            String line = r.readLine();
            String[] parsed;
            while (line != null) {
                parsed = line.split("|", 2);
                this.studentSelections.put(parsed[0], Arrays.asList(parsed[1].split("|")));
                line = r.readLine();
            }
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, List<String>> getData() {
        return this.studentSelections;
    }

}