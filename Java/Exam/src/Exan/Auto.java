package Exan;

/**
 * Modellierung eines Autos
 */
class Auto
{

	@Override
    public String toString() {
        return "Farbe - " + _farbe + ", Typ - " + _typ + ", Leistung - " + _leistung ;
    }

    /**
	 * Mögliche Farben in denen das Auto lackiert werden kann
	 */
	public enum FARBE
	{
		SCHWARZ, WEISS, GRAU, ROT, GRUEN, BLAU
	}

	/**
	 * Mögliche Fahrzeugtypen
	 */
	public enum TYP
	{
		KLEINWAGEN, KOMBI, SPORTWAGEN
	}

	/**
	 * Farbe des Autos
	 */
	private FARBE _farbe;

	/**
	 * Fahrzeugtyp des Autos
	 */
	private TYP _typ;

	/**
	 * Leistung des Autos in PS
	 */
	private int _leistung;

	public Auto(FARBE farbe, TYP typ, int leistung)
	{
		if (leistung < 0)
		{
			throw new IllegalArgumentException("Leistung muss > 0 sein.");
		}

		_farbe = farbe;
		_typ = typ;
		_leistung = leistung;
	}

	public FARBE getFarbe()
	{
		return _farbe;
	}

	public TYP getTyp()
	{
		return _typ;
	}

	public int getLeistung()
	{
		return _leistung;
	}

}
