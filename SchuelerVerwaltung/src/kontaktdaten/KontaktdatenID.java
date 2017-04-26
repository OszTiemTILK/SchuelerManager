package kontaktdaten;

public class KontaktdatenID
{
/*
 *
 */
    private static int aktuelleID = 1; //letzte vergebene ID

	private int ID = 0;

	private String StringID = null;
	private void UpdateStID()
	{
		StringID = String.valueOf(ID);
	}

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

	public String getStringID()
	{
		UpdateStID();
		return this.StringID;
	}

}


