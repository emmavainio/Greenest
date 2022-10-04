package Inlamning1;

public enum Vätsketyp {
    KRANVATTEN ("kranvatten"),
    PROTEINDRYCK ("proteindryck"),
    MINERALVATTEN ("mineralvatten");
    private String vätskeTyp;
    Vätsketyp (String s) {
        vätskeTyp = s;
    }
    String getString(){
        return vätskeTyp;
    }
}
