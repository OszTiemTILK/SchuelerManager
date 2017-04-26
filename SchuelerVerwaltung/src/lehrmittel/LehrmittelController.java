package lehrmittel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import anwendungslogik.SchülerID;
import anwendungslogik.SchülerIn;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

public class LehrmittelController
{
	private SchülerIn schülerin;

	private HashMap<String, Lehrmittel[]> lehrmittelMap = new HashMap<String, Lehrmittel[]>();

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
    private TextArea taSchuelerID;

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
    	ArrayList<AusgeliehenLehrmittel> lLehrmittelListe = new ArrayList<AusgeliehenLehrmittel>();

    	if(cbFach1.getValue() != "" && cbArt1.getValue() != "" && cbName1.getValue() != "" && dpAusgegeben1 != null)
    	{
    		lLehrmittelListe.add(new AusgeliehenLehrmittel(dpAusgegeben1.getValue(), ckRückgabe1.isSelected(), new Lehrmittel(cbFach1.getValue(), cbArt1.getValue(), Lehrmittel.holenID(cbFach1.getValue(), cbArt1.getValue(), cbArt1.getValue()))));
    	}

    	if(cbFach2.getValue() != "" && cbArt2.getValue() != "" && cbName2.getValue() != "" && dpAusgegeben2 != null)
    	{
    		lLehrmittelListe.add(new AusgeliehenLehrmittel(dpAusgegeben2.getValue(), ckRückgabe2.isSelected(), new Lehrmittel(cbFach2.getValue(), cbArt2.getValue(), Lehrmittel.holenID(cbFach2.getValue(), cbArt2.getValue(), cbArt2.getValue()))));
    	}

    	if(cbFach3.getValue() != "" && cbArt3.getValue() != "" && cbName3.getValue() != "" && dpAusgegeben3 != null)
    	{
    		lLehrmittelListe.add(new AusgeliehenLehrmittel(dpAusgegeben3.getValue(), ckRückgabe3.isSelected(), new Lehrmittel(cbFach3.getValue(), cbArt3.getValue(), Lehrmittel.holenID(cbFach3.getValue(), cbArt3.getValue(), cbArt3.getValue()))));
    	}

    	if(cbFach4.getValue() != "" && cbArt4.getValue() != "" && cbName4.getValue() != "" && dpAusgegeben4 != null)
    	{
    		lLehrmittelListe.add(new AusgeliehenLehrmittel(dpAusgegeben4.getValue(), ckRückgabe4.isSelected(), new Lehrmittel(cbFach4.getValue(), cbArt4.getValue(), Lehrmittel.holenID(cbFach4.getValue(), cbArt4.getValue(), cbArt4.getValue()))));
    	}

    	if(cbFach5.getValue() != "" && cbArt5.getValue() != "" && cbName5.getValue() != "" && dpAusgegeben5 != null)
    	{
    		lLehrmittelListe.add(new AusgeliehenLehrmittel(dpAusgegeben5.getValue(), ckRückgabe5.isSelected(), new Lehrmittel(cbFach5.getValue(), cbArt5.getValue(), Lehrmittel.holenID(cbFach5.getValue(), cbArt5.getValue(), cbArt5.getValue()))));
    	}

    	schülerin.setAusgeliehenlehrmittel(lLehrmittelListe.toArray(new AusgeliehenLehrmittel[lLehrmittelListe.size()]));

    	schülerin.speichernAusgelieheneLehrmittel();
    }

    private void ladenLehrmittelFürFach(String pFach)
    {
    	if(lehrmittelMap.get(pFach) == null)
    	{
        	Lehrmittel[] lLehrmittel = Lehrmittel.holenFürFach(pFach);

        	lehrmittelMap.put(pFach, lLehrmittel);

        	System.out.println(lLehrmittel);
    	}
    }

    private void zuweisenLehrmittel(ChoiceBox<String> pCbArt, ChoiceBox<String> pCbName, Lehrmittel[] pLehrmittel)
    {
    	ObservableList<String> lLehrmittelArtListe = pCbArt.getItems();
    	ObservableList<String> lLehrmittelNameListe = pCbName.getItems();

    	for(int i = 0; i < pLehrmittel.length; i++)
    	{
    		lLehrmittelArtListe.add(pLehrmittel[i].getArt());
    		lLehrmittelNameListe.add(pLehrmittel[i].getName());
    	}

    	pCbArt.setItems(FXCollections.observableArrayList(lLehrmittelArtListe));
    	pCbName.setItems(FXCollections.observableArrayList(lLehrmittelNameListe));
    }

/*
    public void klickenChoiceboxFach1()
    {
    	if(cbFach1.getValue() != "")
    	{
        	ladenLehrmittel(cbFach1.getValue());

        	zuweisenLehrmittel(cbArt1, cbName1, lehrmittelMap.get(cbFach1.getValue()));
    	}
    }

    public void klickenChoiceboxFach2()
    {
    	ladenLehrmittel(cbFach2.getValue());

    	zuweisenLehrmittel(cbArt2, cbName2, lehrmittelMap.get(cbFach2.getValue()));
    }

    public void klickenChoiceboxFach3()
    {
    	ladenLehrmittel(cbFach3.getValue());

    	zuweisenLehrmittel(cbArt3, cbName3, lehrmittelMap.get(cbFach3.getValue()));
    }

    public void klickenChoiceboxFach4()
    {
    	ladenLehrmittel(cbFach4.getValue());

    	zuweisenLehrmittel(cbArt4, cbName4, lehrmittelMap.get(cbFach4.getValue()));
    }

    public void klickenChoiceboxFach5()
    {
    	ladenLehrmittel(cbFach5.getValue());

    	zuweisenLehrmittel(cbArt5, cbName5, lehrmittelMap.get(cbFach5.getValue()));
    }
*/
    public void drueckenZuruecksetzen()
    {
    	setzenAnfangswerte();
    }

    public void ladenChoiceboxen()
    {
    	cbFach1.setItems(FXCollections.observableArrayList("", "Mathe", "Deutsch", "Musik", "Sport"));
    	cbFach2.setItems(FXCollections.observableArrayList("", "Mathe", "Deutsch", "Musik", "Sport"));
    	cbFach3.setItems(FXCollections.observableArrayList("", "Mathe", "Deutsch", "Musik", "Sport"));
    	cbFach4.setItems(FXCollections.observableArrayList("", "Mathe", "Deutsch", "Musik", "Sport"));
    	cbFach5.setItems(FXCollections.observableArrayList("", "Mathe", "Deutsch", "Musik", "Sport"));
    	cbArt1.setItems(FXCollections.observableArrayList(""));
    	cbArt2.setItems(FXCollections.observableArrayList(""));
    	cbArt3.setItems(FXCollections.observableArrayList(""));
    	cbArt4.setItems(FXCollections.observableArrayList(""));
    	cbArt5.setItems(FXCollections.observableArrayList(""));
    	cbName1.setItems(FXCollections.observableArrayList(""));
    	cbName2.setItems(FXCollections.observableArrayList(""));
    	cbName3.setItems(FXCollections.observableArrayList(""));
    	cbName4.setItems(FXCollections.observableArrayList(""));
    	cbName5.setItems(FXCollections.observableArrayList(""));
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
    }

    public void ladenSchülerIn()
    {
    	schülerin = new SchülerIn();

    	SchülerID lID = new SchülerID();

    	lID.setSchülerID(Integer.parseInt(taSchuelerID.getText()));

    	schülerin.setSchülerID(lID);

    	schülerin.setAusgeliehenlehrmittel(AusgeliehenLehrmittel.holen(schülerin.getSchülerInID()));
    }

    public void ladenLehrmittelFuerSchuelerIn()
    {
    	ladenSchülerIn();
    	ladenLehrmittel();
    }

    public void ladenLehrmittel()
    {

    	AusgeliehenLehrmittel[] lLehrmittel = schülerin.getAusgeliehenlehrmittel();

    	for(int i = 0; i<lLehrmittel.length;i++)
    	{
    		switch(i)
    		{
    		case 0:
    			cbFach1.setValue(lLehrmittel[i].getLehrmittel().getFach());
    			cbArt1.setValue(lLehrmittel[i].getLehrmittel().getArt());
    			cbName1.setValue(lLehrmittel[i].getLehrmittel().getName());
    			dpAusgegeben1.setValue(lLehrmittel[i].getAusgegeben());
    			ckRückgabe1.setSelected(lLehrmittel[i].isRückgabe());
    			break;
    		case 1:
    			cbFach2.setValue(lLehrmittel[i].getLehrmittel().getFach());
    			cbArt2.setValue(lLehrmittel[i].getLehrmittel().getArt());
    			cbName2.setValue(lLehrmittel[i].getLehrmittel().getName());
    			dpAusgegeben2.setValue(lLehrmittel[i].getAusgegeben());
    			ckRückgabe2.setSelected(lLehrmittel[i].isRückgabe());
    			break;
    		case 2:
    			cbFach3.setValue(lLehrmittel[i].getLehrmittel().getFach());
    			cbArt3.setValue(lLehrmittel[i].getLehrmittel().getArt());
    			cbName3.setValue(lLehrmittel[i].getLehrmittel().getName());
    			dpAusgegeben3.setValue(lLehrmittel[i].getAusgegeben());
    			ckRückgabe3.setSelected(lLehrmittel[i].isRückgabe());
    			break;
    		case 3:
    			cbFach4.setValue(lLehrmittel[i].getLehrmittel().getFach());
    			cbArt4.setValue(lLehrmittel[i].getLehrmittel().getArt());
    			cbName4.setValue(lLehrmittel[i].getLehrmittel().getName());
    			dpAusgegeben4.setValue(lLehrmittel[i].getAusgegeben());
    			ckRückgabe4.setSelected(lLehrmittel[i].isRückgabe());
    			break;
    		case 4:
    			cbFach5.setValue(lLehrmittel[i].getLehrmittel().getFach());
    			cbArt5.setValue(lLehrmittel[i].getLehrmittel().getArt());
    			cbName5.setValue(lLehrmittel[i].getLehrmittel().getName());
    			dpAusgegeben5.setValue(lLehrmittel[i].getAusgegeben());
    			ckRückgabe5.setSelected(lLehrmittel[i].isRückgabe());
    			break;

    		}
    	}

	}

    @FXML
    public void initialize()
    {
    	laden();

    	ladenAlleLehrmittel();
    }

    private void ladenAlleLehrmittel()
    {
    	for(String lFach : cbFach1.getItems())
    	{
    		if(lFach != "")
    		{
    			ladenLehrmittelFürFach(lFach);
    			zuweisenLehrmittelAlleFelder(lFach);
    		}
    	}
    }

    private void zuweisenLehrmittelAlleFelder(String pFach)
    {
    	zuweisenLehrmittel(cbArt1, cbName1, lehrmittelMap.get(pFach));
    	zuweisenLehrmittel(cbArt2, cbName2, lehrmittelMap.get(pFach));
    	zuweisenLehrmittel(cbArt3, cbName3, lehrmittelMap.get(pFach));
    	zuweisenLehrmittel(cbArt4, cbName4, lehrmittelMap.get(pFach));
    	zuweisenLehrmittel(cbArt5, cbName5, lehrmittelMap.get(pFach));

    }

}
