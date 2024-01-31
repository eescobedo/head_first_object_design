import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {

        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
//        Guitar whatErinLikes = new Guitar(null, null, Builder.MARTIN, "OM-18", Type.ACOUSTIC, Wood.MAHOGANY, Wood.ADIRONDACK);

        List matchingGuitars = inventory.search(whatErinLikes);

        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
                Guitar guitar = (Guitar) i.next();
                GuitarSpec spec = guitar.getSpec();
//            System.out.println("Erin, you might like this " + matchingGuitars.getBuilder() + " " );
                System.out.println("We have a " + spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " guitar: " +
                        spec.getBackWood() + " back and sides, " +
                        spec.getTopWood() + " top. You can have it for only $" +
                        guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Erin, we have noghing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars to the inventory ...
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }

}
