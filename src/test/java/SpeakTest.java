import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SpeakTest {
    
    @DisplayName("Cat Speak Test 01")
    @Test
    void cat_speak_test01() {
        Pet c = new Cat("Fluffy");
        String expected = "meow";
        String result = c.speak();
        assertEquals(expected, result);
    }
    
    @DisplayName("Dog Speak Test 01")
    @Test
    void dog_speak_test01() {
        Pet d = new Dog("Spike");
        String expected = "woof";
        String result = d.speak();
        assertEquals(expected, result);
    }
    
    @DisplayName("LoudDog Speak Test 01")
    @Test
    void loudDog_speak_test01() {
        Pet ld = new LoudDog("ScoobyDoo");
        String expected = "WOOF";
        String result = ld.speak();
        assertEquals(expected, result);
    }
    
    @DisplayName("Snake Speak Test 01")
    @Test
    void Snake_speak_test01() {
        Pet s = new Snake("Medusa");
        String expected = "";
        String result = s.speak();
        assertEquals(expected, result);
    }
}
