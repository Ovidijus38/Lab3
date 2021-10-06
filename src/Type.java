public enum Type {
    ELECTRIC,ACOUSTIC,WOOD;


    public String toString() {
        switch (this){

            case ELECTRIC: return "Electric";
            case ACOUSTIC: return "Acoustic";
            case WOOD: return "Mahogany";
            default: return "Electric";

        }

    }
}
