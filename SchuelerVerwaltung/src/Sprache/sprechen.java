
/*
 * Jose 08.03.2017 angelegt
 */
package Sprache;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Sprache.sprechen;
import datenbank.Datenbankverbindung;
import javafx.collections.ObservableList;

public class sprechen {
	IDSprachkompetenz IDSprache;
	private String sprachenName;
	private String sprachenNiveau;
	private Boolean sprachenDeutsch;
	private Boolean sprachenEnglisch;
	private Boolean sprachenTürkisch;
	private Boolean sprachenArabisch;
	private Boolean sprachenSonstiges;
	/**
	 * Konstruktor mit Strings
	 * @param pSprachenName
	 * @param pSprachenNiveau
	 * @param pSprachkompetenzID
	 */

	public sprechen(String pSprachenName, String pSprachenNiveau, int IDSpricht, Boolean pSprachenDeutsch, Boolean pSprachenEnglisch, Boolean pSprachenTürkisch, Boolean pSprachenArabisch, Boolean pSprachenSonstiges)

	{
		this.IDSprache = new IDSprachkompetenz(IDSpricht);
		this.sprachenName = pSprachenName;
		this.sprachenNiveau = pSprachenNiveau;
		this.sprachenDeutsch = pSprachenDeutsch;
		this.sprachenEnglisch = pSprachenEnglisch;
		this.sprachenTürkisch = pSprachenTürkisch;
		this.sprachenArabisch = pSprachenArabisch;
		this.sprachenSonstiges = pSprachenSonstiges;
	}

	public sprechen( int IDSpricht, String pSprachenNiveau, String pSprachenName )
	{
		this.IDSprache = new IDSprachkompetenz(IDSpricht);
		this.sprachenName = pSprachenName;
		this.sprachenNiveau = pSprachenNiveau;

	}
	public sprechen( int IDSpricht )
	{
		this.IDSprache = new IDSprachkompetenz(IDSpricht);

	}


	/** legt Sprachen an
	 *
	 */
	public void anlegen()
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
			//lBefehl.execute("INSERT INTO sprache VALUES ( "+IDSprache.getID()+","+ sprachenNiveau+",\""+sprachenName+"\")");
			lBefehl.execute("INSERT INTO spricht (IDSchüler) VALUES ( "+IDSprache.getID()+"");

		  } catch (SQLException e)
		  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	}
	 public static sprechen auslesenDB(int IDSpricht)
	  {

	      Connection lConnection = Datenbankverbindung.holen();
		  sprechen lSprachkompetenz;
		  ArrayList<sprechen> lSprachkompetenzliste = new ArrayList<sprechen>();
		  Statement lBefehl;
		  ResultSet lErgebnis;

		  try {
		  lBefehl = lConnection.createStatement();
		  lErgebnis = lBefehl.executeQuery("SELECT * FROM sprache where IDSprache="+ IDSpricht +";");
		  lErgebnis.first();  //Zeigt auf den ersten Datensatz in lErgebnis

		  while(! lErgebnis.isAfterLast())   //Solange das Ende nicht erreicht ist....
		     {
			   lSprachkompetenz = new sprechen(lErgebnis.getInt(1));
			   lSprachkompetenzliste.add(lSprachkompetenz);
			   //Spezial für dieses Beispiel springen wir gleich wieder raus.
	           // Sonst kann man hier eine Liste füllen.
			   return lSprachkompetenz;
		     }


		  	 } catch (Exception ex)
		  		{
		    System.out.println("Fehler bei der Verarbeitung: " + ex.getMessage());
		  		}
		  return null;
	  }

	public void ergänzen()
	{
	  sprechen lSprachkompetenz = auslesenDB(this.IDSprache.getID());
	  sprachenName = lSprachkompetenz.sprachenName;
	  sprachenNiveau = lSprachkompetenz.sprachenNiveau;
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
	public IDSprachkompetenz getIDSprachkompetenz()
	{
		return IDSprache;
	}
	public void setIDSprachkompetenz(IDSprachkompetenz pIDSprachkompetenz)
	{
		this.IDSprache = pIDSprachkompetenz;
	}
	public Boolean getSprachenDeutsch()
	{
		return sprachenDeutsch;
	}
	public void setSprachenDeutsch(Boolean pSprachenDeutsch)
	{
		this.sprachenDeutsch = pSprachenDeutsch;
	}
	public Boolean getSprachenEnglisch()
	{
		return sprachenEnglisch;
	}
	public void setSprachenEnglisch(Boolean pSprachenEnglisch)
	{
		this.sprachenEnglisch = pSprachenEnglisch;
	}
	public Boolean getSprachenTürkisch()
	{
		return sprachenTürkisch;
	}
	public void setSprachenTürkisch(Boolean pSprachenTürkisch)
	{
		this.sprachenTürkisch = pSprachenTürkisch;
	}
	public Boolean getSprachenArabisch()
	{
		return sprachenArabisch;
	}
	public void setSprachenArabisch(Boolean pSprachenArabisch)
	{
		this.sprachenArabisch = pSprachenArabisch;
	}
	public Boolean getSprachenSonstiges()
	{
		return sprachenSonstiges;
	}
	public void setSprachenSonstiges(Boolean pSprachenSonstiges)
	{
		this.sprachenSonstiges = pSprachenSonstiges;
	}
}
