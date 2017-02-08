package java;

import java.time.LocalDate;

public class AngabenZurPerson
{
private String vorname;
private String nachname;
private LocalDate geburtsDatum;
private Boolean geschlecht;

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
public void speichernAngabenZurPerson()
{

}











public String getVorname()
{
	return vorname;
}


public void setVorname(String pVorname)
{
	this.vorname = vorname;
}


public String getNachname()
{
	return nachname;
}


public void setNachname(String pNachname)
{
	this.nachname = nachname;
}


public LocalDate getGeburtsDatum()
{
	return geburtsDatum;
}


public void setGeburtsDatum(LocalDate pGeburtsDatum)
{
	this.geburtsDatum = geburtsDatum;
}


public boolean isGeschlecht()
{
	return geschlecht;
}


public void setGeschlecht(boolean pGeschlecht)
{
	this.geschlecht = geschlecht;
}


}
