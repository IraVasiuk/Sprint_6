import com.example.Animal;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalExceptionTest {
    @Test //метод ожидает появление исключения и сранивает его с ожидаемым
    public void lionTestExpectedException() {
        Animal animal = new Animal();
        Exception exception = assertThrows(Exception.class, () -> animal.getFood("Нечто"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}