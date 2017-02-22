package anwendungslogik;

import java.time.LocalDate;

public class Schülerverhältnisse
{
	private AllgemeinbildendeSchule schule = new AllgemeinbildendeSchule();
	

	public AllgemeinbildendeSchule getAllgemeinbildendeSchule()
	{
		return schule;
	}
	public void setAllgemeinbildeneSchule(AllgemeinbildendeSchule pSchule)
	{
		this.schule = pSchule;
	}
}
