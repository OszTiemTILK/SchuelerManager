package lehrmittel;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LehrmittelMain extends Application {

	public static void main(String[] pArgs)
	{
		launch(pArgs);
	}

	private Stage grundStage;
	private AnchorPane grundPane;

	@Override
	public void start(Stage pPrimaryStage) throws Exception
	{
		Locale.setDefault(new Locale("de", "DE"));

		this.grundStage = pPrimaryStage;
		FXMLLoader lLoader = new FXMLLoader();
		lLoader.setLocation(LehrmittelMain.class.getClassLoader().getResource("lehrmittel/Maske_6_2_LehrmittelView.fxml"));
		lLoader.setResources(ResourceBundle.getBundle("lehrmittel/LehrmittelResourceBundle", new Locale("de", "DE")));
		grundPane = lLoader.load();

		Scene lScene = new Scene(grundPane);
		grundStage.setScene(lScene);
		grundStage.show();

	}

}
