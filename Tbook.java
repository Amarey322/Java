import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tbook {
    private final Map<String, List<String>> TBook;

    public Tbook(Map<String, List<String>> phoneBook) {
        this.TBook = new HashMap<>();
    }
    public void add(String name, String phoneNumber) {
        TBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }

}
