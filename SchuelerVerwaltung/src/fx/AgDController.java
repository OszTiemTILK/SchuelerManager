package fx;

import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AgDController {

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
    private TextField tfGeschlecht;

    @FXML
    private TextField tfMuttersprache;

    @FXML
    private ProgressBar processbar;

    @FXML
    private DatePicker dateGebutrstag;

    @FXML
    void speichernWeiter(ActionEvent event) {
    	Button bt = new Button("Klick mich!!!");
    	btNext.setOnAction(e-> bt.setText("Wohuuu!!!"));
    }

    @FXML
    void speichernZurück(ActionEvent event) {

    }

}
