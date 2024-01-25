public enum Type {
    ACOUSTIC, ELECTRIC;

    public String toString() {
        switch (this) {
            case ACOUSTIC:
                return "ACCOUSTIC";
            case ELECTRIC:
                return "ELECTRIC";
            default:
                return "unspecified";
        }
    }
}