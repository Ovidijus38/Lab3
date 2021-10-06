import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        Guitar whatLookingFor = new Guitar("V00001", 1499.99, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER,Wood.ALDER);

        List matchingguitar = inventory.search(whatLookingFor);
        if (!matchingguitar.isEmpty()){

            for (Iterator i = matchingguitar.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar) i.next();
                System.out.println("We have a few guitars:\n" + guitar.getSerialNumber());
            }
        }
        else {
            System.out.println("Sorry, we have nothing for you.");
        }
    }

    public static void initialiseInventory(Inventory inventory){
        //add guitars to the inventory
        inventory.addGuitar("V00001",
                1499.99,
                Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER);

        inventory.addGuitar("V00002",
                1699.99,
                Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER);

    }
}
