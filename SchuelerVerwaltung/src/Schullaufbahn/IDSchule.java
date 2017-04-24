
package Schullaufbahn;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.Normalizer.Form;
import java.util.ArrayList;

public class IDSchule
{
    private static int aktuelleIDSchule = getAktuelleIDSchule(); //letzte vergebene SchülerID

	private static int IDSchule = 0;

//  Konstruktoren

	IDSchule()
	{
		getHöchsteID(IDSchule);
		IDSchule ++;
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

    public static IDSchule getHöchsteID(int IDSchule)
    {
    	Connection lConnection = DBVerbindungSchullaufbahn.holen();
    	IDSchule lIDSchule;
    	ArrayList<IDSchule> lIDSchuleListe = new ArrayList<IDSchule>();
    	Statement lBefehl;
    	ResultSet lErgebnis;

    	try {
    		lBefehl = lConnection.createStatement();
    		lErgebnis= lBefehl.executeQuery("SELECT MAX(IDSchule) FROM db_schulprojekt.besucht");
    		lErgebnis.first();

    		while(! lErgebnis.isAfterLast())
    		{
    			lIDSchule = new IDSchule (lErgebnis.getInt(4));
    			lIDSchuleListe.add(lIDSchule);

    			return lIDSchule;
    		}

    	 } catch (Exception ex)
  			{
    		 	System.out.println("Fehler bei der Verarbeitung + " + "n" + ex.getMessage());
  			}
    	return null;

    	}


}