package fx;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import anwendungslogik.Sprachen;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import java.lang.Object;

import javax.accessibility.Accessible;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.ItemSelectable;
import java.awt.event.ItemListener;





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
	    private TextField cbSonstigesNiveau;

	    @FXML
	    private Button    btSpeichern;

	    @FXML
	    private Button    btAnlegenDatei;

	    @FXML
	    private TextField tfID;

	    @FXML
	    void anlegenDatei(ActionEvent event)
	    {
	       Sprachen lSprachen = new Sprachen( Integer.parseInt(tfID.getText()) );
	       lSprachen.ergänzen();

	    }

	    public void ladenChoiceBox()
	    {
	    	cbDeutschNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    	cbEnglischNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    	cbTürkischNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    	cbArabischNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    	//cbSonstigesNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    }

	    @FXML
	    public void initialize()
	    {
	    	ladenChoiceBox();
	    }


	    public class Checkbox
	    extends Component
	    implements ItemSelectable, Accessible
	    {
	    	@FXML
	    	public boolean FelderCheckbox()
	    	{
	    	 setLayout(new GridLayout(6,1));
	    	 add(new Checkbox());
	    	 add(new Checkbox());
	    	 add(new Checkbox());
	    	 add(new Checkbox());
	    	 add(new Checkbox());
	    	 add(new Checkbox());
			return false;
	    	}

			private void add(Checkbox checkbox) {
				// TODO Auto-generated method stub

			}

			private void setLayout(GridLayout gridLayout) {
				// TODO Auto-generated method stub

			}

			@Override
			public void addItemListener(ItemListener arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public Object[] getSelectedObjects() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void removeItemListener(ItemListener arg0) {
				// TODO Auto-generated method stub

			}
	    }

}

