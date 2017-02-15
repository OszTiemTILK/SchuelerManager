package anwendungslogik;

public class Adresse
{
private String strasse;
private int hausNummer;
private String wohnort;
private int plz;

public Adresse(String pStrasse, int pHausnummer, String pWohnort, int pPlz)
{
	this.strasse = pStrasse;
	this.hausNummer = pHausnummer;
	this.wohnort = pWohnort;
	this.plz = pPlz;
}
//Nur set- und get-Methoden ab hier  ... und ausgeben

public void anlegenAdresse()
{

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