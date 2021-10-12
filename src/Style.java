public enum Style {

    Aclass,Fclass;

    public String toString() {
        switch (this) {
            case Aclass: return "A";
            case Fclass: return "F";
            default: return "BB";
        }
    }
}
