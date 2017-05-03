package kontaktdaten;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
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
	    private TextField tfFestnetz; // Value injected by FXMLLoader

	    @FXML
	    private TextField tfMobilnummer;

	    @FXML // fx:id="tfEmail"
	    private TextField tfEmail; // Value injected by FXMLLoader

	    @FXML // fx:id="tfKontaktdatenID"
	    private TextField tfKontaktdatenID; // Value injected by FXMLLoader

	    @FXML // fx:id="btStepIntoTheLight"
	    private Button btStepIntoTheLight; // Value injected by FXMLLoader

	    @FXML // fx:id="btSpeichern"
	    private Button btSpeichern; // Value injected by FXMLLoader

	    @FXML
	    private Button btSuchen;

	    @FXML
	    private TextField tfVorname;

	    @FXML
	    private TextField tfName;

	    @FXML
	    private TextArea taKeineKontaktID;


	    @FXML
	    void suchen(ActionEvent event)
	    {
	    	Kontaktdaten lKontaktdaten = new Kontaktdaten (tfVorname.getText(), tfName.getText() );
	    	lKontaktdaten.suchenID();
	    	if(Integer.valueOf(lKontaktdaten.getID().getID())==0)
	    	{
	    		taKeineKontaktID.setVisible(true);
	    		//btSpeichern.setVisible(true);
	    	}

	    	else
	    	{
	    		tfKontaktdatenID.setText(String.valueOf(lKontaktdaten.getID().getID()));
	    		anzeigenDetails(event);
	    	}
	    }



	    @FXML
	    void speichern(ActionEvent event)
	    {
	    	Kontaktdaten lKontaktdaten = new Kontaktdaten( tfFestnetz.getText(), tfMobilnummer.getText(), tfEmail.getText(), tfName.getText(), tfVorname.getText());
	    	lKontaktdaten.vergleichenDB();
	    }

	    @FXML
	    void anzeigenDetails(ActionEvent event)
	    {
	    	Kontaktdaten lKontaktdaten = new Kontaktdaten( Integer.parseInt(tfKontaktdatenID.getText()));
	    	lKontaktdaten.ergänzen();
	    	tfFestnetz.setText(lKontaktdaten.getFestnetzNummer());
	    	tfMobilnummer.setText(lKontaktdaten.getMobilNummer());
	    	tfEmail.setText(lKontaktdaten.getEmail());
	    }

	    @FXML // This method is called by the FXMLLoader when initialization is complete
	    void initialize()
	    {
	        assert tfFestnetz != null : "fx:id=\"tfTelephon\" was not injected: check your FXML file 'KontaktdatenView.fxml'.";
	        assert tfEmail != null : "fx:id=\"tfEmail\" was not injected: check your FXML file 'KontaktdatenView.fxml'.";
	        assert tfKontaktdatenID != null : "fx:id=\"tfKontaktdatenID\" was not injected: check your FXML file 'KontaktdatenView.fxml'.";

	    }
	}
