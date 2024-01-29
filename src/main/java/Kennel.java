import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList;

    public Kennel(ArrayList<Pet> newList) {
        petList = newList;
    }

    public Pet get(int index) {
        return petList.get(index);
    }

    /** COMPLETE THIS METHOD
     * when a new pet is added it should keep the ArrayList petList in
     * alphabetic order.
     * Example:
     * index:    0       1       2       3
     * Pet:     cat     cat     dog    snake
     * 
     * k.add(new LoudDog("CliffTheBigRedDog"));
     * 
     * index:    0       1       2       3        4
     * Pet:     cat     cat     dog     dog     snake
     * 
     */
    public void add(Pet newPet) {
        // add your code here

    }

    /** COMPLETE THIS METHOD
     * For each Pet in the kennel, its appropriate toString 
     * method is called and sent to the terminal (System.out.println)
     */
    public void allSpeak() {
        // add your code here

    }
}
