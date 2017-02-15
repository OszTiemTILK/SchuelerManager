package anwendungslogik;

public class SchülerIn
{
private SchülerID schülerInID = new SchülerID();
private AngabenZurPerson person = new AngabenZurPerson();
private Sprachen sprachen = new Sprachen();
private Kontaktdaten kontakt = new Kontaktdaten();
private Kontaktdaten kontaktSchüler = new Kontaktdaten();
private Kontaktdaten kontaktVater = new Kontaktdaten();
private Kontaktdaten kontaktMutter = new Kontaktdaten();
private Kontaktdaten kontaktAndere = new Kontaktdaten();
private Schülerverhältnisse schülerverhältnisse = new Schülerverhältnisse();
private Herkunft herkunft = new Herkunft();
private ErziehungsberechtigteR vormund = new ErziehungsberechtigteR();
private BeruflicheBildungVorbereitungBefähigung beruficheVorbereitung = new BeruflicheBildungVorbereitungBefähigung();
private AllgemeinbildendeSchule aktuelleSchule = new AllgemeinbildendeSchule();
private Adresse adresse = new Adresse();

public void ausgeben()
{
adresse.ausgeben();
person.ausgeben();
//sprachen.ausgeben();
//kontaktSchüler.ausgeben();
//kontaktVater.ausgeben();
//kontaktMutter.ausgeben();
//kontaktAndere.ausgeben();
//schülerverhältnisse.ausgeben();
//herkunft.ausgeben();
//vormund.ausgeben();
//beruflicheVorbereitung.ausgeben();
aktuelleSchule.ausgeben();
}

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
public Kontaktdaten getKontaktschüler()
{
	return kontaktSchüler;
}
public void setKontaktschüler(Kontaktdaten pKontaktschüler)
{
	this.kontaktSchüler = pKontaktschüler;
}
public Kontaktdaten getKontaktvater()
{
	return kontaktVater;
}
public void setKontaktvater(Kontaktdaten pKontaktvater)
{
	this.kontaktVater = pKontaktvater;
}
public Kontaktdaten getKontaktmutter()
{
	return kontaktMutter;
}
public void setKontaktmutter(Kontaktdaten pKontaktmutter)
{
	this.kontaktMutter = pKontaktmutter;
}
public Kontaktdaten getKontaktandere()
{
	return kontaktAndere;
}
public void setKontaktandere(Kontaktdaten pKontaktandere)
{
	this.kontaktAndere = pKontaktandere;
}
public Schülerverhältnisse getSchülerverhalten()
{
	return schülerverhältnisse;
}
public void setSchülerverhalten(Schülerverhältnisse pSchülerverhalten)
{
	this.schülerverhältnisse = pSchülerverhalten;
}
public Herkunft getHerkunft()
{
	return herkunft;
}
public void setHerkunft(Herkunft pHerkunft)
{
	this.herkunft = pHerkunft;
}
public ErziehungsberechtigteR getVormund()
{
	return vormund;
}
public void setVormund(ErziehungsberechtigteR pVormund)
{
	this.vormund = pVormund;
}
public BeruflicheBildungVorbereitungBefähigung getBerufichevorbereitung()
{
	return beruficheVorbereitung;
}
public void setBerufichevorbereitung(BeruflicheBildungVorbereitungBefähigung pBerufichevorbereitung)
{
	this.beruficheVorbereitung = pBerufichevorbereitung;
}
public AllgemeinbildendeSchule getAktuelleschule()
{
	return aktuelleSchule;
}
public void setAktuelleschule(AllgemeinbildendeSchule pAktuelleschule)
{
	this.aktuelleSchule = pAktuelleschule;
}
public Adresse getAdresse()
{
	return adresse;
}
public void setAdresse(Adresse pAdresse)
{
	this.adresse = pAdresse;
}
public SchülerID getSchülerInID()
{
	return schülerInID;
}
public void setSchülerID(SchülerID pSchülerID)
{
	this.schülerInID = pSchülerID;
}

}
