package Schullaufbahn;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IDbesucht
{
    private static int aktuelleIDbesucht = getAktuelleIDbesucht(); //letzte vergebene besuchenID

	private static int IDbesucht = 0;

//  Konstruktoren

	IDbesucht()
	{
	     IDbesucht = aktuelleIDbesucht + 1;
		setAktuelleIDbesucht(IDbesucht);
	}

	IDbesucht(int pIDbesuchtFest)
	{
		setIDbesucht(pIDbesuchtFest);
	}


//  Getter Setter Methoden

	public int getIDbesucht()
	{
		return IDbesucht;
	}
	public void setIDbesucht(int pIDbesucht)
	{
		IDbesucht = pIDbesucht;
	}
	public static int getAktuelleIDbesucht()
	{
		return aktuelleIDbesucht;
	}
    public static void setAktuelleIDbesucht(int paktuelleIDbesucht)
    {
    	aktuelleIDbesucht = paktuelleIDbesucht;
	}

}