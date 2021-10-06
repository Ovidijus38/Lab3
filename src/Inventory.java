import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price,GuitarSpec spec){
        //Guitar guitar = new Guitar(serialNumber, price, model, type, builder, backwood , topwood);
        Guitar guitar = new Guitar(serialNumber,price,spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator(); ((Iterator) i).hasNext();){
            Guitar guitar = (Guitar)i.next();
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchGuitarSpec) {

        List matchingGuitars = new LinkedList<>();

        for (Iterator i = guitars.iterator(); i.hasNext(); ) {

            Guitar guitar = (Guitar) i.next();


            if (guitar.getSpec().getBuilder() !=searchGuitarSpec.getBuilder())
                continue;

            if (guitar.getSpec().getModel() !=searchGuitarSpec.getModel())
                continue;

            if (guitar.getSpec().getType() !=searchGuitarSpec.getType())
                continue;

            if (guitar.getSpec().getBackwood() !=searchGuitarSpec.getBackwood())
                continue;

            if (guitar.getSpec().getTopwood() !=searchGuitarSpec.getTopwood())
                continue;

            matchingGuitars.add(guitar);

        }
        return matchingGuitars;
    }
}
