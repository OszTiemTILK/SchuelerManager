package lehrmittel;

import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDate;

import anwendungslogik.SchülerID;
import datenbank.Datenbankverbindung;

public class AusgeliehenLehrmittel
{
	private LocalDate ausgegeben;
	private boolean rückgabe;
	private LehrmittelID lehrmittelID;
	private AusleiheID ausleiheID;


	public AusgeliehenLehrmittel(LocalDate pAusgegeben, boolean pRückgabe, LehrmittelID pLehrmittelID)
	{
		this.ausgegeben = pAusgegeben;
		this.rückgabe = pRückgabe;
		this.lehrmittelID = pLehrmittelID;
	}

	/**
	 * AusgeliehenLehrmittel speichern
	 */
	public void speichern(SchülerID pSchülerID)
	{
		Connection lConnection = Datenbankverbindung.holen();

		Statement stmt = null;

		try {
		     stmt = lConnection.createStatement();
		     stmt.execute("INSERT INTO Lernmittel VALUES ("+this.getLehrmittelID()+", '"+this.getArt()+"', '"+this.getFach()+"', '"+this.getName()+"', '"+this.getAusgegeben().toString()+"', "+this.isRückgabe()+")");


		} catch (Exception ex) {
		    System.out.println("Fehler bei der Verarbeitung + " + "Lehrmittel" + " " + ex.getMessage());
		}
	}

	public LocalDate getAusgegeben() {
		return ausgegeben;
	}

	public void setAusgegeben(LocalDate ausgegeben) {
		this.ausgegeben = ausgegeben;
	}

	public boolean isRückgabe() {
		return rückgabe;
	}

	public void setRückgabe(boolean rückgabe) {
		this.rückgabe = rückgabe;
	}
}
