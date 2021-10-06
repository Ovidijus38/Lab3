public enum Wood {
    ALDER,CEDAR,MAHOGANY;

    @Override
    public String toString() {

        switch (this){
            case CEDAR:return "Cedar";
            case ALDER: return "Alder";
            case MAHOGANY:return "Mahogany";
            default:return "Alder";
        }
    }
}

