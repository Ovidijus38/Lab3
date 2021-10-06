import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model,
                          Type type,  Wood backWood, Wood topWood){
        //Guitar guitar = new Guitar(serialNumber, price, model, type, builder, backwood , topwood);
        Guitar guitar = new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
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

    public List search(Guitar searchGuitar) {

        List matchingGuitars = new LinkedList();

        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            //ignore serialNumber since it is unique
            //ignore price since it is irrelevant

            if (searchGuitar.getBuilder() !=guitar.getBuilder())
                continue;

            if (searchGuitar.getModel() !=guitar.getModel())
                continue;

            if (searchGuitar.getType() !=guitar.getType())
                continue;

            if (searchGuitar.getBackwood() !=guitar.getBackwood())
                continue;

            if (searchGuitar.getTopwood() !=guitar.getTopwood())
                continue;

            matchingGuitars.add(guitars);

        }
        return matchingGuitars;
    }
}
