package anwendungslogik;

public class ErziehungsberechtigteR
{
	private Vormund typ;
	private String vorname;
	private String nachname;
	private boolean vormund;
	private Adresse AdresseVonErziehungsberechtigteR = new Adresse();
	private Kontaktdaten KontaktdatenVonErziehungsberechtigteR = new Kontaktdaten();

/**
 * Ausgabe von Angaben zur Kontrolle f�r JavaFx
 */
	public void ausgebenZusammenfassungErziehungsberrechtigteRAngaben()
	{
		System.out.println("Erziehungsberechtigter:	");
		System.out.println("Vorname:			"+getVorname());
		System.out.println("Nachname:			"+getNachname());
		System.out.println("Strasse:			"+AdresseVonErziehungsberechtigteR.getStrasse());
		System.out.println("Hausnummer:			"+AdresseVonErziehungsberechtigteR.getHausNummer());
		System.out.println("PLZ:				"+AdresseVonErziehungsberechtigteR.getPlz());
		System.out.println("Wohnort:			"+AdresseVonErziehungsberechtigteR.getWohnort());
		System.out.println("Festnetznummer:			"+KontaktdatenVonErziehungsberechtigteR.getFestnetzNummer());
		System.out.println("Mobilnummer:			"+KontaktdatenVonErziehungsberechtigteR.getMobilNummer());
	}
	
	public void ausgeben()
	{
		System.out.println("Typ:				"+getTyp());
		System.out.println("Vorname:			"+getVorname());
		System.out.println("Nachname:			"+getNachname());
		System.out.println("Vormund:			"+getVormund());
	}


/**
 * Nur set- und get-Methoden ab hier
 */
	public Vormund getTyp()
	{
		return typ;
	}

	public void setTyp(Vormund pTyp)
	{
		this.typ = pTyp;
	}

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

	public boolean getVormund()
	{
		return vormund;
	}

	public void setVormund(boolean vormund)
	{
		this.vormund = vormund;
	}
	

	public Adresse getAdresseVonErziehungsberechtigteR()
	{
		return AdresseVonErziehungsberechtigteR;
	}

	public void setAdresseVonErziehungsberechtigteR(Adresse pAdresseVonErziehungsberechtigteR)
	{
		AdresseVonErziehungsberechtigteR = pAdresseVonErziehungsberechtigteR;
	}
}



