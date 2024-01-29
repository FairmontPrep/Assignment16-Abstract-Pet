import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ConstructorTest {

    @DisplayName("Dog Constructor Test 01")
    @Test
    void dog_const_test01() {
        Pet d = new Dog("Spot");
        String expected = "Spot";
        String result = d.getName();
        assertEquals(expected, result);
    }
    
    @DisplayName("LoudDog Constructor Test 02")
    @Test
    void loudDog_const_test02() {
        Pet ld = new LoudDog("Clifford");
        String expected = "Clifford";
        String result = ld.getName();
        assertEquals(expected, result);
    }
    
    @DisplayName("Cat Constructor Test 01")
    @Test
    void cat_const_test01() {
        Pet c = new Cat("Lucy");
        String expected = "Lucy";
        String result = c.getName();
        assertEquals(expected, result);
    }

    
    
    @DisplayName("Snake Constructor Test 01")
    @Test
    void Snake_const_test01() {
        Pet s = new Snake("Snakey");
        String expected = "Snakey";
        String result = s.getName();
        assertEquals(expected, result);
    }
}
