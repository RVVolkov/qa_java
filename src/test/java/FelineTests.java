import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTests {
    Feline feline = new Feline();

    @Test
    public void getFelineFamily() {
        String expected = "Кошачьи";
        String actually = feline.getFamily();
        assertEquals(expected, actually);
    }

    @Test
    public void getFelineKittensCount() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void felineEatMeat() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }
}
