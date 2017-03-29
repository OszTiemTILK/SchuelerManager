/*
 * Hr. Jakob 23.03.2017 angelegt

 * Die IDs für Fahrradausleihen werden automatisch vom System vergeben, dazu dient diese Klasse.
 */
package allgemeinedaten;

public class SchülerInID
{
    private static int aktuelleID = 1; //letzte vergebene ID

	private int ID = 0;

//  Konstruktoren

	 SchülerInID()
	{
		ID = aktuelleID + 1;
		setAktuelleID(ID);
	}

	SchülerInID(int pIDFest)
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
		SchülerInID.aktuelleID = pAktuelleID;
	}

}
