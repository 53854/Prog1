package Exan;

/**
 * Verarbeitet Messwerte zur Qualitätssicherung von z.B. Bauteilen.
 */
public class Qualitaestssicherung {
 
    

    /**
     * Berechnet die Maximale Differrenz in einem Array von Messwerten und
     * vergleicht diese mit einer maximal zugelassenen Abweichung.
     * 
     * @param messwerte Das Array von Messwerten
     * @param maxAbweichungen Der maximal zugelassenen Betrag der Abweichung
     * @return Wenn die Abweichung <= maximalen Abweichung true, sonst false
     */
	 boolean abweichungOkay(int[] messwerte, int maxAbweichung){
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : messwerte) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        if ((max - min) <= maxAbweichung) return true;
	 	else return false;
	 }
    //Hier Code einfügen

    public int min(int a, int b, int c, int d){
        return Integer.min(Integer.min(a, b), Integer.min(b, c));
    }

    public double berechneDurchschnitt(double a, double b, double c, double d, double e, double f)
	{
		return(a+b+c+d+e+f) / 6;


	}

}
