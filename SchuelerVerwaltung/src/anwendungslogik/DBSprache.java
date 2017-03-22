package anwendungslogik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBSprache {
	Connection connection=null; //Instanzvariable zum Ablegen der Verbindung

	public DBSprache(){   //Konstruktor, kann auch weggelassen werden

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

	public void loadCustomers(String table) {
		Statement stmt = null;
		ResultSet result = null;
	  try {
	     stmt = connection.createStatement();
	     result = stmt.executeQuery("SELECT * FROM " + table);
	     result.first();  //Zeigt auf den ersten Datensatz in result

	     while(! result.isAfterLast()) { // as long as valid data is in the result set
	       System.out.print(result.getInt(1)+"  "); // wählt das Attribut des aktuellen Datensatzes aus
	       System.out.print(result.getString(2)+"  " );
	       System.out.println(result.getString(3)+"     ");

	       result.next(); // geht zum nächsten Datensatz in result
	}


	} catch (Exception ex) {
	    System.out.println("Fehler bei der Verarbeitung + " + table + "n" + ex.getMessage());

	}

	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 DBSprache dbVerbindung = new DBSprache();
	 if (dbVerbindung.connectToMysql("dbserver", "test", "dbuser", "benutzer")== false)
		 return;
	 dbVerbindung.loadCustomers("sprache");
		}

}
