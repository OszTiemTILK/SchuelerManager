package adresse;

import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import anwendungslogik.Geschlecht;
import datenbank.Datenbankverbindung;


public class Adresse
{
private String strasse;
private int hausNummer;
private String wohnort;
private int plz;
private String AdresseStraßeMitHausnummer;
private AdressID adressID;



public Adresse(String pStrasse, int pHausnummer, String pWohnort, int pPlz)
{
	this.strasse = pStrasse;
	this.hausNummer = pHausnummer;
	this.wohnort = pWohnort;
	this.plz = pPlz;
}

public Adresse(String pAdresseStraßeMitHausnummer, String pWohnort, int pPlz)
{
	this.AdresseStraßeMitHausnummer = pAdresseStraßeMitHausnummer;
	abtrennenHausnummer();
	this.wohnort = pWohnort;
	this.plz = pPlz;
}

/**
 * abtrennenHausnummer
 * Entfernt die Hausnummer aus dem Straßenattribut und fügt sie in das
 * Attribut Hausnummer ein.
 */
public void abtrennenHausnummer()
{
	Scanner lHausnummerScanner = new Scanner(AdresseStraßeMitHausnummer);
	this.strasse = lHausnummerScanner.next();
	this.hausNummer = lHausnummerScanner.nextInt();
	lHausnummerScanner.close();
}
public int suchenAdresseID()
{
	Connection lConnection = Datenbankverbindung.holen();
	Statement lBefehl;
	try
	{
		lBefehl = lConnection.createStatement();
		ResultSet result = lBefehl.executeQuery("SELECT IDAdresse FROM adresse WHERE Ort = '" + wohnort + "' AND PLZ = " + plz + " AND Straße = '" + strasse + "' AND HausNr = " + hausNummer);
		if(result.first())
		{
			int lAdresseID = result.getInt(1);
			System.out.println(lAdresseID);
			return lAdresseID;
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return -1;
}
public void anlegenAdresse()
{
	speichernDB();
	ausgeben();
}

//Datenbankmethoden
public void speichernDB()
{
Connection lConnection = Datenbankverbindung.holen();
Statement lBefehl;



try {
	lBefehl = lConnection.createStatement();
	AdressID lAdresse = new AdressID();
	this.adressID = lAdresse;

	lBefehl.execute("INSERT INTO db_schulprojekt.adresse(IDAdresse,Ort,PLZ,Straße,HausNr) VALUES("+lAdresse.getID()+",'"+wohnort+"',"+plz+",'"+strasse+"',"+hausNummer+")");


} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

public void ausgeben()
{
	System.out.print("AdresseStraßeMitHausnummer: " + getAdresseStraßeMitHausnummer());
	System.out.println();
	System.out.print("Straße: " + getStrasse());
	System.out.println();
	System.out.print("Nr. " + getHausNummer());
	System.out.println();
	System.out.print("Wohnort: " + getWohnort());
	System.out.println();
	System.out.print("PLZ: " + getPlz());
	System.out.println();
	System.out.println("ID: "+ adressID.getID());
}



/**
 * Nur set- und get-Methoden ab hier
 */

public String getStrasse()
{
	return strasse;
}
public void setStrasse(String pStrasse)
{
	this.strasse = pStrasse;
}
public int getHausNummer()
{
	return hausNummer;
}
public void setHausNummer(int pHausNummer)
{
	this.hausNummer = pHausNummer;
}
public String getWohnort()
{
	return wohnort;
}
public void setWohnort(String pWohnort)
{
	this.wohnort = pWohnort;
}
public int getPlz()
{
	return plz;
}
public void setPlz(int pPlz)
{
	this.plz = pPlz;
}

public String getAdresseStraßeMitHausnummer() {
	return AdresseStraßeMitHausnummer;
}
public void setAdresseStraßeMitHausnummer(String adresseStraßeMitHausnummer) {
	AdresseStraßeMitHausnummer = adresseStraßeMitHausnummer;
}

}