package kontaktdaten;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

public class KontaktdatenProgramm extends Application
{

		private Stage grundStage;
	    private AnchorPane grundPane;

	    @Override
		public void start(Stage pPrimaryStage) throws IOException
		{
	    	this.grundStage = pPrimaryStage;
	        FXMLLoader lLoader = new FXMLLoader();
	        //Locale.setDefault(new Locale("de","DE"));
	        //Locale.setDefault(new Locale("ar","SY"));
	        Locale.setDefault(new Locale("en","UK"));

	        ResourceBundle lZBA_RB = ResourceBundle.getBundle("kontaktdaten/KontaktdatenResourceBundle");
	        lLoader.setLocation(KontaktdatenProgramm.class.getResource("KontaktdatenView.fxml"));
	        lLoader.setResources(lZBA_RB);

	       /* lLoader.setLocation(KontaktdatenProgramm.class.getResource("KontaktdatenView.fxml"));
	        grundPane = lLoader.load();*/

	        grundPane= lLoader.load();

	        Scene lScene = new Scene(grundPane);
	        grundStage.setScene(lScene);
	        grundStage.show();
		}

		public static void main(String[] args)
		  {

		   launch(args);

		  }

	}

