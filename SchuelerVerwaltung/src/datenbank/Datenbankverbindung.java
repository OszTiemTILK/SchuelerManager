
package datenbank;

import java.sql.Connection;
import java.sql.DriverManager;


public class Datenbankverbindung

{
  private static Connection connection;
  private static String     hostrechner = "localhost";
  private static String     datenbank = "sprachen";
  private static String     benutzer = "root";
  private static String     passwort = "";


  /**
   * Wenn Ihre Daten für die Datenbankverbindung anders lauten, verwenden Sie diese
   * Methode, um die Parameter zu setzen.
   * @param pHostrechner
   * @param pDatenbank
   * @param pBenutzer
   * @param pPasswort
   */
  public static void setzenParameter(String pHostrechner, String pDatenbank, String pBenutzer, String pPasswort)
  {
	hostrechner = pHostrechner;
	datenbank   = pDatenbank;
	benutzer    = pBenutzer;
	passwort    = pPasswort;
  }

  /**
   * Die Verbindung zur Datenbank wird hergestellt. Verwendet werden dazu die
   * fest initialisierten Parameter. Die Werte der Parameter lassen sich mit der Methode
   * setzenParameter überschreiben.
   * @return
   */
  protected static boolean herstellen()
  {
	if (hostrechner==null || hostrechner.isEmpty())
	{return false;}
	try
	{
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	String connectionCommand = "jdbc:mysql://"+hostrechner+":3306/"+datenbank+"?user="+benutzer+"&password="+passwort;
	connection = DriverManager.getConnection(connectionCommand);
	return true;
	}catch (Exception ex)
	  {				//Fehlerbehandlung
		 System.out.println("Fehler beim Verbindungsaufbau. :("+ ex.getMessage());
      }
  }
  /**
   * Gibt die bestehende Verbindung zurück.
   * Wenn noch keine besteht, wird sie neu hergestellt.
   * @return
   */

  public static Connection holen()
  {
	if (connection == null)
	{
	  boolean success = herstellen();
	  if(!success){
		  // DB ist ein Wichtiger teil des Programms. Problem melden und verweigern hoch zu fahren. 
		  throw new RuntimeException("Konnte kein Datenbenkverbindung herstellen. Bitte Benutzername, Password und Hostnamen ueberpruefen.");
	  }
	}
	return connection;
  }
}


