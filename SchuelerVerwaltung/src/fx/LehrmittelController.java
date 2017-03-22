package fx;

import java.time.LocalDate;

import anwendungslogik.Lehrmittel;
import anwendungslogik.SchülerIn;
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
    	Lehrmittel[] lLehrmittel = new Lehrmittel[5];

    	if(cbFach1 != null && cbArt1 != null && cbName1 != null && dpAusgegeben1 != null)
    	{
    		lLehrmittel[0] = new Lehrmittel(cbFach1.getValue(), cbArt1.getValue(), cbName1.getValue(), dpAusgegeben1.getValue(), ckRückgabe1.isSelected());
    	}

    	if(cbFach2 != null && cbArt2 != null && cbName2 != null && dpAusgegeben2 != null)
    	{
    		lLehrmittel[1] = new Lehrmittel(cbFach2.getValue(), cbArt2.getValue(), cbName2.getValue(), dpAusgegeben2.getValue(), ckRückgabe2.isSelected());
    	}

    	if(cbFach3 != null && cbArt3 != null && cbName3 != null && dpAusgegeben3 != null)
    	{
    		lLehrmittel[2] = new Lehrmittel(cbFach3.getValue(), cbArt3.getValue(), cbName3.getValue(), dpAusgegeben3.getValue(), ckRückgabe3.isSelected());
    	}

    	if(cbFach4 != null && cbArt4 != null && cbName4 != null && dpAusgegeben4 != null)
    	{
    		lLehrmittel[3] = new Lehrmittel(cbFach4.getValue(), cbArt4.getValue(), cbName4.getValue(), dpAusgegeben4.getValue(), ckRückgabe4.isSelected());
    	}

    	if(cbFach5 != null && cbArt5 != null && cbName5 != null && dpAusgegeben5 != null)
    	{
    		lLehrmittel[4] = new Lehrmittel(cbFach5.getValue(), cbArt5.getValue(), cbName5.getValue(), dpAusgegeben5.getValue(), ckRückgabe5.isSelected());
    	}

    	schülerin.setLehrmittel(lLehrmittel);
    }

    public void drueckenZuruecksetzen()
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
    	cbName1.setItems(FXCollections.observableArrayList(""));
    	cbName2.setItems(FXCollections.observableArrayList(""));
    	cbName3.setItems(FXCollections.observableArrayList(""));
    	cbName4.setItems(FXCollections.observableArrayList(""));
    	cbName5.setItems(FXCollections.observableArrayList(""));
    }

    public void setzenAnfangswerte()
    {
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
    }

    public void laden()
    {
    	ladenChoiceboxen();

    	setzenAnfangswerte();
    }
}
