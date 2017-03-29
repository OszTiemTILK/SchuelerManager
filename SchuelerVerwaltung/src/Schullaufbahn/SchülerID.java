
package Schullaufbahn;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SchülerID
{
    private static int aktuelleSchülerID = getAktuelleSchülerID(); //letzte vergebene SchülerID

	private static int SchülerID = 4;

//  Konstruktoren

	SchülerID()
	{
	     SchülerID = aktuelleSchülerID + 1;
		setAktuelleSchülerID(SchülerID);
	}

	SchülerID(int pSchülerIDFest)
	{
		setSchülerID(pSchülerIDFest);
	}


//  Getter Setter Methoden

	public int getSchülerSchülerID()
	{
		return SchülerID;
	}
	public void setSchülerID(int pSchülerID)
	{
		SchülerID = pSchülerID;
	}
	public static int getAktuelleSchülerID()
	{
		return aktuelleSchülerID;
	}
    public static void setAktuelleSchülerID(int paktuelleSchülerID)
    {
    	aktuelleSchülerID = paktuelleSchülerID;
	}

}