package anwendungslogik;

public class Sprachen {

	private boolean muttersprache;
	private String spname;
	private String sprachniveau;

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
	/**
	 * Ausgabe von Angaben zur Kontrolle f�r JavaFx
	 */
	public void ausgeben()
	{
		System.out.print("Die Sprache " + getSprachen());
		if(muttersprache == true)
		{
			System.out.print(" ist die Muttersprache der Person und ist auf dem Sprachniveau " + getSprachniveau() );
		}
		else
		{
			System.out.print(" ist auf dem Sprachniveau " + getSprachniveau() );
		}



	public String getSprachen()
	{
		return spname;
	}

	public void setSprachen(String pSprachen, boolean pMutterprache)
	{
		this.spname = pSprachen;
		this.muttersprache = pMuttersprache;
	}

	public String getSprachniveau()
	{
		return sprachniveau;
	}

	public void setSprachniveau(String pSprachniveau)
	{
		this.sprachniveau = pSprachniveau;
	}

}
