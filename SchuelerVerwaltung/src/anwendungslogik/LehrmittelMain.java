package anwendungslogik;

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
		this.grundStage = pPrimaryStage;
		FXMLLoader lLoader = new FXMLLoader();
		lLoader.setLocation(LehrmittelMain.class.getClassLoader().getResource("fx/Maske_6_2_LehrmittelView.fxml"));
		grundPane = lLoader.load();

		Scene lScene = new Scene(grundPane);
		grundStage.setScene(lScene);
		grundStage.show();

	}

}
