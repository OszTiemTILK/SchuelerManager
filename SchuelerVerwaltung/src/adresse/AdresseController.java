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
    private TextField tfWohnort1;

    @FXML
    private TextField tfPlz1;

    @FXML
    private TextField tfAdresseStraßeMitHausnummer1;

    @FXML
    private Button btZurück;

    @FXML
    void anlegenKontaktdaten(ActionEvent event)
    {
    	Adresse lAdresse = new Adresse(tfAdresseStraßeMitHausnummer1.getText(), tfWohnort1.getText(), Integer.parseInt(tfPlz1.getText()));
    	lAdresse.anlegenAdresse();

    }

}
