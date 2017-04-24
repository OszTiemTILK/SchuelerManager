package lehrmittel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import datenbank.Datenbankverbindung;

public class AusleiheID
{
	int ausleiheID;
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

	public int holenNächsteAusleiheID()
	{
		int nächsteAusleiheID = 0;

		Statement stmt = null;
		ResultSet result = null;
		Connection lConnection = Datenbankverbindung.holen();
		try
		{
			stmt = lConnection.createStatement();
			result = stmt.executeQuery("Select IDAusleihe FROM db_schulprojekt.ausgeliehen a ORDER BY IDAusleihe desc ");
			result.first();
			nächsteAusleiheID = result.getInt("IDAusleihe") +1;
		}
		catch(Exception ex)
		{
			System.out.println("Fehler bei der Verarbeitung + " + "Lernmittel" + " " + ex.getMessage());
		}
		System.out.println(nächsteAusleiheID);
		return nächsteAusleiheID;

	}

}
