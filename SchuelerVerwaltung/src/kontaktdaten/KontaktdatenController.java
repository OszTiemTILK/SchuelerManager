package kontaktdaten;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import i18nArabischEinstieg.ArabischEinstiegController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

	   /* @FXML // fx:id="btStepIntoTheLight"
	    private Button btStepIntoTheLight; // Value injected by FXMLLoader */

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
	    private Button btDeutsch;

	    @FXML
	    private Button btEnglisch;

	    /*@FXML
	    private Button btArabisch;*/


	    @FXML
	    void suchen(ActionEvent event)
	    {
	    	resetFields();
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
	    	lKontaktdaten.ändernIDDB();
	    	resetFields();
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

	    public void resetFields()
	    {
	    	taKeineKontaktID.setVisible(false);
	    	tfKontaktdatenID.setText(null);
	    	tfFestnetz.setText(null);
	    	tfMobilnummer.setText(null);
	    	tfEmail.setText(null);
	    }

	    //Sprachenkladderadatsch
	    public Parent ausgebenParent(Locale pLocale)
	    {
	    	Parent lParent=null;
	    	try
	    	{
				lParent = FXMLLoader.load(KontaktdatenController.class.getResource("KontaktdatenView.fxml"),  ResourceBundle.getBundle("Kontaktdaten/Kontaktdaten", pLocale ));
			}
	    	catch (IOException e)
	    	{
				e.printStackTrace();
			}
	    	return lParent;
	    }

	    @FXML
	    void Deutsch()
	    {
	    	btDeutsch.getScene().setRoot(ausgebenParent(new Locale("de", "DE")));
	    	//ändernLayoutLTR(copyFor(btLTR, btDeutsch));
	    }

	    @FXML
	    void Englisch(/*ActionEvent event*/)
	    {
	    	btDeutsch.getScene().setRoot(ausgebenParent(new Locale("en", "UK")));
	    	//ändernLayoutLTR(event);
	    }

	   /* @FXML
	    void Arabisch()
	    {
	    	btDeutsch.getScene().setRoot(ausgebenParent(new Locale("ar", "SY")));
	    	//ändernLayoutRTL();
	    }*/


	}
