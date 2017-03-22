package fx;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
public class KontaktdatenController {

	/**
	 * Sample Skeleton for 'KontaktdatenView.fxml' Controller Class
	 */



/*
	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;
*/
	    @FXML // fx:id="tfTelephon"
	    private TextField tfTelephon; // Value injected by FXMLLoader

	    @FXML // fx:id="tfEmail"
	    private TextField tfEmail; // Value injected by FXMLLoader

	    @FXML // fx:id="tfKontaktdatenID"
	    private TextField tfKontaktdatenID; // Value injected by FXMLLoader

	    @FXML // fx:id="btStepIntoTheLight"
	    private Button btStepIntoTheLight; // Value injected by FXMLLoader

	    @FXML // fx:id="btSpeichern"
	    private Button btSpeichern; // Value injected by FXMLLoader

	    @FXML
	    void speichern(ActionEvent event) {

	    }

	    @FXML
	    void anzeigenDetails(ActionEvent event) {

	    }

	    @FXML // This method is called by the FXMLLoader when initialization is complete
	    void initialize() {
	        assert tfTelephon != null : "fx:id=\"tfTelephon\" was not injected: check your FXML file 'KontaktdatenView.fxml'.";
	        assert tfEmail != null : "fx:id=\"tfEmail\" was not injected: check your FXML file 'KontaktdatenView.fxml'.";
	        assert tfKontaktdatenID != null : "fx:id=\"tfKontaktdatenID\" was not injected: check your FXML file 'KontaktdatenView.fxml'.";

	    }
	}
