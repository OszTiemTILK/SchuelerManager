package fx;

import javafx.fxml.FXML;
import javafx.scene.control. ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control. TextArea;
import javafx.scene.control. CheckBox;
import javafx.collections.FXCollections;


public class SprachenController {

	    @FXML
	    private TextField tfTitel;

	    @FXML
	    private TextField tfSprachen;

	    @FXML
	    private TextArea taText ;

	    @FXML
	    private CheckBox ckDeutsch;

	    @FXML
	    private CheckBox ckEnglisch;

	    @FXML
	    private CheckBox ckTürkisch;

	    @FXML
	    private CheckBox cbArabisch;

	    @FXML
	    private CheckBox ckSonstiges;

	    @FXML
	    private ChoiceBox cbDeutschNiveau;

	    @FXML
	    private ChoiceBox cbEnglischNiveau;

	    @FXML
	    private ChoiceBox cbTürkischNiveau;

	    @FXML
	    private ChoiceBox cbArabischNiveau;

	    @FXML
	    private ChoiceBox cbSonstigesNiveau;

	    public void ladenChoiceBox()
	    {
	    	cbDeutschNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    	cbEnglischNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    	cbTürkischNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    	cbArabischNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    	cbSonstigesNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    }

	    @FXML
	    public void initialize()
	    {
	    	ladenChoiceBox();
	    }

}

