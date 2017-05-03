package lehrmittel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import datenbank.Datenbankverbindung;

public class AusleiheID
{
	int ausleiheID;

	/**
	 * Konstruktor
	 */
	public AusleiheID()
	{
		ausleiheID = holenNächsteAusleiheID();
	}
	public int getAusleiheID()
	{
		return ausleiheID;
	}
	public void setAusleiheID(int pausleiheID)
	{
		this.ausleiheID = pausleiheID;
	}

	private int holenNächsteAusleiheID()
	{
		int lNächsteID = 0;

		Statement stmt = null;
		ResultSet result = null;
		Connection lConnection = Datenbankverbindung.holen();
		try
		{
			stmt = lConnection.createStatement();
			result = stmt.executeQuery("SELECT IDAusleihe FROM db_schulprojekt.ausgeliehen a ORDER BY IDAusleihe desc");
			result.first();
			lNächsteID = result.getInt("IDAusleihe") +1;
		}
		catch(Exception ex)
		{
			System.out.println("Fehler bei der Verarbeitung + " + "Lernmittel" + " " + ex.getMessage());
		}
		return lNächsteID;

	}

}
