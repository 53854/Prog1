package lec_09;

import java.util.List;

public class Zug {

    private Lokomotive lok;
    private List<PersonenWagen> wagons;

    public Zug(Lokomotive loko){
        lok = loko;
    }

    public int getSitzPlaetze(){
        int p = 0;
        for(PersonenWagen w : wagons){
            p += w.getSitzPlaetze();
        }
        return p;
    }

    public int getPlaetze(){
        int p = 0;
        for(PersonenWagen w : wagons){
            p += w.getPlaetze();
        }
        return p;
    }

    public void addWagen(PersonenWagen w){
        if(100 + wagons.size() * 100 > lok.getLeistung()){
            System.out.println("Lokomotive hat nicht genug Leistung");
        } else wagons.add(w);
    }

    @Override
    public String toString() {
        return  "Der Zuug hat eine Lokomotive mit: " + lok.getLeistung() + "PS,\n"+
                "Der Zug hat instgesammt " + getPlaetze() + " Plaetze\n" +
                "Davon sind " + getSitzPlaetze() + " Sitzplatze";
    }
}
