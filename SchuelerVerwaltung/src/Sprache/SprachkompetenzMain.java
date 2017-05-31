package Sprache;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.NodeOrientation;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SprachkompetenzMain extends Application {

	//Kann nicht weg!
	public static void main(String[] pArgs)
	{
		launch(pArgs);
	}


	private Stage grundStage;
	private AnchorPane grundPane;

	@Override
	public void start(Stage pPrimaryStage) throws Exception
	{
		this.grundStage = pPrimaryStage;
        FXMLLoader lLoader = new FXMLLoader();
        //Locale.setDefault(new Locale("ar","SY"));
        Locale.setDefault(new Locale("de","DE"));

        ResourceBundle lZBA_RB = ResourceBundle.getBundle("sprache/SchülerManagerResourceBundle");
        lLoader.setLocation(SprachkompetenzMain.class.getResource("SprachenView.fxml"));
        lLoader.setResources(lZBA_RB);

        grundPane = lLoader.load();

        Scene lScene = new Scene(grundPane);
        grundStage.setScene(lScene);
        grundStage.show();

	}

}

