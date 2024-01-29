public abstract class Pet {
    private String myName;

    public Pet(String name) {
        myName = name;
    }

    public String getName() {
        return myName;
    }
    public abstract String getType();

    public abstract String speak();

    public String toString() {
        return "The " + getType() + " named " + getName() + " said \"" + speak() + "\"";
    }

}
