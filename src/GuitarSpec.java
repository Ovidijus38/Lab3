public class GuitarSpec extends InstrumentSpec {


    private int numStrings;



    public GuitarSpec( Builder builder, String model,Type type,int numStrings, Wood backWood, Wood topWood)  {

        super(builder,model,type,backWood,topWood);

        this.numStrings = numStrings;

       /* this.builder = builder;
        this.model = model;
        this.type = type;

        this.backWood = backWood;
        this.topWood = topWood;

        */

    }

    public boolean matches(GuitarSpec otherSpec){

        if(!super.matches(otherSpec))
            return false;
        if(numStrings !=otherSpec.numStrings)
            return false;
        return true;
    }


}
