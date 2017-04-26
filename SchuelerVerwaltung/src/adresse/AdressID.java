/*
 * Hr. Jakob 25.02.2017 angelegt
 * Die IDs für Adressen werden automatisch vom System vergeben, dazu dient diese Klasse.
 */
package adresse;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import datenbank.Datenbankverbindung;

public class AdressID
{
    private static int aktuelleID =-1; //letzte vergebene ID

	private int ID = 0;

//  Konstruktoren

	AdressID()
	{
		ID = aktuelleID + 1;
		setAktuelleID(ID);
	}

	AdressID(int pIDFest)
	{
		setID(pIDFest);
	}


//methoden


	public int hohlenHöchsteAdressID()
	{
		Connection lConnection = Datenbankverbindung.holen();
		Statement lBefehl;



		try {
			lBefehl = lConnection.createStatement();
			ResultSet result= lBefehl.executeQuery("SELECT IDAdresse FROM adresse ORDER BY IDAdresse DESC LIMIT 1");
			result.first();
			int lHöchsteID =result.getInt(1);
			return lHöchsteID;



		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			int z=-1;
			return z;

		}
	}








//  Getter Setter Methoden

	public int getID()
	{
		return ID;
	}
	public void setID(int iD)
	{
		ID = iD;
	}
	public static int getAktuelleID()
	{
		return aktuelleID;
	}

	private static void setAktuelleID(int pAktuelleID)
	{
		AdressID.aktuelleID = pAktuelleID;
	}

}
