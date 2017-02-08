package java;

public class ErziehungsberechtigteR extends Adresse
{
	private int typ;
	private String vorname;
	private String nachname;
	private boolean vormund;

	public int getTyp()
	{
		return typ;
	}

	public void setTyp(int ptyp)
	{
		this.typ = ptyp;
	}

	public String getVorname()
	{
		return vorname;
	}

	public void setVorname(String pvorname)
	{
		this.vorname = pvorname;
	}

	public String getNachname()
	{
		return nachname;
	}

	public void setNachname(String pnachname)
	{
		this.nachname = pnachname;
	}

	public boolean isVormund()
	{
		return vormund;
	}

	public void setVormund(boolean pvormund)
	{
		this.vormund = pvormund;
	}
}



