import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionKittensAndFoodTests {
    @Mock
    Feline feline;

    @Test
    public void getLionKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void getLionFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }
}
