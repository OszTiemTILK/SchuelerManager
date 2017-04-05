package adresse;


import java.io.IOException;


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
        // Namen der FXML datei ändern
        lLoader.setLocation(AdresseMain.class.getResource("AdresseView.fxml"));
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