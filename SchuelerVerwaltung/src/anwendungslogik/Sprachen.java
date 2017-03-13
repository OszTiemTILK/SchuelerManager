/*
 * Jose 08.03.2017 angelegt
 */
package anwendungslogik;

public class Sprachen {
	private Boolean sprachenName;
	private String sprachenNiveau;
	/**
	 * Leerer Kontruktor
	 */
	public Sprachen()
	{

	}
	/**
	 * Konstruktor mit Strings
	 * @param pSprachenName
	 * @param pSprachenNiveau
	 */
	public Sprachen(Boolean pSprachenName, String pSprachenNiveau)
	{
		this.sprachenName = pSprachenName;
		this.sprachenNiveau = pSprachenNiveau;
	}
	/** legt Sprachen an
	 *
	 */
	public void anlegenSprachen()
	{

	}
	/** aendert Sprachen
	 *
	 */
	public void aendernSprachen()
	{

	}
	/** loescht Angaben zur Person
	 *
	 */
	public void loeschenSprachen()
	{

	}
	/** speichert Sprachen
	 *
	 */
	public void speichernSprachen()
	{

	}
// Ab hier folgen nur Get/Set Methoden
	public Boolean getSprachenName()
	{
		return sprachenName;
	}
	public void setSprachenName(Boolean pSprachenName)
	{
		this.sprachenName = pSprachenName;
	}
	public String getSprachenNiveau()
	{
		return sprachenNiveau;
	}
	public void setSprachenNiveau(String pSprachenNiveau)
	{
		this.sprachenNiveau = pSprachenNiveau;
	}
}
