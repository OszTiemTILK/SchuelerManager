package lehrmittel;
// Naasner 9.1.16
// wichtig vorher Treiber: java-connector in das Projekt einbinden, wenn er nicht unter JRE System Library eingetragen ist:
// DBTest2--> Properties-->Java Build Path -->Add External Jar's-->mysql-connector-java-5.1.40-bin.jar
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

import anwendungslogik.SchülerID;



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


public Lehrmittel[] holenLehrmittel(SchülerID pID) {
	ArrayList<Lehrmittel> lArraylist = new ArrayList<Lehrmittel>();

	String lSelectWert = "*";
	String lWhere = "Fach = 'Deutsch'"; // = "Straße = 'Bergstraße'"; //AUFTEILEN!

/*	if( lWhere != "" ) {
		lWhere = " + " + " WHERE " + lWhere;
	}
*/
	Statement stmt = null;
	ResultSet result = null;
  try {
     stmt = connection.createStatement();
     result = stmt.executeQuery("SELECT " + lSelectWert + " FROM Lehrmittel WHERE SchülerID=" + pID.getSchülerID() /* + lWhere  + " WHERE " + lWhere */);
     result.first();  //Zeigt auf den ersten Datensatz in result

     while(! result.isAfterLast()) { // as long as valid data is in the result set
       new Lehrmittel(result.getString("Fach"), result.getString("Art"), result.getString("Name"), LocalDate.parse(result.getString("Ausgegeben")), result.getBoolean("Rückgabe"));


//       System.out.println(result.getDate(6));

       result.next(); // geht zum nächsten Datensatz in result

     }


} catch (Exception ex) {
    System.out.println("Fehler bei der Verarbeitung + " + "Lehrmittel" + "n" + ex.getMessage());

}

  return lArraylist.toArray(new Lehrmittel[lArraylist.size()]);

  }

}