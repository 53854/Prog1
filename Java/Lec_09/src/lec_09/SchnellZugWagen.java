package lec_09;

public class SchnellZugWagen extends PersonenWagen {
    private int firstClassSitze;

    public SchnellZugWagen(int siP, int stP, int fcP){
        super(siP, stP);
        firstClassSitze = fcP;
    }

    @Override
    public int getSitzPlaetze(){
        return super.getSitzPlaetze() + firstClassSitze;
    }

    @Override
    public int getPlaetze(){
        return super.getPlaetze() + firstClassSitze;
    }
}
