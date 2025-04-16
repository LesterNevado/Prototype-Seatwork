public class Cow implements Animal{
    private int legs = 4;
    private String sound = "Moooo";
    private String food = "Hay";

    public Cow() {
        System.out.println("Creating Cow Prototype");
    }

    @Override
    public Cow clone() {
        try {
            return (Cow) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning Not Supported!");
            return null;
        }
    }

    public void makeSound() {
        System.out.println("Cow says: " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    
}
