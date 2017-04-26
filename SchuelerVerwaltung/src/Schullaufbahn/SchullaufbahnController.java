package Schullaufbahn;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;


public class SchullaufbahnController {

    @FXML
    private TextField tfTyp;

    @FXML
    private TextField tfZeugnis;

    @FXML
    private Button btWeiter;

    @FXML
    private Button btNächsteSchule;

    @FXML
    private TableColumn<?, ?> tcSchulname;

    @FXML
    private TextField tfOrt;

    @FXML
    private TextField tfAbschluss;

    @FXML
    private DatePicker dpDatum1;

    @FXML
    private DatePicker dpDatum2;

    @FXML
    private TextField tfSchulname;

    @FXML
    private TextField tfStraße;

    @FXML
    private ChoiceBox<?> cbSprachen;

    @FXML
    private Button btZurück;

    @FXML
    void anlegenSchule(ActionEvent event)
    {
    	Schule lSchule = new Schule(tfSchulname.getText(), tfTyp.getText(), tfStraße.getText(), tfOrt.getText(), dpDatum1.getValue(), dpDatum2.getValue(),IDbesucht.getAktuelleIDbesucht(), IDSchüler.getAktuelleIDSchüler(), tfZeugnis.getText());
    	lSchule.anlegen();
    	System.out.print("blaa");
    }


}
