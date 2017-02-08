package java;

public class Kontaktdaten
{

private int festnetzNummer;
private int mobilNummer;
private String email;
private int fax;

public int getFestnetzNummer()
{
	return festnetzNummer;
}

public void setFestnetzNummer(int festnetzNummer)
{
	this.festnetzNummer = festnetzNummer;
}
public int getMobilNummer()
{
	return mobilNummer;
}

public void setMobilNummer(int mobilNummer)
{
	this.mobilNummer = mobilNummer;
}
public String getEmail() {
	return email;
}

public void setEmail(String email)
{
	this.email = email;
}
public int getFax() {
	return fax;
}

public void setFax(int fax)
{
	this.fax = fax;
}

}
