package anwendungslogik;

public class Kontaktdaten
{
private String festnetzNummer;
private String mobilNummer;
private String email;
private String fax;
public String getFestnetzNummer()
{
	return festnetzNummer;
}
public void setFestnetzNummer(String pFestnetzNummer)
{
	this.festnetzNummer = pFestnetzNummer;
}
public String getMobilNummer()
{
	return mobilNummer;
}
public void setMobilNummer(String pMobilNummer)
{
	this.mobilNummer = pMobilNummer;
}
public String getEmail()
{
	return email;
}
public void setEmail(String pEmail)
{
	this.email = pEmail;
}
public String getFax()
{
	return fax;
}
public void setFax(String pFax)
{
	this.fax = pFax;
}

}
