package java;

public class Adresse
{
private String strasse;
private int hausNummer;
private String wohnort;
private int plz;

//Nur set- und get-Methoden ab hier 
  
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

}