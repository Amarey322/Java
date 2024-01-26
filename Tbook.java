import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tbook {
    private final Map<String, List<String>> TBook;

    public Tbook() {
        this.TBook = new HashMap<>();
    }
    public void add(String name, String phoneNumber) {
        TBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }
    public List<String> get(String name) {
        return TBook.getOrDefault(name, new ArrayList<>());
    }
    public static void main(String[] args) {
        Tbook Tbook = new Tbook();
        Tbook.add("Vladislav", "+79022399878");
        Tbook.add("Maxim", "+79399764976");
        Tbook.add("Vladislav", "+79026758732");
        Tbook.add("Genadiy", "+79278563856");
        System.out.println("Phone number Vladislav: " + Tbook.get("Vladislav"));
        System.out.println("Phone number Maxim: " + Tbook.get("Maxim"));
        System.out.println("Phone number Genadiy: " + Tbook.get("Genadiy"));
    }
}
