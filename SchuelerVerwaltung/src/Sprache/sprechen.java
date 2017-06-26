
/*
 * Jose 08.03.2017 angelegt
 */
package Sprache;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import anwendungslogik.SchülerID;
import datenbank.Datenbankverbindung;

public class sprechen {
	IDSprechen IDSprechen;
	private String sprachenName;
	private String sprachenNiveau;

	/**
	 * Konstruktor mit Strings
	 * @param pSprachenName
	 * @param pSprachenNiveau
	 * @param pIDSprachen
	 */


	public sprechen( String pSprachenNiveau, String pSprachenName )
	{
		this.IDSprechen = new IDSprechen();
		this.sprachenName = pSprachenName;
		this.sprachenNiveau = pSprachenNiveau;

	}



	public void aendernSprachen()
	{

	}
	/** loescht Angaben zur Person
	 *
	 */
	public void speichernDB(SchülerID pIDSchüler)
	{
		Connection lConnection = Datenbankverbindung.holen();
		  Statement lBefehl;
		  ResultSet lErgebnis;


		  try {
			lBefehl = lConnection.createStatement();
			//lBefehl.execute("INSERT INTO sprache VALUES ( "+IDSprache.getID()+","+ sprachenNiveau+",\""+sprachenName+"\")");
			lBefehl.execute("INSERT INTO sprachkompetenz (IDSprachkompetenz, IDSprache, IDSchüler, SprachenNiveau) VALUES ("+IDSprechen.getID()+","+holenIDSprache(sprachenName)+","+pIDSchüler.getSchülerID()+",'"+sprachenNiveau+"')");


		  } catch (SQLException e)
		  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	}

	public int holenIDSprache(String pSprachenName)

	{
		int lID = 0;

		Statement stmt = null;
		ResultSet result = null;
		Connection lConnection = Datenbankverbindung.holen();
		try
		{
			stmt = lConnection.createStatement();
			result = stmt.executeQuery("SELECT idsprachen FROM idsprachen WHERE Sprachenniveau LIKE '" +pSprachenName+"'");
			result.first();
			lID = result.getInt("idsprachen");
		}
		catch(Exception ex)
		{
			System.out.println("Fehler bei der Verarbeitung + " + "Sprache" + " " + ex.getMessage());
		}
		return lID;
	}



	 public static ArrayList<sprechen> auslesenDB(SchülerID pSchülerID)
	  {

	      Connection lConnection = Datenbankverbindung.holen();
		  sprechen lSprachkompetenz;
		  ArrayList<sprechen> lSprachkompetenzliste = new ArrayList<sprechen>();
		  Statement lBefehl;
		  ResultSet lErgebnis;

		  try {
		  lBefehl = lConnection.createStatement();

		  lErgebnis = lBefehl.executeQuery("SELECT * FROM sprachkompetenz where IDSchüler="+ pSchülerID.getSchülerID() +";");
		  lErgebnis.first();  //Zeigt auf den ersten Datensatz in lErgebnis

		  while(! lErgebnis.isAfterLast())   //Solange das Ende nicht erreicht ist....
		     {
			   lSprachkompetenz = new sprechen(lErgebnis.getString("SprachenNiveau"), holenSprachenName(lErgebnis.getInt("IDSprache")));
			   lSprachkompetenzliste.add(lSprachkompetenz);
			   //Spezial für dieses Beispiel springen wir gleich wieder raus.
	           // Sonst kann man hier eine Liste füllen.
		     }


		  	 } catch (Exception ex)
		  		{
		    System.out.println("Fehler bei der Verarbeitung: " + ex.getMessage());
		  		}
		  return lSprachkompetenzliste;
	  }

	 public static String holenSprachenName(int pSprachID)
	 {
		 String name = "";

		 	Statement stmt = null;
			ResultSet result = null;
			Connection lConnection = Datenbankverbindung.holen();
			try
			{
				stmt = lConnection.createStatement();
				result = stmt.executeQuery("SELECT sprachenniveau FROM idsprachen WHERE IDSprachen = " +pSprachID+"");
				result.first();
				name = result.getString("sprachenniveau");
			}
			catch(Exception ex)
			{
				System.out.println("Fehler bei der Verarbeitung + " + "Sprache" + " " + ex.getMessage());
			}
			return name;
	 }




// Ab hier folgen nur Get/Set Methoden

	public String getSprachenName()
	{
		return sprachenName;
	}
	public void setSprachenName(String pSprachenName)
	{
		this.sprachenName = pSprachenName;
	}
	public String getSprachenNiveau()
	{
		return sprachenNiveau;
	}
	public void setSprachenNiveau(String pSprachenNiveau)
	{
		this.sprachenNiveau = pSprachenNiveau;
	}
	public IDSprechen getIDSprechen()
	{
		return IDSprechen;
	}
	public void setIDSprechen(IDSprechen pIDSprechen)
	{
		this.IDSprechen = pIDSprechen;
	}
}

