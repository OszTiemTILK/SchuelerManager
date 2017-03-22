/*
 * Jose 08.03.2017 angelegt
 */
package anwendungslogik;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fahrradausleihe.Datenbankverbindung;
import fahrradausleihe.Fahrradausleihe;
import fahrradausleihe.Sprachkompetenz;

public class Sprachkompetenz {
	SprachkompetenzID sprachkompetenzID;
	private Boolean sprachenName;
	private String sprachenNiveau;

	/**
	 * Leerer Kontruktor
	 */
	public Sprachkompetenz()
	{

	}
	/**
	 * Konstruktor mit Strings
	 * @param pSprachenName
	 * @param pSprachenNiveau
	 * @param pSprachkompetenzID
	 */
	public Sprachkompetenz(Boolean pSprachenName, String pSprachenNiveau)
	{
		this.sprachkompetenzID = new SprachkompetenzID();
		this.sprachenName = pSprachenName;
		this.sprachenNiveau = pSprachenNiveau;
	}
	/** legt Sprachen an
	 *
	 */
	public void anlegenSprachen()
	{
		speichernDB();
	}
	/** aendert Sprachen
	 *
	 */
	public void aendernSprachen()
	{

	}
	/** loescht Angaben zur Person
	 *
	 */
	public void loeschenSprachen()
	{

	}
	/** speichert Sprachen
	 *
	 */
	public void speichernDB()
	{
		Connection lConnection = Datenbankverbindung.holen();
		  Statement lBefehl;
		  ResultSet lErgebnis;

		  try {
			lBefehl = lConnection.createStatement();
			lBefehl.execute("INSERT INTO fahrradausleihe VALUES ( "+sprachkompetenzID.getID()+","+ sprachenNivea+",\""+name+"\")");

		  } catch (SQLException e)
		  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	}
	 public static Sprachkompetenz auslesenDB(int FahrradausleiheIDWert)
	  {

	      Connection lConnection = Datenbankverbindung.holen();
		  Sprachkompetenz lSprachkompetenz;
		  ArrayList<Sprachkompetenz> lSprachkompetenzliste = new ArrayList<Sprachkompetenz>();
		  Statement lBefehl;
		  ResultSet lErgebnis;

		  try {
		  lBefehl = lConnection.createStatement();
		  lErgebnis = lBefehl.executeQuery("SELECT * FROM fahrradausleihe where id="+ SprachkompetenzID  + ";");
		  lErgebnis.first();  //Zeigt auf den ersten Datensatz in lErgebnis

		  while(! lErgebnis.isAfterLast())   //Solange das Ende nicht erreicht ist....
		     {
			   lSprachkompetenz = new Sprachkompetenz(lErgebnis.getInt(1),lErgebnis.getInt(2),lErgebnis.getString(3));
			   lSprachkompetenzliste.add(lSprachkompetenz);
			   //Spezial für dieses Beispiel springen wir gleich wieder raus.
	           // Sonst kann man hier eine Liste füllen.
			   return lSprachkompetenz;
		     }


		  	 } catch (Exception ex)
		  		{
		    System.out.println("Fehler bei der Verarbeitung + " + "n" + ex.getMessage());
		  		}
		  return null;
	  }

	public void ergänzen()
	{
	  Sprachkompetenz lSprachkompetenz = auslesenDB(this.sprachkompetenzID.getID());
	  sprachkompetenz = lSprachkompetenz.sprachkompetenz;
	  name = lSprachkompetenz.name;
	}
// Ab hier folgen nur Get/Set Methoden
	public Boolean getSprachenName()
	{
		return sprachenName;
	}
	public void setSprachenName(Boolean pSprachenName)
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
	public SprachkompetenzID getSprachkompetenzID()
	{
		return sprachkompetenzID;
	}
	public void setSprachkompetenzID(SprachkompetenzID pSprachkompetenzID)
	{
		this.sprachkompetenzID = pSprachkompetenzID;
	}

}
