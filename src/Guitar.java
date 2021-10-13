public class Guitar extends Instrument{

    private GuitarSpec spec;

    public Guitar(String serialNumber, double price, GuitarSpec spec){

        super(serialNumber,price);


        this.spec = spec;
    }



    public String getSerialNumber(){
        return serialNumber;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public GuitarSpec getSpec() {
        return spec;
    }
}
