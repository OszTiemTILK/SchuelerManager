package Schullaufbahn;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class SchullaufbahnController {

    @FXML
    private TextField tfTyp;

    @FXML
    private Button btWeiter;

    @FXML
    private Button btNächsteSchule;

    @FXML
    private TextField tfJahrgang;

    @FXML
    private TableColumn<?, ?> tcSchulname;

    @FXML
    private TextField tfOrt;

    @FXML
    private TextField tfAbschluss;

    @FXML
    private TextField tfDatum1;

    @FXML
    private TextField tfDatum2;

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
    	Schule lSchule = new Schule(IDSchule.getAktuelleIDSchule(), tfSchulname.getText(), tfTyp.getText(), tfStraße.getText(), tfOrt.getText());
    	lSchule.anlegen();
    	System.out.print("blaa");
    }


}
