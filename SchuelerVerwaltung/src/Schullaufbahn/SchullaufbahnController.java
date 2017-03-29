package Schullaufbahn;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SchullaufbahnController 
{

    @FXML
    private TextField tfSchulname4;

    @FXML
    private Button btWeiter;

    @FXML
    private TextField tfSchulname3;

    @FXML
    private TextField tfSchulname2;

    @FXML
    private TextField tfSchulname1;

    @FXML
    void anlegenSchule(ActionEvent event) 
    {
    	Schule lSchule = new Schule(SchülerID.getAktuelleSchülerID(), tfSchulname1.getText());
    	lSchule.anlegen();
    	System.out.print("bla");
    }

    @FXML
    void anlegen(ActionEvent event) 
    {

    }

}
