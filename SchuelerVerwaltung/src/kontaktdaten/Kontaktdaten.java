package kontaktdaten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.*;
import java.util.ArrayList;




public class Kontaktdaten
{
private KontaktdatenID	kontaktdatenID;
private String festnetzNummer;
private String mobilNummer;
private String email;
//private String fax; //wird erstmal nicht gebraucht
private String vorname;
private String name;
/*
 * Konstruktoren
 */
public Kontaktdaten (int pKontaktdatenID)
{

    this.kontaktdatenID = new KontaktdatenID(pKontaktdatenID);
}
public Kontaktdaten (String pVorname, String pName)
{
	this.vorname = pVorname;
	this.name = pName;
}
public Kontaktdaten (String pFestnetznummer, String pMobilnummer, String pEmail)
{

    this.kontaktdatenID = new KontaktdatenID();
    this.festnetzNummer = pFestnetznummer;
    this.mobilNummer = pMobilnummer;
    this.email =pEmail;

}
public Kontaktdaten (String pFestnetznummer, String pMobilnummer, String pEmail, String pName, String pVorname)
{

	this.kontaktdatenID = this.suchenID();
	this.festnetzNummer = pFestnetznummer;
	this.mobilNummer = pMobilnummer;
	this.email =pEmail;
	this.name = pName;
	this.vorname = pVorname;

}
public Kontaktdaten (int pKontaktdatenID,String pFestnetznummer, String pMobilnummer, String pEmail)
{

    this.kontaktdatenID = new KontaktdatenID(pKontaktdatenID);
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
    //System.out.println("Fax:					"+getFax());
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
public void setID(KontaktdatenID pID)
{
    this.kontaktdatenID = pID;
}
public KontaktdatenID getID()
{
    return this.kontaktdatenID;
}


/*
public String getFax()
{
    return fax;
}
public void setFax(String pFax)
{
    this.fax = pFax;
}
*/
//Datenbank Methoden

public void ergänzen()
{
  Kontaktdaten lKontaktdaten = auslesenDB(this.kontaktdatenID.getID());
  email = lKontaktdaten.email ;
  mobilNummer = lKontaktdaten.mobilNummer;
  festnetzNummer = lKontaktdaten.festnetzNummer;


}

public void speichernDB()
{
  Connection lConnection = VerbindungKontaktdaten.holen();
  Statement lBefehl;



  try
  {
    lBefehl = lConnection.createStatement();
    lBefehl.execute("INSERT INTO kontaktdaten VALUES (" + kontaktdatenID.getID() + ",'"+getEmail()+"','"+getMobilNummer()+"','"+getFestnetzNummer()+"')");

  } catch (SQLException e)
      {
    // TODO Auto-generated catch block
    e.printStackTrace();
      }

}

public static Kontaktdaten auslesenDB(int pKontaktdatenIDWert)
{

      Connection lConnection = VerbindungKontaktdaten.holen();
      Kontaktdaten lKontakdaten;
     // ArrayList<Kontaktdaten> lKontaktdatenListe = new ArrayList<Kontaktdaten>();
      Statement lBefehl;
      ResultSet lErgebnis;

      try {
      lBefehl = lConnection.createStatement();
      lErgebnis = lBefehl.executeQuery("SELECT * FROM kontaktdaten WHERE IDKontaktd = "+pKontaktdatenIDWert);
      lErgebnis.first();  //Zeigt auf den ersten Datensatz in lErgebnis

      while(! lErgebnis.isAfterLast())   //Solange das Ende nicht erreicht ist....
         {
           lKontakdaten = new Kontaktdaten(lErgebnis.getInt(1),lErgebnis.getString(3),lErgebnis.getString(4),lErgebnis.getString(2));
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

public KontaktdatenID /*int*/ /*herausdestillierenID*/ suchenID()
{
	Connection lConnection = VerbindungKontaktdaten.holen();
    Kontaktdaten lKontakdaten;
    Statement lBefehl;
    ResultSet lErgebnis;

    try
    {
    lBefehl = lConnection.createStatement();

	lErgebnis = lBefehl.executeQuery("SELECT IDKontaktdaten FROM schüler WHERE Nachname = "+ name + "and Vorname" + vorname);
    lErgebnis.first();  //Zeigt auf den ersten Datensatz in lErgebnis

	KontaktdatenID pID = new KontaktdatenID(lErgebnis.getInt(2));
	return pID;

    }
    catch (Exception ex)
    {
    	System.out.println("Fehler bei der Verarbeitung + " + "n" + ex.getMessage());
    }
    	return null;

    }


}