package anwendungslogik;

public class AllgemeinbildendeSchule
{
	private int[] ausgeschiedenAm = {0, 0, 0};
	private int ausgeschiedenAusJahrgang;
	private boolean sonderschule;
	private boolean hauptschule;
	private boolean realschule;
	private boolean sekundarschule;
	private boolean gesamtschule;
	private boolean gymnasium;
	private String nameDerSchule;
	private String bezirkVonBerlinOderAnderesBundesland;
	private int erreichterAbschluss;
	private String bemerkungen;

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
		System.out.println(ausgeschiedenAm[0] + ". " + ausgeschiedenAm[1] + ". " + ausgeschiedenAm[2]);
		System.out.println(ausgeschiedenAusJahrgang);
		System.out.println(sonderschule);
		System.out.println(hauptschule);
		System.out.println(realschule);
		System.out.println(sekundarschule);
		System.out.println(gesamtschule);
		System.out.println(gymnasium);
		System.out.println(nameDerSchule);
		System.out.println(bezirkVonBerlinOderAnderesBundesland);
		System.out.println(erreichterAbschluss);
		System.out.println(bemerkungen);
	}
	public int[] getAusgeschiedenAm()
	{
		return ausgeschiedenAm;
	}
	public void setAusgeschiedenAm(int pTag, int pMonat, int pJahr)
	{
		this.ausgeschiedenAm[0] = pTag;
		this.ausgeschiedenAm[1] = pMonat;
		this.ausgeschiedenAm[2] = pJahr;
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
	public String getNameDerSchule()
	{
		return nameDerSchule;
	}
	public void setNameDerSchule(String pNameDerSchule)
	{
		this.nameDerSchule = pNameDerSchule;
	}
	public String getBezirkVonBerlinOderAnderesBundesland()
	{
		return bezirkVonBerlinOderAnderesBundesland;
	}
	public void setBezirkVonBerlinOderAnderesBundesland(String pBezirkVonBerlinOderAnderesBundesland)
	{
		this.bezirkVonBerlinOderAnderesBundesland = pBezirkVonBerlinOderAnderesBundesland;
	}
	public int getErreichterAbschluss()
	{
		return erreichterAbschluss;
	}
	public boolean setErreichterAbschluss(int pErreichterAbschluss)
	{
		if(pErreichterAbschluss == 1 || pErreichterAbschluss == 2)
		{
			this.erreichterAbschluss = pErreichterAbschluss;
			return true;
		}
		else
			return false;

	}
	public String getBemerkungen()
	{
		return bemerkungen;
	}
	public void setBemerkungen(String pBemerkungen)
	{
		this.bemerkungen = pBemerkungen;
	}
}
