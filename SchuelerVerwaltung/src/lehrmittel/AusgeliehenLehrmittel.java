package lehrmittel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import anwendungslogik.SchülerID;
import datenbank.Datenbankverbindung;

public class AusgeliehenLehrmittel
{
	private LocalDate ausgegeben;
	private boolean rückgabe;
	private Lehrmittel lehrmittel;
	private AusleiheID ausleiheID;


	public AusgeliehenLehrmittel(LocalDate pAusgegeben, boolean pRückgabe, Lehrmittel pLehrmittel)
	{
		this.ausgegeben = pAusgegeben;
		this.rückgabe = pRückgabe;
		this.lehrmittel = pLehrmittel;
		AusleiheID ausleiheID = new AusleiheID();
	}

	public static AusgeliehenLehrmittel[] holen(SchülerID pID) {
		ArrayList<AusgeliehenLehrmittel> lArraylist = new ArrayList<AusgeliehenLehrmittel>();
		Connection lConnection = Datenbankverbindung.holen();

		Statement stmt = null;
		ResultSet result = null;
	  try {
	     stmt = lConnection.createStatement();
	     result = stmt.executeQuery("SELECT * FROM Lernmittel l, ausgeliehen a WHERE l.IDLernm = a.IDLernm AND IDSchüler = '" + pID.getSchülerID() + "'" /* + pID.getSchülerID() */ /* + lWhere  + " WHERE " + lWhere */);
	     result.first();  //Zeigt auf den ersten Datensatz in result

	     while(! result.isAfterLast()) { // as long as valid data is in the result set

	    	Lehrmittel lLehrmittel = new Lehrmittel(result.getString("l.Fach"), result.getString("l.Art"), result.getString("l.Name"), new LehrmittelID(result.getInt("l.IDLernm")));

	       lArraylist.add(new AusgeliehenLehrmittel(LocalDate.parse(result.getString("a.Datum")),result.getBoolean("a.Rückgabe"), lLehrmittel));
//	       System.out.println(result.getDate(6));

	       result.next(); // geht zum nächsten Datensatz in result

	     }


	} catch (Exception ex) {
	    System.out.println("Fehler bei der Verarbeitung + " + "Lernmittel" + " " + ex.getMessage());

	}

	  return lArraylist.toArray(new AusgeliehenLehrmittel[lArraylist.size()]);

	  }

	/**
	 * AusgeliehenLehrmittel speichern
	 */
	public void speichern(SchülerID pSchülerID)
	{
		Connection lConnection = Datenbankverbindung.holen();

		Statement stmt = null;

		try
		{
		     stmt = lConnection.createStatement();
		     stmt.execute("INSERT INTO ausgeliehen VALUES ("+this.getAusleiheID().getAusleiheID()+", '"+this.getLehrmittel().getLehrmittelID().getId()+"', '"+pSchülerID+"', '"+this.getAusgegeben().toString()+"', "+this.isRückgabe()+")");


		} catch (Exception ex)
		{
		    System.out.println("Fehler bei der Verarbeitung + " + "Lehrmittel" + " " + ex.getMessage());
		}
	}

	public LocalDate getAusgegeben()
	{
		return ausgegeben;
	}

	public void setAusgegeben(LocalDate ausgegeben)
	{
		this.ausgegeben = ausgegeben;
	}

	public boolean isRückgabe()
	{
		return rückgabe;
	}

	public void setRückgabe(boolean rückgabe)
	{
		this.rückgabe = rückgabe;
	}

	public Lehrmittel getLehrmittel()
	{
		return this.lehrmittel;
	}

	public void setLehrmittelID(Lehrmittel pLehrmittel)
	{
		this.lehrmittel = pLehrmittel;
	}

	public AusleiheID getAusleiheID()
	{
		return this.ausleiheID;
	}

	public void setAusleiheID(AusleiheID pAusleiheID)
	{
		this.ausleiheID = pAusleiheID;
	}
}
