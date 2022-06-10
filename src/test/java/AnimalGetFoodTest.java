import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest {
    private final String animalKind;
    private final List<String> expected;

    public AnimalGetFoodTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getAnimalKind() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Млекопитающие", List.of("Молоко", "Вода")},
        };
    }

    @Test
    public void getAnimalFood() throws Exception {
        try {
            Animal animal = new Animal();
            List<String> actual = animal.getFood(animalKind);
            assertEquals(expected, actual);
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}
