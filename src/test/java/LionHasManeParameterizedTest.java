import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHasManeParameterizedTest {
    Feline feline = new Feline();
    private final String sex;
    private final boolean expected;

    public LionHasManeParameterizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] hasMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"test", true},
        };
    }

    @Test
    public void doesLionHaveMane() throws Exception {
        try {
            Lion lion = new Lion(sex, feline);
            boolean actual = lion.doesHaveMane();
            assertEquals(expected, actual);
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}
