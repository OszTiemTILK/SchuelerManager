package fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TestMaskeAdresseController {

	    @FXML
	    private TextField tfStrasse;

	    @FXML
	    private Button speichernAdresse;

	    //@FXML
	    //private TextField tfFestnetz;

	    //@FXML
	    //private TextField tfEmail;

	    @FXML
	    private TextField tfWohnort;

	    //@FXML
	    //private TextField tfHandy;

	    @FXML
	    private TextField tfPlz;

	    @FXML
	    private TextField tfHausnummer;



	    @FXML
	    void anlegenAdresse(ActionEvent event) {

	    }//1. Adress anlegen
    	Adresse lAdresseTest = new Adresse (tfStrasse.getText(), tfHausnummer.getText(), tfWohnort.getText(), tfPlz.getText());

    	//2. An ADress Objekt Methode anlegen aufrufen

    	}//end


