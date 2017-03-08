package anwendungslogik;

import java.time.LocalDate;

public class Lehrmittel {
private	String fach;
private	String art;
private	String name;
private LocalDate ausgegeben;
private	int lehrmittelID;

	/**
	 * Konstruktor ohne Parameter erstellt ein leeres Objekt
	 */
public Lehrmittel()
{

}

/**
 * Konstruktor mit Parametern zur verarbeitung von Daten
 * @param pFach
 * @param pArt
 * @param pName
 * @param pAusgegeben
 */
public Lehrmittel(String pFach, String pArt, String pName, LocalDate pAusgegeben)
{
	this.fach = pFach;
	this.art = pArt;
	this.name = pName;
	this.ausgegeben = pAusgegeben;

}
/**
 * Lehrmittel anlegen
 */
public void anlegen()
{

}


public String getFach() {
	return fach;
}

public void setFach(String fach) {
	this.fach = fach;
}

public String getArt() {
	return art;
}

public void setArt(String art) {
	this.art = art;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public LocalDate getAusgegeben() {
	return ausgegeben;
}

public void setAusgegeben(LocalDate ausgegeben) {
	this.ausgegeben = ausgegeben;
}

public int getLehrmittelID() {
	return lehrmittelID;
}

public void setLehrmittelID(int lehrmittelID) {
	this.lehrmittelID = lehrmittelID;
}
}
