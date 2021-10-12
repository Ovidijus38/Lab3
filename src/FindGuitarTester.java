import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ACOUSTIC, 6,Wood.ALDER,Wood.ALDER);

        List<Guitar>matchingguitar = inventory.search(whatLookingFor);
        if (!matchingguitar.isEmpty()){

            for(Guitar guitar : matchingguitar)
                System.out.println("We have a few guitars:\n" + guitar.getSerialNumber());
            }

        else {
            System.out.println("Sorry, we have nothing for you.");
        }
    }

    public static void initialiseInventory(Inventory inventory){
        //add guitars to the inventory
        GuitarSpec gSpec1 = new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ACOUSTIC,6,Wood.ALDER,Wood.ALDER);
        GuitarSpec gSpec2 = new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,6,Wood.ALDER,Wood.ALDER);



        inventory.addGuitar("v0001",1799.99,gSpec2);
        inventory.addGuitar("v0002",1899.99,gSpec2);
        inventory.addGuitar("v0003",1599.99,gSpec1);
        inventory.addGuitar("v0004",1499.99,gSpec1);
    }
}
