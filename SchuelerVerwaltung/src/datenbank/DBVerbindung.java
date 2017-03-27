package datenbank;
// Naasner 9.1.16
// wichtig vorher Treiber: java-connector in das Projekt einbinden, wenn er nicht unter JRE System Library eingetragen ist:
// DBTest2--> Properties-->Java Build Path -->Add External Jar's-->mysql-connector-java-5.1.40-bin.jar
import java.sql.*;
import java.time.LocalDate;

import anwendungslogik.Lehrmittel;



public class DBVerbindung {
Connection connection=null; //Instanzvariable zum Ablegen der Verbindung

public DBVerbindung(){   //Konstruktor, kann auch weggelassen werden

}

public boolean connectToMysql(String host, String database, String user, String passwd){
 // erstellet Verbindung ind legt sie in der Instanzvariablen connection ab.
	try{
	Class.forName("com.mysql.jdbc.Driver").newInstance(); // neue Instanz des Treibers holen
	 String connectionCommand = "jdbc:mysql://"+host+":3306/"+database+"?user="+user+"&password="+passwd;
     connection = DriverManager.getConnection(connectionCommand);
     return true;

 }catch (Exception ex){				//Fehlerbehandlung
	 System.out.println("Exeption: " + ex.getMessage());


	 System.out.println("Fehler");
	 return false;
 }
}


public void holenLehrmittel(String table) {
	String lSelectWert = "*";
	String lWhere = "Fach = 'Deutsch'"; // = "Straße = 'Bergstraße'"; //AUFTEILEN!

	if( lWhere != "" ) {
		lWhere = " + " + " WHERE " + lWhere;
	}

	Statement stmt = null;
	ResultSet result = null;
  try {
     stmt = connection.createStatement();
     result = stmt.executeQuery("SELECT " + lSelectWert + " FROM " + table /* + lWhere  + " WHERE " + lWhere */);
     result.first();  //Zeigt auf den ersten Datensatz in result

     while(! result.isAfterLast()) { // as long as valid data is in the result set
       System.out.print(result.getInt(1)+"  "); // wählt das Attribut des aktuellen Datensatzes aus
       System.out.print(result.getString(2)+"  " );
       System.out.print(result.getString(3)+"  " );
       System.out.print(result.getString(4)+"  " );
       System.out.print(result.getString(5)+"  " );
       System.out.print(result.getBoolean(6)+"     ");
       System.out.println(result.getInt(7)+"     ");


//       System.out.println(result.getDate(6));

       result.next(); // geht zum nächsten Datensatz in result
}


} catch (Exception ex) {
    System.out.println("Fehler bei der Verarbeitung + " + table + "n" + ex.getMessage());

}
  }
public void speichernLehrmittel(Lehrmittel pLehrmittel, int pSchülerID)
{
	Statement stmt = null;

	try {
	     stmt = connection.createStatement();
	     stmt.execute("INSERT INTO lehrmittel VALUES ("+pLehrmittel.getLehrmittelID()+", '"+pLehrmittel.getFach()+"', '"+pLehrmittel.getArt()+"', '"+pLehrmittel.getName()+"', '"+pLehrmittel.getAusgegeben().toString()+"', "+pLehrmittel.isRückgabe()+"," +pSchülerID + ")");


	} catch (Exception ex) {
	    System.out.println("Fehler bei der Verarbeitung + " + "Lehrmittel" + "n" + ex.getMessage());

	}
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
 DBVerbindung dbVerbindung = new DBVerbindung();
 if (dbVerbindung.connectToMysql("dbserver", "db_schulprojekt", "dbuser", "benutzer")== false)
	 return;
 dbVerbindung.speichernLehrmittel(new Lehrmittel("testfach", "testart", "testname", LocalDate.now(), true), 1);
	}

}