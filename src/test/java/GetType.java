import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GetType {
    
    @DisplayName("Cat getType Test 01")
    @Test
    void cat_getType_test01() {
        Pet c = new Cat("Fluffy");
        String expected = "cat";
        String result = c.getType();
        assertEquals(expected, result);
    }
    
    @DisplayName("Dog getType Test 01")
    @Test
    void dog_getType_test01() {
        Pet d = new Dog("Spike");
        String expected = "dog";
        String result = d.getType();
        assertEquals(expected, result);
    }
    
    @DisplayName("LoudDog getType Test 01")
    @Test
    void loudDog_getType_test01() {
        Pet ld = new LoudDog("ScoobyDoo");
        String expected = "dog";
        String result = ld.getType();
        assertEquals(expected, result);
    }
    
    @DisplayName("Snake getType Test 01")
    @Test
    void Snake_getType_test01() {
        Pet s = new Snake("Medusa");
        String expected = "snake";
        String result = s.getType();
        assertEquals(expected, result);
    }
}
