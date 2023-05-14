import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    static PhoneBook phoneBook = new PhoneBook();
    @BeforeAll
    static void createPhoneBook() {
        phoneBook.add("Игорь", "89909909090");
        phoneBook.add("Сергей", "89909919191");
        phoneBook.add("Анна", "89909929292");
    }

    @Test
    public void addTest() {

        int excepted = 3;

        int result = phoneBook.add("Игорь", "89909949494");

        Assertions.assertEquals(excepted, result);
    }

    @Test
    public void findByNumberTest() {

        String excepted = "Игорь";

        String result = phoneBook.findByNumber("89909909090");

        Assertions.assertEquals(excepted, result);
    }

    @Test
    public void findByNameTest() {

        String excepted = "89909919191";

        String result = phoneBook.findByName("Сергей");

        Assertions.assertEquals(excepted, result);
    }

    @Test
    public void printAllNamesTest() {

        String[] excepted = {"Анна", "Игорь", "Сергей"};

        String[] result = phoneBook.printAllNames();

        Assertions.assertEquals(excepted, result);
    }

}
