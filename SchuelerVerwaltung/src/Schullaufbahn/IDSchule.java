
package Schullaufbahn;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IDSchule
{
    private static int aktuelleIDSchule = getAktuelleIDSchule(); //letzte vergebene SchülerID

	private static int IDSchule = 0;

//  Konstruktoren

	IDSchule()
	{
	     IDSchule = aktuelleIDSchule + 1;
		setAktuelleIDSchule(IDSchule);
	}

	IDSchule(int pIDSchuleFest)
	{
		setIDSchule(pIDSchuleFest);
	}


//  Getter Setter Methoden

	public int getIDSchule()
	{
		return IDSchule;
	}
	public void setIDSchule(int pIDSchule)
	{
		IDSchule = pIDSchule;
	}
	public static int getAktuelleIDSchule()
	{
		return aktuelleIDSchule;
	}
    public static void setAktuelleIDSchule(int paktuelleIDSchule)
    {
    	aktuelleIDSchule = paktuelleIDSchule;
	}

}