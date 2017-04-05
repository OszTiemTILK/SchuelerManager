package adresse;

import java.util.Scanner;

public class Adresse
{
private String strasse;
private int hausNummer;
private String wohnort;
private int plz;
private String AdresseStraßeMitHausnummer;
/**
 * Konstruktor ohne Parameter erstellt ein leeres Objekt
 */
public Adresse() {}
/**
 * Konstrukter
 * @param pStrasse
 * @param pHausnummer
 * @param pWohnort
 * @param pPlz
 */
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
	this.wohnort = pWohnort;
	this.plz = pPlz;
}

/**
 * Konstruktor mit Strings
 * @param pStrasse
 * @param pHausnummer
 * @param pWohnort
 * @param pPlz
 */
public Adresse(String pStrasse, String pHausnummer, String pWohnort, String pPlz)
{
	this(pStrasse, Integer.parseInt(pHausnummer), pWohnort, Integer.parseInt(pPlz));
}


/**
 * abtrennenHausnummer
 * Entfernt die Hausnummer aus dem Straßenattribut und fügt sie in das
 * Attribut Hausnummer ein.
 */
public void abtrennenHausnummer()
{
	Integer lHausnummer = 0;
	Scanner lStraßenStringEingescannt = new Scanner(strasse);
	while (lStraßenStringEingescannt.hasNext())
	{
	  if (lStraßenStringEingescannt.hasNextInt())
		{
		  lHausnummer = lStraßenStringEingescannt.nextInt();}
	  else
	  {
         lStraßenStringEingescannt.next();
	  }
	}
	this.hausNummer = lHausnummer;
	this.strasse = this.strasse.replace(lHausnummer.toString(), "").trim();
}

//Nur set- und get-Methoden ab hier  ... und ausgeben

public void anlegenAdresse()
{
	speichernAdresse();
}

public void speichernAdresse()
{
	ausgeben();
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

public void ausgeben()
{
	System.out.print("Straße: " + getStrasse());
	System.out.print("Nr. " + getHausNummer());
	System.out.println();
	System.out.print("Wohnort: " + getWohnort());
	System.out.print("PLZ: " + getPlz());
	System.out.println();
}

}