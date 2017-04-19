package adresse;

import java.sql.Connection;
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

public void anlegenAdresse()
{
	speichernDB(wohnort , plz ,strasse, hausNummer);
	ausgeben();
}

//Datenbankmethoden
public void speichernDB(String pWohnort , int pPlz , String pStrasse, int pHausnummer)
{
Connection lConnection = Datenbankverbindung.holen();
Statement lBefehl;



try {
	lBefehl = lConnection.createStatement();
	lBefehl.execute("INSERT INTO adresse(Ort,PLZ,Straße,HausNr) VALUES("+pWohnort+","+pPlz+","+pStrasse+","+pHausnummer+")");

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