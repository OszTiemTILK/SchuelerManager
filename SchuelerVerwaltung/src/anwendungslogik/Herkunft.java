package anwendungslogik;

public class Herkunft
{
private String staatsangehörigkeit;
private String volksgruppe;
private String geburtsort;
private String geburtsland;

/**
 * Ausgabe von Angaben zur Kontrolle für JavaFx
 */
	public void ausgebenZusammenfassungHerkunft()
	{
		System.out.println("Nationalitaet:			"+getStaatsangehörigkeit());
	}

public String getStaatsangehörigkeit()
{

	return staatsangehörigkeit;
}
public void setstaatsangehörigkeit(String pStaatsangehörigkeit)
{

	this.staatsangehörigkeit = pStaatsangehörigkeit;
}
public String getVolksgruppe()
{
	return volksgruppe;
}
public void setVolksgruppe(String pVolksgruppe)
{
	this.volksgruppe = pVolksgruppe;
}
public String getGeburtsort()
{
	return geburtsort;
}
public void setGeburtsort(String pGeburtsort)
{
	this.geburtsort = pGeburtsort;
}
public String getGeburtsland()
{
	return geburtsland;
}
public void setGeburtsland(String pGeburtsland)
{
	this.geburtsland = pGeburtsland;
}

}
