package Sprache;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import datenbank.Datenbankverbindung;

public class IDSprechen {

	private int ID = 0;

	public	IDSprechen()
	{
		ID = holenNächsteSprachenID();
	}

	public int getID()
	{
		return ID;
	}

	public void setID(int pID)
	{
		ID = pID;
	}


	private int holenNächsteSprachenID()
	{
		int lNächsteID = 0;

		Statement stmt = null;
		ResultSet result = null;
		Connection lConnection = Datenbankverbindung.holen();
		try
		{
			stmt = lConnection.createStatement();
			result = stmt.executeQuery("SELECT idsprachkompetenz FROM sprachen.sprachkompetenz a ORDER BY idsprachkompetenz desc");
			result.first();
			lNächsteID = result.getInt("idsprachkompetenz") +1;
		}
		catch(Exception ex)
		{
			System.out.println("Fehler bei der Verarbeitung + " + "Sprache" + " " + ex.getMessage());
		}
		return lNächsteID;

	}



}
