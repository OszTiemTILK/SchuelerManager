package anwendungslogik;

public enum Geschlecht
{
	MÄNNLICH, WEIBLICH;

	public static String toString(Geschlecht pGeschlecht)
	{
		switch(pGeschlecht)
		{
			case MÄNNLICH:
				return "Männlich";
			case WEIBLICH:
				return "Weiblich";
			default:
				return "";
		}
	}

	public static Geschlecht fromString(String pString)
	{
		switch(pString.toLowerCase())
		{
			case "männlich":
				return Geschlecht.MÄNNLICH;
			case "weiblich":
				return Geschlecht.WEIBLICH;
			default:
				return null;
		}
	}
}
