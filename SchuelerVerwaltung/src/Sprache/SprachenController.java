
/*
 * Onur Sükür 06.03.2017 angelegt
 */
package Sprache;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import java.lang.Object;
import javax.accessibility.Accessible;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.ItemSelectable;
import java.awt.event.ItemListener;
import java.sql.Connection;




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
	    private CheckBox ckArabisch;

	    @FXML
	    private CheckBox ckSonstiges;

	    @FXML
	    private ChoiceBox<String> cbDeutschNiveau;

	    @FXML
	    private ChoiceBox<String> cbEnglischNiveau;

	    @FXML
	    private ChoiceBox<String> cbTürkischNiveau;

	    @FXML
	    private ChoiceBox<String> cbArabischNiveau;

	    @FXML
	    private TextField tfSonstigesNiveau;

	    @FXML
	    private Button    btAnlegenÄndern;

	    @FXML
	    private Button    btAuslesen;

	    @FXML
	    private TextField tfSchülerID;

	    @FXML
	    void anlegenÄndern(ActionEvent event)
	    {
	    	sprechen lsprechen = new sprechen( Integer.parseInt(tfSchülerID.getText()));
		  	lsprechen.anlegenSprachen();

	    }
	    @FXML
	    void auslesen(ActionEvent event)
	    {
	       sprechen lsprechen = new sprechen( Integer.parseInt(tfIDSpricht.getText()) );
	       lsprechen.ergänzen();
	       ckDeutsch.setSelected(lsprechen.getSprachenDeutsch());
	       ckEnglisch.setSelected(lsprechen.getSprachenEnglisch());
	       ckTürkisch.setSelected(lsprechen.getSprachenTürkisch());
	       ckArabisch.setSelected(lsprechen.getSprachenArabisch());
	       ckSonstiges.setSelected(lsprechen.getSprachenSonstiges());
	       cbDeutschNiveau.setId(String.valueOf(lsprechen.getSprachenNiveau()));
	       cbEnglischNiveau.setId(String.valueOf(lsprechen.getSprachenNiveau()));
	       cbTürkischNiveau.setId(String.valueOf(lsprechen.getSprachenNiveau()));
	       cbArabischNiveau.setId(String.valueOf(lsprechen.getSprachenNiveau()));
	    }

	    public void ladenChoiceBox()
	    {
	    	cbDeutschNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    	cbEnglischNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    	cbTürkischNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    	cbArabischNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    }

	    @FXML
	    public void initialize()
	    {
	    	ladenChoiceBox();
	    }


}

