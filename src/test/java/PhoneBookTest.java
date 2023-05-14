import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();
    @Test
    public void addTest() {

        int excepted = 3;

        phoneBook.add("Игорь", "89909909090");
        phoneBook.add("Сергей", "89909919191");
        phoneBook.add("Анна", "89909929292");
        int result = phoneBook.add("Игорь", "89909949494");

        Assertions.assertEquals(excepted, result);
    }

    @Test
    public void findByNumbeTest() {
        String excepted = "Игорь";

        String result = phoneBook.findByNumber("89909909090");

        Assertions.assertEquals(excepted, result);
    }
}
