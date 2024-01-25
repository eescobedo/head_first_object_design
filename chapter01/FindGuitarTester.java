import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {

        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        Guitar guitar = inventory.search(whatErinLikes);

        if (guitar != null) {

//            System.out.println("Erin, you might like this " + guitar.getBuilder() + " " );
            System.out.println("Erin, you might like this " + guitar.getBuilder() + " " + guitar.getModel() + " " +
                    guitar.getType() + " guitar: " +
                    guitar.getBackWood() + " back and sides, " +
                    guitar.getTopWood() + " top. You can have it for only $" +
                    guitar.getPrice() + "!");

        } else {
            System.out.println("Sorry, Erin, we have noghing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars to the inventory ...
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }

}
