/*
 * Hr. Jakob 25.02.2017 angelegt
 * Die IDs für Adressen werden automatisch vom System vergeben, dazu dient diese Klasse.
 */
package adresse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import datenbank.Datenbankverbindung;

public class AdressID
{


	private int ID = 0;


//  Konstruktoren
	AdressID()
	{
		ID = höchsteID()+1;
		
	}

	AdressID(int pIDFest)
	{
		setID(pIDFest);
	}

public int höchsteID()
{
	Connection lConnection = Datenbankverbindung.holen();
	Statement lBefehl;



	try {
		lBefehl = lConnection.createStatement();
		ResultSet rs;
		rs= lBefehl.executeQuery("SELECT IDAdresse FROM db_schulprojekt.adresse ORDER BY IDAdresse DESC");
		rs.first();
		int höchsteID = rs.getInt(1);
		return höchsteID;


	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return 0;

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
	

}
