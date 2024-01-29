import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> pl = new ArrayList<>();
        pl.add(new Cat("Fluffy")); pl.add(new Cat("Whiskers"));
        pl.add(new Dog("Spike")); pl.add(new Dog("ScoobyDoo"));
        pl.add(new LoudDog("Clifford")); pl.add(new LoudDog("ScrappyDoo"));
        pl.add(new Snake("Snakey")); pl.add(new Snake("Noodle"));

        Kennel k = new Kennel(pl);
        k.allSpeak();
    }
}
