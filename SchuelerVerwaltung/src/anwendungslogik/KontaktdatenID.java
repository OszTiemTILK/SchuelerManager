package anwendungslogik;

public class KontaktdatenID extends Kontaktdaten
{
/*
 * Hr. Jakob 23.03.2017 angelegt
 * Die IDs für Fahrradausleihen werden automatisch vom System vergeben, dazu dient diese Klasse.
 */
    private static int aktuelleID = 510; //letzte vergebene ID

	private int ID = 0;

//  Konstruktoren

	KontaktdatenID()
	{
		ID = aktuelleID + 1;
		setAktuelleID(ID);
	}

	KontaktdatenID(int pIDFest)
	{
		setID(pIDFest);
	}
//  Getter Setter Methoden

	public int getID()
	{
		return ID;
	}
	public void setID(int iD)
	{
		ID = iD;
	}
	public static int getAktuelleID()
	{
		return aktuelleID;
	}

	private static void setAktuelleID(int pAktuelleID)
	{
		KontaktdatenID.aktuelleID = pAktuelleID;
	}

}


