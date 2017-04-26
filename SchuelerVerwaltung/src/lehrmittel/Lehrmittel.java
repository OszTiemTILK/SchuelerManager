package lehrmittel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import datenbank.Datenbankverbindung;

public class Lehrmittel {
private	String fach;
private	String art;
private	String name;
private	LehrmittelID lehrmittelID;

	/**
	 * Konstruktor ohne Parameter erstellt ein leeres Objekt
	 */
public Lehrmittel()
{

}

/**
 * Konstruktor mit Parametern zur verarbeitung von Daten
 * @param pFach
 * @param pArt : Art des Buches. Bsp. Fachbuch, Formelbuch
 * @param pName
 */
public Lehrmittel(String pFach, String pArt, String pName, LehrmittelID pLehrmittelID)
{
	this.fach = pFach;
	this.art = pArt;
	this.name = pName;
	this.lehrmittelID = pLehrmittelID;
}
/**
 * Greift auf die Datenbanken zu und gibt für ein Fach ein bestimmtes Array mit den Lehrmitteln zurück.
 * @param pFach
 * @return Arraylist mit Lehrmitteln
 */
public static Lehrmittel[] holenFürFach(String pFach)
{
	ArrayList<Lehrmittel> lArraylist = new ArrayList<Lehrmittel>();
	Statement stmt = null;
	ResultSet result = null;
	Connection lConnection = Datenbankverbindung.holen();
	try
	{
	     stmt = lConnection.createStatement();
	     result = stmt.executeQuery("SELECT * FROM Lernmittel l WHERE Fach = '" + pFach + "'");
	     result.first();  //Zeigt auf den ersten Datensatz in result

	     while(! result.isAfterLast()) { // as long as valid data is in the result set

	         lArraylist.add(new Lehrmittel(result.getString("Fach"), result.getString("Art"), result.getString("Name"), new LehrmittelID(result.getInt("IDLernm"))));

	         result.next(); // geht zum nächsten Datensatz in result
	       }
	}

    catch (Exception ex)
	{
        System.out.println("Fehler bei der Verarbeitung + " + "Lernmittel" + " " + ex.getMessage());
    }

	return lArraylist.toArray(new Lehrmittel[lArraylist.size()]);
}

public static LehrmittelID holenID(String pFach, String pArt, String pName){
	LehrmittelID lLernmID = null;
	//	ArrayList<Lehrmittel> lArraylist = new ArrayList<Lehrmittel>();

	Statement stmt = null;
	ResultSet result = null;
	Connection lConnection = Datenbankverbindung.holen();
	try
	{
	     stmt = lConnection.createStatement();
	     result = stmt.executeQuery("SELECT IDLernm FROM Lernmittel l WHERE Art = '" + pArt + "'" + " and Fach = '" + pFach + "' and Name = '" + pName + "'");
	     result.first();  //Zeigt auf den ersten Datensatz in result
/*
	     while(! result.isAfterLast()) { // as long as valid data is in the result set

	         lArraylist.add(new Lehrmittel(result.getString("Fach"), result.getString("Art"), result.getString("Name"), new LehrmittelID(result.getInt("IDLernm"))));

	         result.next(); // geht zum nächsten Datensatz in result
	       }
*/
	     lLernmID = new LehrmittelID(result.getInt("IDLernm"));
	}

    catch (Exception ex)
	{
        System.out.println("Fehler bei der Verarbeitung + " + "Lernmittel" + " " + ex.getMessage());
    }

	return lLernmID;
}

public String getFach()
{
	return fach;
}

public void setFach(String pFach)
{
	this.fach = pFach;
}

public String getArt()
{
	return art;
}

public void setArt(String art)
{
	this.art = art;
}

public String getName()
{
	return name;
}

public void setName(String name)
{
	this.name = name;
}

public LehrmittelID getLehrmittelID()
{
	return lehrmittelID;
}

public void setLehrmittelID(LehrmittelID pLehrmittelID)
{
	this.lehrmittelID = pLehrmittelID;
}
}
