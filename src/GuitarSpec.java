public class GuitarSpec {

    private Builder builder;
    private String model;
    private Type type;
    private int numStrings;
    private Wood backWood;
    private Wood topWood;


    public GuitarSpec( Builder builder, String model,
                  Type type,int numStrings, Wood backWood, Wood topWood) {

        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }
    public Builder getBuilder(){
        return builder;
    }
    public String getModel(){
        return model;
    }
    public Type getType(){
        return type;
    }
    public int getNumStrings(){return numStrings;}
    public Wood getBackwood(){
        return backWood;
    }
    public Wood getTopwood(){
        return topWood;
    }


    public boolean matches(GuitarSpec otherSpec){

        if(builder !=otherSpec.builder)
            return false;
        if(model !=otherSpec.model)
            return false;
        if(type !=otherSpec.type)
            return false;
        if(backWood !=otherSpec.backWood)
            return false;
        if(topWood !=otherSpec.topWood)
            return false;
        if(numStrings !=otherSpec.numStrings)
            return false;
        return true;
    }


}
