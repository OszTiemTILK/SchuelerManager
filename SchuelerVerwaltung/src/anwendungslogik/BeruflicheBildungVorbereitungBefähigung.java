package anwendungslogik;

import java.time.LocalDate;

public class BeruflicheBildungVorbereitungBefähigung
{
	private LocalDate ausgeschiedenAm;
	private int ausgeschiedenAusJahrgang;
	private String nameDerSchule;
	private String land;
	private String stadt;
	private String bezirk;
	private String bildungsgang;
	private boolean schonmalBegonnen;
	private boolean mitAbschluss;
	private String ausbildungsberuf;

	public BeruflicheBildungVorbereitungBefähigung(LocalDate pAusgeschiedenAm, int pAusgeschiedenAusJahrgang, String pNameDerSchule, String pLand, String pStadt, String pBezirk, String pBildungsgang, boolean pSchonmalBegonnen, boolean pMitAbschluss, String pAusbildungsBeruf)
	{
		this.ausgeschiedenAm = pAusgeschiedenAm;
		this.ausgeschiedenAusJahrgang = pAusgeschiedenAusJahrgang;
		this.nameDerSchule = pNameDerSchule;
		this.land = pLand;
		this.stadt = pStadt;
		this.bezirk = pBezirk;
		this.bildungsgang = pBildungsgang;
		this.schonmalBegonnen = pSchonmalBegonnen;
		this.mitAbschluss = pMitAbschluss;
		this.ausbildungsberuf = pAusbildungsBeruf;
	}
	public LocalDate getAusgeschiedenAm()
	{
		return ausgeschiedenAm;
	}
	public void setAusgeschiedenAm(LocalDate pAusgeschiedenAm)
	{
		this.ausgeschiedenAm = pAusgeschiedenAm;
	}
	public int getAusgeschiedenAusJahrgang()
	{
		return ausgeschiedenAusJahrgang;
	}
	public void setAusgeschiedenAusJahrgang(int pAusgeschiedenAusJahrgang)
	{
		this.ausgeschiedenAusJahrgang = pAusgeschiedenAusJahrgang;
	}
	public String getNameDerSchule()
	{
		return nameDerSchule;
	}
	public void setNameDerSchule(String pNameDerSchule)
	{
		this.nameDerSchule = pNameDerSchule;
	}
	public String getBildungsgang()
	{
		return bildungsgang;
	}
	public void setBildungsgang(String pBildungsgang)
	{
		this.bildungsgang = pBildungsgang;
	}
	public boolean isSchonmalBegonnen()
	{
		return schonmalBegonnen;
	}
	public void setSchonmalBegonnen(boolean pSchonmalBegonnen)
	{
		this.schonmalBegonnen = pSchonmalBegonnen;
	}
	public boolean isMitAbschluss()
	{
		return mitAbschluss;
	}
	public void setMitAbschluss(boolean pMitAbschluss)
	{
		this.mitAbschluss = pMitAbschluss;
	}
	public String getAusbildungsberuf()
	{
		return ausbildungsberuf;
	}
	public void setAusbildungsberuf(String pAusbildungsberuf)
	{
		this.ausbildungsberuf = pAusbildungsberuf;
	}
	public String getLand()
	{
		return land;
	}
	public void setLand(String pLand)
	{
		this.land = pLand;
	}
	public String getStadt()
	{
		return stadt;
	}
	public void setStadt(String pStadt)
	{
		this.stadt = pStadt;
	}
	public String getBezirk()
	{
		return bezirk;
	}
	public void setBezirk(String pBezirk)
	{
		this.bezirk = pBezirk;
	}
}
