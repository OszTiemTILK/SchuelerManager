package adresse;


import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AdresseMain extends Application {

    private Stage grundStage;
    private AnchorPane grundPane;

    @Override
	public void start(Stage pPrimaryStage) throws IOException
	{
    	this.grundStage = pPrimaryStage;
        FXMLLoader lLoader = new FXMLLoader();
        //Hier können Sie zwischen den Sprachen wechseln
        Locale.setDefault(new Locale("de","DE"));
        //Locale.setDefault(new Locale("ar","SY"));


        ResourceBundle lZBA_RB = ResourceBundle.getBundle("adresse/AdresseResourceBundle");
        lLoader.setLocation(AdresseMain.class.getResource("AdresseView.fxml"));
        lLoader.setResources(lZBA_RB);

        grundPane = lLoader.load();

        Scene lScene = new Scene(grundPane);
        grundStage.setScene(lScene);
        grundStage.show();
	}

	public static void main(String[] args)
	  {

	   launch(args);

	  }
}