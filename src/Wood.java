public enum Wood {
    MAHOGANY,ALDER, CEDAR;

    public String toString()
    {
        switch (this)
        {
            case CEDAR: return "Cedar";
            case MAHOGANY: return "Mahogany";
            case ALDER: return "Alder";
            default: return "Cedar";
        }
    }
}
