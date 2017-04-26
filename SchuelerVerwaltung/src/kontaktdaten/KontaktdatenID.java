package kontaktdaten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.*;
import java.util.ArrayList;



public class KontaktdatenID
{
/*
 *
 */
    private static int aktuelleID = 1; //letzte vergebene ID

	private int ID = 0;

	private String StringID = null;
	private void UpdateStID()
	{
		StringID = String.valueOf(ID);
	}

//  Konstruktoren

	KontaktdatenID()
	{
		ID = holenHöchsteID() + 1;
		setAktuelleID(ID);
	}

	KontaktdatenID(int pIDFest)
	{
		setID(pIDFest);
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
		KontaktdatenID.aktuelleID = pAktuelleID;
	}

	public String getStringID()
	{
		UpdateStID();
		return this.StringID;
	}

	private int holenHöchsteID()
	{
		 Connection lConnection = VerbindungKontaktdaten.holen();

		  Statement lBefehl;
		  ResultSet lErgebnis;

		  try
		  {
		  lBefehl = lConnection.createStatement();
		  lErgebnis = lBefehl.executeQuery("SELECT MAX( IDKontaktd) FROM kontaktdaten;");
		  lErgebnis.first();
		  int Ergebnis= lErgebnis.getInt(1);
		  return Ergebnis;

		   }



		  catch (SQLException ex)
	  		{
	    System.out.println("Fehler bei der Verarbeitung + " + "n" + ex.getMessage());
	    return 0;
	  		}

	}
}




