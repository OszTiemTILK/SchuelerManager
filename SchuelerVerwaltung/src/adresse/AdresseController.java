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
    private TextField tfVorname;

	@FXML
    private TextField tfNachname;

	@FXML
    private Button btWeiter;

    @FXML
    private TextField tfWohnort1;

    @FXML
    private TextField tfPlz1;

    @FXML
    private TextField tfAdresseStraßeMitHausnummer1;

    @FXML
    private TextField tfOrtSuchen;

    @FXML
    private TextField tfPlzSuchen;

    @FXML
    private TextField tfStrasseSuchen;

    @FXML
    private TextField tfHausNrSuchen;

    @FXML
    private Button btZurück;

    @FXML
    private Button btSchülerIDsuchen;

    @FXML
    private Button btAdresseIDsuchen;

    @FXML
    private TextField tfSuchAusgabe;

    @FXML
    private TextField tfAusgabeAdresseID;

    @FXML
    void anlegenKontaktdaten(ActionEvent event)
    {
    	Adresse lAdresse = new Adresse(tfAdresseStraßeMitHausnummer1.getText(), tfWohnort1.getText(), Integer.parseInt(tfPlz1.getText()));
    	lAdresse.anlegenAdresse();

    }

    @FXML
    void suchenSchülerID(ActionEvent event)
    {
    	AngabenZurPerson lAngabenZurPerson = new AngabenZurPerson(tfVorname.getText(), tfNachname.getText());
    	int lSchülerInID;
    	if((lSchülerInID = lAngabenZurPerson.suchenSchülerInID()) != -1)
    		tfSuchAusgabe.setText(String.valueOf(lSchülerInID));
    }

    @FXML
    public void suchenAdresseID()
    {
    	Adresse lAdresse = new Adresse(tfStrasseSuchen.getText(), Integer.parseInt(tfHausNrSuchen.getText()), tfOrtSuchen.getText(), Integer.parseInt(tfPlzSuchen.getText()));
    	int lAdresseID;
    	if((lAdresseID = lAdresse.suchenAdresseID()) != -1)
    		tfAusgabeAdresseID.setText(String.valueOf(lAdresseID));
    	else
    		tfAusgabeAdresseID.setText("Nicht vorhanden!");
    }

    @FXML
    public void suchAusgabeGefunden()
    {
    	tfSuchAusgabe.setText("Ok");
    }

    @FXML
    public void suchAusgabeNichtGefunden()
    {
    	tfSuchAusgabe.setText("Nein");
    }
}