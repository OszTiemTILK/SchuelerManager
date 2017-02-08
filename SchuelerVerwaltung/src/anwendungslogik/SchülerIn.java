package anwendungslogik;

public class SchülerIn
{
private AngabenZurPerson person = new AngabenZurPerson();
private Sprachen sprachen = new Sprachen();
private Kontaktdaten kontakt = new Kontaktdaten();
public AngabenZurPerson getPerson()
{
	return person;
}
public void setPerson(AngabenZurPerson pPerson)
{
	this.person = pPerson;
}
public Sprachen getSprachen()
{
	return sprachen;
}
public void setSprachen(Sprachen pSprachen)
{
	this.sprachen = pSprachen;
}
public Kontaktdaten getKontakt()
{
	return kontakt;
}
public void setKontakt(Kontaktdaten pKontakt)
{
	this.kontakt = pKontakt;
}

}
