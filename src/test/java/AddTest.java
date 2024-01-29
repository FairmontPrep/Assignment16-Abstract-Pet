import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class AddTest {
    
    ArrayList<Pet> createKennel() {
        ArrayList<Pet> pl = new ArrayList<>();
        pl.add(new Cat("Fluffy")); pl.add(new Cat("Whiskers"));
        pl.add(new Dog("Spike")); pl.add(new Dog("Chopper"));
        pl.add(new LoudDog("Cliff")); pl.add(new LoudDog("Cerberus"));
        pl.add(new Snake("Serpent")); pl.add(new Snake("Noodle"));
        return pl;
    }

    @DisplayName("Add Test 01")
    @Test
    void add_test01() {
        Kennel k = new Kennel(createKennel());
        k.add(new Dog("Scooby"));
        String expected = "dog";
        String result1 = k.get(2).getType();
        String result2 = k.get(6).getType();
        assertEquals(expected, result1);
        assertEquals(expected, result2);
    }

    @DisplayName("Add Test 02")
    @Test
    void add_test02() {
        Kennel k = new Kennel(createKennel());
        k.add(new LoudDog("Scrappy"));
        String expected = "dog";
        String result1 = k.get(2).getType();
        String result2 = k.get(6).getType();
        assertEquals(expected, result1);
        assertEquals(expected, result2);
    }

    @DisplayName("Add Test 03")
    @Test
    void add_test03() {
        Kennel k = new Kennel(createKennel());
        k.add(new Cat("Sneakers"));
        String expected = "cat";
        String result = k.get(2).getType();
        assertEquals(expected, result);
    }

    @DisplayName("Add Test 04")
    @Test
    void add_test04() {
        Kennel k = new Kennel(createKennel());
        k.add(new Snake("Cobra"));
        String expected = "snake";
        String result = k.get(6).getType();
        assertEquals(expected, result);
    }
}
