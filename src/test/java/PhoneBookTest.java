import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @Test
    public void addTest() {
        PhoneBook phoneBook = new PhoneBook();
        int excepted = 3;

        phoneBook.add("Игорь", "89909909090");
        phoneBook.add("Сергей", "89909919191");
        phoneBook.add("Анна", "89909929292");
        int result = phoneBook.add("Игорь", "89909949494");

        Assertions.assertEquals(excepted, result);
    }
}
