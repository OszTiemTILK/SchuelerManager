package fx;

import anwendungslogik.AngabenZurPerson;
import anwendungslogik.Geschlecht;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;

public class AgDController
{

    @FXML
    private TextArea tfBeschreibung;

    @FXML
    private Label textTitel;

    @FXML
    private TextField tfStaatsangehörigkeit;

    @FXML
    private Button btBack;

    @FXML
    private TextField tfNachname;

    @FXML
    private Button btNext;

    @FXML
    private TextField tfVorname;

    @FXML
    private TextField tfGeburtsort;

    @FXML
    private ChoiceBox<Geschlecht> cbGeschlecht;

    @FXML
    private TextField tfMuttersprache;

    @FXML
    private ProgressBar processbar;

    @FXML
    private DatePicker dateGeburtstag;

    @FXML
    void speichernWeiter(ActionEvent event)
    {
    	AngabenZurPerson lAngabenZurPerson = new AngabenZurPerson(tfVorname.getText(), tfNachname.getText(), dateGeburtstag.getValue(), cbGeschlecht.getValue());
    	lAngabenZurPerson.anlegenAngabenZurPerson();
    }

    @FXML
    void speichernZurück(ActionEvent event)
    {

    }

    @FXML
    public void initialize()
    {
    	cbGeschlecht.setItems(FXCollections.observableArrayList(Geschlecht.MÄNNLICH, Geschlecht.WEIBLICH));
    }
}
