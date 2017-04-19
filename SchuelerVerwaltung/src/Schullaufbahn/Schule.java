package Schullaufbahn;


import java.time.LocalDate;
import java.sql.*;

public class Schule
{
	private LocalDate einschulung;
	private LocalDate abgang;
	private int ausgeschiedenAusJahrgang;
	private boolean sonderschule;
	private boolean hauptschule;
	private boolean realschule;
	private boolean sekundarschule;
	private boolean gesamtschule;
	private boolean gymnasium;
	private String schulname;
	private String bezirk;
	private String stadt;
	private String land;
	private String erreichterAbschluss;
	private String bemerkungen;
    IDSchule iDSchule;
    private String typ;
    private String straße;
    private String ort;



	/**
	 * Konstruktor ohne Parameter erstellt ein leeres Objekt
	 */
	public Schule() {}

	/**
	 * Konstruktor
	 * @param pAusgeschiedenAm
	 * @param pAusgeschiedenAusJahrgang
	 * @param pSonderschule
	 * @param pHauptschule
	 * @param pRealschule
	 * @param pSekundarschule
	 * @param pGesamtschule
	 * @param pGymnasium
	 * @param pSchulname
	 * @param pBezirk
	 * @param pStadt
	 * @param pLand
	 * @param pErreichterAbschluss
	 * @param pBemerkung
	 */

	public Schule(LocalDate pAusgeschiedenAm, int pAusgeschiedenAusJahrgang, boolean pSonderschule, boolean pHauptschule, boolean pRealschule,boolean pSekundarschule, boolean pGesamtschule, boolean pGymnasium, String pSchulname, String pBezirk, String pStadt, String pLand, String pErreichterAbschluss, String pBemerkung)
	{
			this.abgang = pAusgeschiedenAm;
			this.ausgeschiedenAusJahrgang = pAusgeschiedenAusJahrgang;
			this.sonderschule = pSonderschule;
			this.hauptschule = pHauptschule;
			this.realschule = pRealschule;
			this.sekundarschule = pSekundarschule;
			this.gesamtschule = pGesamtschule;
			this.gymnasium = pGymnasium;
			this.schulname = pSchulname;
			this.bezirk = pBezirk;
			this.stadt = pStadt;
			this.land = pLand;
			this.erreichterAbschluss = pErreichterAbschluss;
			this.bemerkungen = pBemerkung;
	}
	/**
	 * Test-Konstrunkor und testbereich
	 */
	public Schule(int pIDSchule, String pSchulname, String pTyp, String pStraße, String pOrt)
	{
			this.schulname = pSchulname;
			this.iDSchule = new IDSchule(pIDSchule);
			this.typ = pTyp;
			this.straße = pStraße;
			this.ort = pOrt;
			
	}

	


	/**
	 * Ende des Testbereiches
	 */

	public void anlegen()
	{
		speichern();
	}
	public void speichern()
	{
	  Connection lConnection = DBVerbindungSchullaufbahn.holen();
	  Statement lBefehl;
	  ResultSet lErgebnis;

	  try
	  {
		lBefehl = lConnection.createStatement();
		lBefehl.execute("INSERT INTO db_schulprojekt.schule VALUES ("+iDSchule.getIDSchule()+",\""+schulname+"\",\""+typ+"\",\""+straße+"\",\""+ort+"\")");
	  } catch (SQLException e)
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	}




	public void anlegenAllgemeinbildendeSchule()
	{

	}
	public void aendernAllgemeinbildendeSchule()
	{

	}
	public void loeschenAllgemeinbildendeSchule()
	{

	}

	public void ausgeben()
	{
		System.out.println(abgang.toString());
		System.out.println(ausgeschiedenAusJahrgang);
		System.out.println(sonderschule);
		System.out.println(hauptschule);
		System.out.println(realschule);
		System.out.println(sekundarschule);
		System.out.println(gesamtschule);
		System.out.println(gymnasium);
		System.out.println(schulname);
		System.out.println(bezirk);
		System.out.println(stadt);
		System.out.println(land);
		System.out.println(erreichterAbschluss);
		System.out.println(bemerkungen);
	}
	public LocalDate getAusgeschiedenAm()
	{
		return abgang;
	}
	public void setAusgeschiedenAm(LocalDate pDatum)
	{
		this.abgang = pDatum;
	}
	public int getAusgeschiedenAusJahrgang()
	{
		return ausgeschiedenAusJahrgang;
	}
	public void setAusgeschiedenAusJahrgang(int pJahr)
	{
		this.ausgeschiedenAusJahrgang = pJahr;
	}
	public boolean isSonderschule()
	{
		return sonderschule;
	}
	public void setSonderschule(boolean pSonderschule)
	{
		this.sonderschule = pSonderschule;
	}
	public boolean isHauptschule()
	{
		return hauptschule;
	}
	public void setHauptschule(boolean pHauptschule)
	{
		this.hauptschule = pHauptschule;
	}
	public boolean isRealschule()
	{
		return realschule;
	}
	public void setRealschule(boolean pRealschule)
	{
		this.realschule = pRealschule;
	}
	public boolean isSekundarschule()
	{
		return sekundarschule;
	}
	public void setSekundarschule(boolean pSekundarschule)
	{
		this.sekundarschule = pSekundarschule;
	}
	public boolean isGesamtschule()
	{
		return gesamtschule;
	}
	public void setGesamtschule(boolean pGesamtschule)
	{
		this.gesamtschule = pGesamtschule;
	}
	public boolean isGymnasium()
	{
		return gymnasium;
	}
	public void setGymnasium(boolean pGymnasium)
	{
		this.gymnasium = pGymnasium;
	}
	public String getSchulname()
	{
		return schulname;
	}
	public void setSchulname(String pSchulname)
	{
		this.schulname = pSchulname;
	}
	public String getErreichterAbschluss()
	{
		return erreichterAbschluss;
	}
	public void setErreichterAbschluss(String pErreichterAbschluss)
	{
		this.erreichterAbschluss = pErreichterAbschluss;
	}
	public String getBemerkungen()
	{
		return bemerkungen;
	}
	public void setBemerkungen(String pBemerkungen)
	{
		this.bemerkungen = pBemerkungen;
	}
	public String getBezirk()
	{
		return bezirk;
	}
	public void setBezirk(String pBezirk)
	{
		this.bezirk = pBezirk;
	}
	public String getStadt()
	{
		return stadt;
	}
	public void setStadt(String pStadt)
	{
		this.stadt = pStadt;
	}
	public String getLand()
	{
		return land;
	}
	public void setLand(String pLand)
	{
		this.land = pLand;
	}
	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) 
	{
		this.typ = typ;
	}

	public String getStraße() 
	{
		return straße;
	}

	public void setStraße(String straße) 
	{
		this.straße = straße;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) 
	{
		this.ort = ort;
	}

	public Schule( String pSchulname)
	{
			this.schulname = pSchulname;
	}
	
	public LocalDate getEinschulung() {
		return einschulung;
	}

	public void setEinschulung(LocalDate einschulung) {
		this.einschulung = einschulung;
	}

	public LocalDate getAbgang() {
		return abgang;
	}

	public void setAbgang(LocalDate abgang) {
		this.abgang = abgang;
	}

}
