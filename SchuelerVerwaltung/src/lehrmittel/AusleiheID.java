package lehrmittel;

public class AusleiheID
{
	int vorherigeID;
	int ausleiheID;
	public AusleiheID()
	{
		ausleiheID = vorherigeID + 1;
	}
	public int getVorherigeID()
	{
		return vorherigeID;
	}
	public void setVorherigeID(int pvorherigeID)
	{
		this.vorherigeID = pvorherigeID;
	}
	public int getAusleiheID()
	{
		return ausleiheID;
	}
	public void setAusleiheID(int pausleiheID)
	{
		this.ausleiheID = pausleiheID;
	}

}
