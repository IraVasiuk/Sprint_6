import com.example.AlexLion;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {
    Feline feline;
    AlexLion alexLionTest;

    @Mock
    AlexLion alexLion;


    @Before
    public void init() throws Exception {
        alexLionTest = new AlexLion(feline);
    }

    @Test //проверка, что метод getKittens() вызван
    public void getKittensCallCheck() {
        alexLion.getKittens();
        Mockito.verify(alexLion).getKittens();
    }

    @Test //проверка, что метод getFriends() вызван
    public void getFriendsCallCheck() {
        alexLion.getFriends();
        Mockito.verify(alexLion).getFriends();
    }

    @Test //проверка, что метод getPlaceOfLiving() вызван
    public void getPlaceOfLivingCallCheck() {
        alexLion.getPlaceOfLiving();
        Mockito.verify(alexLion).getPlaceOfLiving();
    }

    @Test //проверка, что метод getFriends() вызывает нужный список
    public void getFriendsListCheck() {
        List<String> actual = alexLionTest.getFriends();
        assertEquals(List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман"), actual);
    }

    @Test //проверка, что метод getPlaceOfLiving() вызывает нужный String
    public void testPlaceOfLiving() {
        String actual = alexLionTest.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", actual);
    }

    @Test //проверка, что у Алекса нет детей
    public void testGetKittens() {
        int actual = alexLionTest.getKittens();
        assertEquals(0, actual);
    }

}