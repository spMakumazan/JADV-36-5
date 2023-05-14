import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private final Map<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
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
}
