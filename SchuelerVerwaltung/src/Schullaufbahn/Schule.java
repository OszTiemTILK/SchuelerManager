/*
 * geändert von Bryan, Fin, Aslan
 *
 */
package Schullaufbahn;



import java.time.LocalDate;
import java.sql.*;

public class Schule
{
	private LocalDate ausgeschiedenAm;
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
    private String Straße;
    private String Ort;
    private LocalDate Datum1;
    private LocalDate Datum2;
    IDbesucht iDbesucht;
    IDSchüler iDSchüler;
    private String Zeugnis;


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
			this.ausgeschiedenAm = pAusgeschiedenAm;
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
			this.Straße = pStraße;
			this.Ort = pOrt;
	}

	public Schule(String pSchulname, String pTyp, String pStraße, String pOrt, LocalDate pDatum1, LocalDate pDatum2, int pIDbesucht, int pIDSchüler, String pZeugnis)
	{
			this.schulname = pSchulname;
			this.iDSchule = new IDSchule();
			this.typ = pTyp;
			this.Straße = pStraße;
			this.Ort = pOrt;
			this.Datum1 = pDatum1;
			this.Datum2 = pDatum2;
			this.iDbesucht = new IDbesucht(pIDbesucht);
			this.iDSchüler = new IDSchüler(pIDSchüler);
			this.Zeugnis   = pZeugnis;
	}

	public Schule(LocalDate pDatum1, LocalDate pDatum2, int pIDbesucht, int pIDSchüler, String pZeugnis)
	{
			this.Datum1 = pDatum1;
			this.Datum2 = pDatum2;
			this.iDbesucht = new IDbesucht(pIDbesucht);
			this.iDSchüler = new IDSchüler(pIDSchüler);
			this.Zeugnis   = pZeugnis;
	}

	public Schule( String pSchulname)
	{
			this.schulname = pSchulname;
	}


	/**
	 * Ende des Testbereiches
	 */

	public void anlegen()
	{
		speichern();
		System.out.println(iDSchule.getIDSchule());
		speichern2();
	}
	public void speichern()
	{
	  Connection lConnection = DBVerbindungSchullaufbahn.holen();
	  Statement lBefehl;
	  ResultSet lErgebnis;

	  try
	  {
		lBefehl = lConnection.createStatement();
		
		lBefehl.execute("INSERT INTO db_schulprojekt.schule VALUES ("+iDSchule.getIDSchule()+",\""+schulname+"\",\""+typ+"\",\""+Straße+"\",\""+Ort+"\")");
	  } catch (SQLException e)
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	}

	public void speichern2()
	{
	  Connection lConnection = DBVerbindungSchullaufbahn.holen();
	  Statement lBefehl;
	  ResultSet lErgebnis;

	  try
	  {
		lBefehl = lConnection.createStatement();
		lBefehl.execute("INSERT INTO db_schulprojekt.besucht VALUES ("+iDbesucht.getIDbesucht()+",\""+Datum1+"\",\""+Zeugnis+"\",\""+IDSchule.getAktuelleIDSchule()+"\",\""+iDSchüler.getIDSchüler()+"\",\""+Datum2+"\")");
	  } catch (SQLException e)
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	}


public IDSchule getiDSchule() {
		return iDSchule;
	}

	public void setiDSchule(IDSchule iDSchule) {
		this.iDSchule = iDSchule;
	}

	public LocalDate getDatum1() {
		return Datum1;
	}

	public void setDatum1(LocalDate datum1) {
		Datum1 = datum1;
	}

	public LocalDate getDatum2() {
		return Datum2;
	}

	public void setDatum2(LocalDate datum2) {
		Datum2 = datum2;
	}

	public IDbesucht getiDbesucht() {
		return iDbesucht;
	}

	public void setiDbesucht(IDbesucht iDbesucht) {
		this.iDbesucht = iDbesucht;
	}

	public IDSchüler getiDSchüler() {
		return iDSchüler;
	}

	public void setiDSchüler(IDSchüler iDSchüler) {
		this.iDSchüler = iDSchüler;
	}

	public String getZeugnis() {
		return Zeugnis;
	}

	public void setZeugnis(String zeugnis) {
		Zeugnis = zeugnis;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getStraße() {
		return Straße;
	}

	public void setStraße(String straße) {
		Straße = straße;
	}

	public String getOrt() {
		return Ort;
	}

	public void setOrt(String ort) {
		Ort = ort;
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
		System.out.println(ausgeschiedenAm.toString());
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
		return ausgeschiedenAm;
	}
	public void setAusgeschiedenAm(LocalDate pDatum)
	{
		this.ausgeschiedenAm = pDatum;
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
}
