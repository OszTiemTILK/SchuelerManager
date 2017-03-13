package anwendungslogik;

public class Sprachen {

	private Boolean sprachenName;
	private String sprachNiveau;
	/**
	 * Leerer Kontruktor
	 */
	public Sprachen()
	{

	}
	/**
	 * Konstruktor mit Strings
	 * @param pSprachen
	 * @param pSprachniveau
	 */
	public Sprachen(Boolean pSprachenName, String pSprachNiveau)
	{
		this.sprachenName = pSprachenName;
		this.sprachNiveau = pSprachNiveau;
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

	public Boolean getSprachName()
	{
		return sprachenName;
	}
	public void setSprachName(Boolean pSprachenName)
	{
		this.sprachenName = pSprachenName;
	}
	public String getSprachNiveau()
	{
		return sprachNiveau;
	}
	public void setSprachNiveau(String pSprachNiveau)
	{
		this.sprachNiveau = pSprachNiveau;
	}


}
