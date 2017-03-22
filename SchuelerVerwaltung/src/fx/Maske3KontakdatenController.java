package fx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class Maske3Controller {

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
    void anlegenKontaktdaten1(ActionEvent event) {

    }//1. Kontaktdaten anlegen für die 1. Kontaktperson
	Kontaktdaten lKontaktdaten1 = new Kontaktdaten (tfWohnort1.getText(), tfPlz1.getText(), tfFestnetzHandynummer1.getText(), tfFax1.getText(), tfEmail1.getText(), tfAdresseStraßeMitHausnummer1.getText());

	@FXML
    void anlegenKontaktdaten2(ActionEvent event) {

    }//1. Kontaktdaten anlegen für die 2. Kontaktperson
	Kontaktdaten lKontaktdaten2 = new Kontaktdaten (tfWohnort2.getText(), tfPlz2.getText(), tfFestnetzHandynummer2.getText(), tfFax2.getText(), tfEmail2.getText(), tfAdresseStraßeMitHausnummer2.getText());

	@FXML
    void anlegenKontaktdaten3(ActionEvent event) {

    }//1. Kontaktdaten anlegen für die 3. Kontaktperson
	Kontaktdaten lKontaktdaten3 = new Kontaktdaten (tfWohnort3.getText(), tfPlz3.getText(), tfFestnetzHandynummer3.getText(), tfFax3.getText(), tfEmail3.getText(), tfAdresseStraßeMitHausnummer3.getText());
}

