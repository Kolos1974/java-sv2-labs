package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LongWord implements FileOperations{
    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    public Path getPath() {
        return path;
    }

    @Override
    public String getLongWord() {
        StringBuilder sb = new StringBuilder();
        List<String> list = readFromFile(path);
        sb.append(list.get(0));
        for (int i = 1; i< list.size(); i++){
            String element = list.get(i);
            sb.append(element.substring(element.length()-1, element.length()));
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        LongWord lg = new LongWord(Path.of("src/test/resources/longword.txt"));
        list = lg.readFromFile(lg.getPath());
        System.out.println(list);

        System.out.println(lg.getLongWord());

    }
}
