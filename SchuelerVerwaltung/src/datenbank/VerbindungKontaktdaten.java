package datenbank;
import java.sql.*;

public class VerbindungKontaktdaten
{
	  private static Connection connection;
	  private static String     hostrechner = "dbserver";
	  private static String     datenbank = "db_schulprojekt";
	  private static String     benutzer = "dbuser";
	  private static String     passwort = "benutzer";


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
			 System.out.println("Fehler Verbindungsaufbau");
			 return false;
	      }
	 }

	 public static Connection holen()
	 {
		if (connection == null)
		{
		  herstellen();
		}
		return connection;
	 }


}
