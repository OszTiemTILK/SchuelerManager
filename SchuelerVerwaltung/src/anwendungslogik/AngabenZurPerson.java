package anwendungslogik;

import java.time.LocalDate;

public class AngabenZurPerson
{
private String vorname;
private String nachname;
private LocalDate geburtsDatum;
private Geschlecht geschlecht;



public AngabenZurPerson(String pVorname , String pNachname , LocalDate pGeburtsdatum, Geschlecht pGeschlecht)
{
	super();
	this.vorname=pVorname;
	this.nachname=pNachname;
	this.geburtsDatum=pGeburtsdatum;
	this.geschlecht=pGeschlecht;


}
 /** 
 * Ausgabe von Angaben zur Kontrolle für FX
 */

 public void ausgeben()
 {
   System.out.println("Vorname:   "+getVorname());
   System.out.println("Nachname:   "+getNachname());
   System.out.println("Geburtsdatum:   "+getGeburtsDatum());
   System.out.println("Geschlecht:	"+getGeschlecht());
 }

/** legt Angaben zur Person an
 *
 */
public void anlegenAngabenZurPerson()
{

}
/** aendert Angaben zur Person
 *
 */
public void aendernAngabenZurPerson()
{

}
/** loescht Angaben zur Person
 *
 */
public void loeschenAngabenZurPerson()
{

}
/** speichert Angaben zur Person
 *
 */

public void ausgebenKonsoleTest()
{
	System.out.println("Name: " + vorname + " " + nachname);
	System.out.println("Geburtsdatum: " + getGeburtsDatum() );
	System.out.println("Geschlecht: " + geschlecht);
}

public void speichernAngabenZurPerson()
{

}



// getter und setter
public String getVorname()
{
	return vorname;
}


public void setVorname(String pVorname)
{
	this.vorname = pVorname;
}


public String getNachname()
{
	return nachname;
}


public void setNachname(String pNachname)
{
	this.nachname = pNachname;
}


public LocalDate getGeburtsDatum()
{
	return geburtsDatum;
}


public void setGeburtsDatum(LocalDate pGeburtsDatum)
{
	this.geburtsDatum = pGeburtsDatum;
}


public Geschlecht getGeschlecht()
{
	return geschlecht;
}


public void setGeschlecht(Geschlecht pGeschlecht)
{
	this.geschlecht = pGeschlecht;
}



}