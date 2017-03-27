package fx;

import java.time.LocalDate;
import java.util.ArrayList;

import anwendungslogik.Lehrmittel;
import anwendungslogik.SchülerID;
import anwendungslogik.SchülerIn;
import datenbank.DBVerbindung;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

public class LehrmittelController
{
	private SchülerIn schülerin;

    @FXML
    private ChoiceBox<String> cbArt4;

    @FXML
    private ChoiceBox<String> cbArt5;

    @FXML
    private ChoiceBox<String> cbName2;

    @FXML
    private ChoiceBox<String> cbName3;

    @FXML
    private ChoiceBox<String> cbName4;

    @FXML
    private ChoiceBox<String> cbName5;

    @FXML
    private ChoiceBox<String> cbArt1;

    @FXML
    private ChoiceBox<String> cbArt2;

    @FXML
    private ChoiceBox<String> cbArt3;

    @FXML
    private ChoiceBox<String> cbName1;

    @FXML
    private DatePicker dpAusgegeben1;

    @FXML
    private DatePicker dpAusgegeben3;

    @FXML
    private DatePicker dpAusgegeben2;

    @FXML
    private Button btSpeichern;

    @FXML
    private ChoiceBox<String> cbFach3;

    @FXML
    private Button btZuruecksetzen;

    @FXML
    private DatePicker dpAusgegeben5;

    @FXML
    private DatePicker dpAusgegeben4;

    @FXML
    private TextArea taName;

    @FXML
    private ChoiceBox<String> cbFach2;

    @FXML
    private ChoiceBox<String> cbFach1;

    @FXML
    private CheckBox ckRückgabe1;

    @FXML
    private CheckBox ckRückgabe4;

    @FXML
    private ChoiceBox<String> cbFach5;

    @FXML
    private CheckBox ckRückgabe5;

    @FXML
    private ChoiceBox<String> cbFach4;

    @FXML
    private CheckBox ckRückgabe2;

    @FXML
    private CheckBox ckRückgabe3;


    public void drueckenSpeichern()
    {
    	ArrayList<Lehrmittel> lLehrmittel = new ArrayList<Lehrmittel>();

    	if(cbFach1.getValue() != "" && cbArt1.getValue() != "" && cbName1.getValue() != "" && dpAusgegeben1 != null)
    	{
    		lLehrmittel.add(new Lehrmittel(cbFach1.getValue(), cbArt1.getValue(), cbName1.getValue(), dpAusgegeben1.getValue(), ckRückgabe1.isSelected()));
    	}

    	if(cbFach2.getValue() != "" && cbArt2.getValue() != "" && cbName2.getValue() != "" && dpAusgegeben2 != null)
    	{
    		lLehrmittel.add(new Lehrmittel(cbFach2.getValue(), cbArt2.getValue(), cbName2.getValue(), dpAusgegeben2.getValue(), ckRückgabe2.isSelected()));
    	}

    	if(cbFach3.getValue() != "" && cbArt3.getValue() != "" && cbName3.getValue() != "" && dpAusgegeben3 != null)
    	{
    		lLehrmittel.add(new Lehrmittel(cbFach3.getValue(), cbArt3.getValue(), cbName3.getValue(), dpAusgegeben3.getValue(), ckRückgabe3.isSelected()));
    	}

    	if(cbFach4.getValue() != "" && cbArt4.getValue() != "" && cbName4.getValue() != "" && dpAusgegeben4 != null)
    	{
    		lLehrmittel.add(new Lehrmittel(cbFach4.getValue(), cbArt4.getValue(), cbName4.getValue(), dpAusgegeben4.getValue(), ckRückgabe4.isSelected()));
    	}

    	if(cbFach5.getValue() != "" && cbArt5.getValue() != "" && cbName5.getValue() != "" && dpAusgegeben5 != null)
    	{
    		lLehrmittel.add(new Lehrmittel(cbFach5.getValue(), cbArt5.getValue(), cbName5.getValue(), dpAusgegeben5.getValue(), ckRückgabe5.isSelected()));
    	}

    	schülerin.setLehrmittel(lLehrmittel.toArray(new Lehrmittel[lLehrmittel.size()]));

    	schülerin.speichernLehrmittel();
    }

    public void drueckenZuruecksetzen()
    {
    	setzenAnfangswerte();
    }

    public void ladenChoiceboxen()
    {
    	cbFach1.setItems(FXCollections.observableArrayList("", "Mathe", "Deutsch", "Englisch", "Sport"));
    	cbFach2.setItems(FXCollections.observableArrayList("", "Mathe", "Deutsch", "Englisch", "Sport"));
    	cbFach3.setItems(FXCollections.observableArrayList("", "Mathe", "Deutsch", "Englisch", "Sport"));
    	cbFach4.setItems(FXCollections.observableArrayList("", "Mathe", "Deutsch", "Englisch", "Sport"));
    	cbFach5.setItems(FXCollections.observableArrayList("", "Mathe", "Deutsch", "Englisch", "Sport"));
    	cbArt1.setItems(FXCollections.observableArrayList("", "Fachbuch", "Formelbuch"));
    	cbArt2.setItems(FXCollections.observableArrayList("", "Fachbuch", "Formelbuch"));
    	cbArt3.setItems(FXCollections.observableArrayList("", "Fachbuch", "Formelbuch"));
    	cbArt4.setItems(FXCollections.observableArrayList("", "Fachbuch", "Formelbuch"));
    	cbArt5.setItems(FXCollections.observableArrayList("", "Fachbuch", "Formelbuch"));
    	cbName1.setItems(FXCollections.observableArrayList("", "Buch 1", "Buch 2"));
    	cbName2.setItems(FXCollections.observableArrayList("", "Buch 1", "Buch 2"));
    	cbName3.setItems(FXCollections.observableArrayList("", "Buch 1", "Buch 2"));
    	cbName4.setItems(FXCollections.observableArrayList("", "Buch 1", "Buch 2"));
    	cbName5.setItems(FXCollections.observableArrayList("", "Buch 1", "Buch 2"));
    }

    public void setzenAnfangswerte()
    {
    	cbFach1.setValue("");
    	cbFach2.setValue("");
    	cbFach3.setValue("");
    	cbFach4.setValue("");
    	cbFach5.setValue("");
    	cbArt1.setValue("");
    	cbArt2.setValue("");
    	cbArt3.setValue("");
    	cbArt4.setValue("");
    	cbArt5.setValue("");
    	cbName1.setValue("");
    	cbName2.setValue("");
    	cbName3.setValue("");
    	cbName4.setValue("");
    	cbName5.setValue("");
    	dpAusgegeben1.setValue(LocalDate.now());
    	dpAusgegeben2.setValue(LocalDate.now());
    	dpAusgegeben3.setValue(LocalDate.now());
    	dpAusgegeben4.setValue(LocalDate.now());
    	dpAusgegeben5.setValue(LocalDate.now());
    	ckRückgabe1.setSelected(false);
    	ckRückgabe2.setSelected(false);
    	ckRückgabe3.setSelected(false);
    	ckRückgabe4.setSelected(false);
    	ckRückgabe5.setSelected(false);
    	taName.setText("");
    }

    public void laden()
    {
    	ladenChoiceboxen();

    	setzenAnfangswerte();

    	ladenSchülerIn();
    }

    public void ladenSchülerIn()
    {
    	DBVerbindung lDB = new DBVerbindung();

    	schülerin = new SchülerIn();

    	SchülerID lID = new SchülerID();

    	lID.setSchülerID(111);

    	schülerin.setSchülerID(lID);

    	schülerin.setLehrmittel(lDB.holenLehrmittel(schülerin.getSchülerInID()));
    }

    @FXML
    public void initialize()
    {
    	laden();
    }
}
