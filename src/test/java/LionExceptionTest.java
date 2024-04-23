import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionExceptionTest {

    @Test //метод ожидает появление исключения и сранивает его с ожидаемым
    public void lionTestExpectedException() {
        Feline feline = new Feline();
        Exception exception = assertThrows(Exception.class, () -> new Lion("Нечто", feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}