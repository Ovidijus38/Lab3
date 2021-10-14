import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec guitar1 = new GuitarSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, 12, Wood.ALDER,Wood.ALDER);
        MandolinSpec mand1 = new MandolinSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Style.A, Wood.ALDER,Wood.ALDER);

        List matchingInstruments = inventory.search(guitar1);

        if (!matchingInstruments.isEmpty()){
            System.out.println("You might like these guitars: ");

            for (Iterator i = matchingInstruments.iterator(); i.hasNext(); ) {
                Instrument instrument = (Instrument)i.next();
                System.out.println("We have a " +
                        instrument.getSpec().getBuilder() + " " + instrument.getSpec().getModel() + "\n" +
                        instrument.getSpec().getType() + "\n   " +
                        instrument.getSpec().getBackWood() + " back and sides, \n   " +
                        instrument.getSpec().getTopWood() + " top. \n Serial Number: " + instrument.getSerialNumber() +
                        "\nYou can have it for €" + instrument.getPrice() + "!\n ----");
            }
        }
        else
            System.out.println("Sorry, we have nothing for you.");
    }

    public static void initialiseInventory(Inventory inventory){

        //define some guitarSpec objects
        GuitarSpec spec1 = new GuitarSpec(Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                12,
                Wood.ALDER,
                Wood.ALDER);

        GuitarSpec spec2 = new GuitarSpec(Builder.FENDER,
                "Stratocastor",
                Type.ACOUSTIC,
                6,
                Wood.ALDER,
                Wood.ALDER);

        GuitarSpec spec3 = new GuitarSpec(Builder.GIBSON,
                "Stratocastor",
                Type.ELECTRIC,
                6,
                Wood.ALDER,
                Wood.ALDER);

        //add guitars to the inventory
        inventory.addInstrument("V00001",1499.99,spec1);
        inventory.addInstrument("V00002", 999.99,spec2);
        inventory.addInstrument("V00003", 1500.00, spec1);
    }
}
