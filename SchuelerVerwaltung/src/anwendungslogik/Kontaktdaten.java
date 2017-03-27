package anwendungslogik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.*;
import java.util.ArrayList;

import datenbank.VerbindungKontaktdaten;



public class Kontaktdaten
{
//KontaktdatenID	kontakdatenID
private String festnetzNummer;
private String mobilNummer;
private String email;
private String fax;

/*
 * Konstruktoren
 */
public Kontaktdaten (int pKontaktdatenID)
{
	//super();
	//this.kontakdatenID = new KontaktdatenID(pKontaktdatenID);
}
public Kontaktdaten (String pFestnetznummer, String pMobilnummer, String pEmail)
{
	//super();
	//this.kontakdatenID = new KontaktdatenID();
	this.festnetzNummer = pFestnetznummer;
	this.mobilNummer = pMobilnummer;
	this.email =pEmail;

}
public Kontaktdaten (int pKontaktdatenID,String pFestnetznummer, String pMobilnummer, String pEmail)
{
	//super();
	//this.kontakdatenID = new KontaktdatenID(pKontaktdatenID);
	this.festnetzNummer = pFestnetznummer;
	this.mobilNummer = pMobilnummer;
	this.email =pEmail;

}

/**
 * Ausgabe von Angaben zur Kontrolle f�r JavaFx
 */
public void ausgeben()
{
	System.out.println("Festnetznummer:			"+getFestnetzNummer());
	System.out.println("Mobilniummer:			"+getMobilNummer());
	System.out.println("E-Mail:					"+getEmail());
	System.out.println("Fax:					"+getFax());
}

public String getFestnetzNummer()
{
	return festnetzNummer;
}
public void setFestnetzNummer(String pFestnetzNummer)
{
	this.festnetzNummer = pFestnetzNummer;
}
public String getMobilNummer()
{
	return mobilNummer;
}
public void setMobilNummer(String pMobilNummer)
{
	this.mobilNummer = pMobilNummer;
}
public String getEmail()
{
	return email;
}
public void setEmail(String pEmail)
{
	this.email = pEmail;
}
public String getFax()
{
	return fax;
}
public void setFax(String pFax)
{
	this.fax = pFax;
}

//Datenbank Methoden


public void speichernDB()
{
  Connection lConnection = VerbindungKontaktdaten.holen();
  Statement lBefehl;
  ResultSet lErgebnis;


  try
  {
	lBefehl = lConnection.createStatement();
	lBefehl.execute("INSERT INTO kontaktdaten VALUES ("+/*ID*/ +",'"+getFestnetzNummer()+"','"+getMobilNummer()+"','"+getEmail()+"')");

  } catch (SQLException e)
  	{
	// TODO Auto-generated catch block
	e.printStackTrace();
  	}

}

public static Kontaktdaten auslesenDB(int FahrradausleiheIDWert)
{

      Connection lConnection = VerbindungKontaktdaten.holen();
      Kontaktdaten lKontakdaten;
	 // ArrayList<Kontaktdaten> lKontaktdatenListe = new ArrayList<Kontaktdaten>();
	  Statement lBefehl;
	  ResultSet lErgebnis;

	  try {
	  lBefehl = lConnection.createStatement();
	  lErgebnis = lBefehl.executeQuery("SELECT * FROM kontaktdaten WHERE ID = "+ /*ID*/);
	  lErgebnis.first();  //Zeigt auf den ersten Datensatz in lErgebnis

	  while(! lErgebnis.isAfterLast())   //Solange das Ende nicht erreicht ist....
	     {
		   lKontakdaten = new Kontaktdaten(lErgebnis.getInt(1),lErgebnis.getString(2),lErgebnis.getString(3),lErgebnis.getString(4));
		   //lKontaktdatenListe.add(lKontakdaten);
		   //Spezial für dieses Beispiel springen wir gleich wieder raus.
         // Sonst kann man hier eine Liste füllen.
		   return lKontakdaten;
	     }


	  	 } catch (Exception ex)
	  		{
	    System.out.println("Fehler bei der Verarbeitung + " + "n" + ex.getMessage());
	  		}
	  return null;
}




}