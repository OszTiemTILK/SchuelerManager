package Schullaufbahn;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IDSchüler
{
    private static int aktuelleIDSchüler = getAktuelleIDSchüler(); //letzte vergebene SchülerID

	private static int IDSchüler = 0;

//  Konstruktoren

	IDSchüler()
	{
	     IDSchüler = aktuelleIDSchüler + 1;
		setAktuelleIDSchüler(IDSchüler);
	}

	IDSchüler(int pIDSchülerFest)
	{
		setIDSchüler(pIDSchülerFest);
	}


//  Getter Setter Methoden

	public int getIDSchüler()
	{
		return IDSchüler;
	}
	public void setIDSchüler(int pIDSchüler)
	{
		IDSchüler = pIDSchüler;
	}
	public static int getAktuelleIDSchüler()
	{
		return aktuelleIDSchüler;
	}
    public static void setAktuelleIDSchüler(int paktuelleIDSchüler)
    {
    	aktuelleIDSchüler = paktuelleIDSchüler;
	}

}