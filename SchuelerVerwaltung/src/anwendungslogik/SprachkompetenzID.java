package anwendungslogik;

public class SprachkompetenzID
{
    private static int aktuelleID = 1; //letzte vergebene ID

	private int ID = 0;

//  Konstruktoren

	SprachkompetenzID()
	{
		ID = aktuelleID + 1;
		setAktuelleID(ID);
	}

	SprachkompetenzID(int pIDFest)
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
		SprachkompetenzID.aktuelleID = pAktuelleID;
	}

}
