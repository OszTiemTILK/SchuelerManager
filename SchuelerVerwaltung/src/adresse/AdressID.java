/*
 * Hr. Jakob 25.02.2017 angelegt
 * Die IDs für Adressen werden automatisch vom System vergeben, dazu dient diese Klasse.
 */
package adresse;

public class AdressID
{
    private static int aktuelleID = -1; //letzte vergebene ID

	private int ID = 0;

//  Konstruktoren

	AdressID()
	{
		ID = aktuelleID + 1;
		setAktuelleID(ID);
	}

	AdressID(int pIDFest)
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
		AdressID.aktuelleID = pAktuelleID;
	}

}
