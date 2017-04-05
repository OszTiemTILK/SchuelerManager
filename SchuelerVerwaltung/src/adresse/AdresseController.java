package adresse;

import allgemeinedaten.AngabenZurPerson;
import anwendungslogik.Geschlecht;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class AdresseController {

    @FXML
    private Button btWeiter;

    @FXML
    private TextField tfWohnort3;

    @FXML
    private TextField tfWohnort2;

    @FXML
    private TextField tfWohnort1;

    @FXML
    private ProgressBar pbFortschritt;

    @FXML
    private TextField tfPlz1;

    @FXML
    private TextField tfFestnetzHandynummer2;

    @FXML
    private TextField tfPlz3;

    @FXML
    private TextField tfFestnetzHandynummer1;

    @FXML
    private TextField tfPlz2;

    @FXML
    private TextField tfFestnetzHandynummer3;

    @FXML
    private TextField tfFax1;

    @FXML
    private TextField tfEmail1;

    @FXML
    private TextField tfFax2;

    @FXML
    private TextField tfAdresseStraßeMitHausnummer1;

    @FXML
    private TextField tfEmail2;

    @FXML
    private TextField tfFax3;

    @FXML
    private TextField tfEmail3;

    @FXML
    private TextField tfAdresseStraßeMitHausnummer3;

    @FXML
    private TextField tfAdresseStraßeMitHausnummer2;

    @FXML
    private Button btZurück;

    @FXML
    void anlegenKontaktdaten(ActionEvent event) 
    {
    	Adresse lAdresse = new Adresse(tfAdresseStraßeMitHausnummer1.getText(), tfWohnort1.getText(), Integer.parseInt(tfPlz1.getText()));
    	lAdresse.anlegenAdresse();
    }

}
