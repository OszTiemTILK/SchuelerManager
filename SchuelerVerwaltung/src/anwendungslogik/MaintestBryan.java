package anwendungslogik;

public class MaintestBryan 
{
	private static ErziehungsberechtigteR ErziehungsberechtigteRTest = new ErziehungsberechtigteR();
	private static AngabenZurPerson AngabenZurPersontest = new AngabenZurPerson();
	private static Herkunft HerkunftTest = new Herkunft();
	private static Adresse AdresseTest = new Adresse();
	private static Kontaktdaten KontaktdatenTest = new Kontaktdaten();
	private static Sprachen SprachenTest = new Sprachen();
	
	public static void main(String[] args) 
	{
		System.out.println("Kontrolle f�r JavaFx");
		AngabenZurPersontest.ausgebenZusammenfassungAngabenzurPerson();
		HerkunftTest.ausgebenZusammenfassungHerkunft();
		AdresseTest.ausgebenAdresse();
		KontaktdatenTest.ausgebenZusammenfassungKontaktdaten();
		SprachenTest.ausgebenZusammenfassungSprachen();
		System.out.println("Erziehungsberechtigter:");
		ErziehungsberechtigteRTest.ausgebenZusammenfassungErziehungsberrechtigteRAngaben();

	}

}
