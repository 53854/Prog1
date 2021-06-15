package lec_09;

public class PersonenWagen {
   
    private int siP;
    private int stP;
   
    public PersonenWagen(int sitzPLaetze, int stehPlaetze){
        siP = sitzPLaetze;
        stP = stehPlaetze;
    }

    public int getSitzPlaetze() {
        return siP;
    }

    public int getPlaetze() {
        return stP + siP;
    }
}
