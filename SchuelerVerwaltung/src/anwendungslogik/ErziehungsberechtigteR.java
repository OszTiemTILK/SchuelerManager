package anwendungslogik;

public class ErziehungsberechtigteR
{
	private Vormund typ;
	private String vorname;
	private String nachname;
	private boolean vormund;
	private Adresse AdresseVonErziehungsberechtigteR = new Adresse();

//Nur set- und get-Methoden ab hier

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

	public boolean isVormund()
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
