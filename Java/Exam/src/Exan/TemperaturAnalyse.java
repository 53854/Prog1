package Exan;

import java.util.*;

/**
 * Statische Analysemethoden zur Auswertung von Temperaturlisten
 * der Form List<Integer>
 */
public class TemperaturAnalyse {


    

    /**
	 * Liefert den Index des Tages mit der höchsten Temperatur zurück.
	 *
	 * Haben mehrere Tage die selbe Temperatur, so wird der letzte von
	 * ihnen (größter Index) zurück gegeben.
	 *
	 * @param temperaturen Liste mit einer Temperatur (Integer) pro
	 *                     Tag (index)
	 *
	 * @return Index des heißesten Tags
     * @throws Exception
	 *
	 * @throws IllegalArgumentException - if temperaturen == null
	 * @throws IllegalArgumentException - if temperaturen.size() == 0
	 */
	public static int getHeissesterTag(List<Integer> temperaturen) throws Exception{
		
        int index = 0;
        try{
            int temp = temperaturen.get(index);
            for(int i = 1; i < temperaturen.size(); i++){
                if (temperaturen.get(i) >= temp) index = i;
            }
        } catch (Exception e){
            e = new IllegalArgumentException();
            throw e;
        }
        
        return index;
	}

	/**
	 * Liefert den Index des Tages mit der niedrigsten Temperatur
	 * zurück.
	 *
	 * Haben mehrere Tage die selbe Temperatur, so wird der letzte von
	 * ihnen (größter Index) zurück gegeben.
	 *
	 * @param temperaturen Liste mit einer Temperatur (Integer) pro
	 *                     Tag (index)
	 *
	 * @return Index des kältesten Tags
	 * @throws Exception
	 *
	 * @throws IllegalArgumentException - if temperaturen == null
	 * @throws IllegalArgumentException - if temperaturen.size() == 0
	 */
	public static int getKaeltesterTag(List<Integer> temperaturen) throws Exception{

        int index = 0;

        try{
            int temp = temperaturen.get(index);
            for(int i = 1; i < temperaturen.size(); i++){
                if (temperaturen.get(i) <= temp) index = i;
            }
        } catch (Exception e){
            e = new IllegalArgumentException();
            throw e;
        }
        
        return index;
	}
}
