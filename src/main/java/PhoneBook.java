import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private final Map<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new TreeMap<>();
    }

    public int add(String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, phone);
        }
        return phoneBook.size();
    }

    public String findByNumber(String phone) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(phone)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String findByName(String name) {
        for (String key : phoneBook.keySet()) {
            if (key.equals(name)) {
                return phoneBook.get(name);
            }
        }
        return null;
    }

    public List<String> printAllNames() {
        return phoneBook.keySet().stream().toList();
    }
}
