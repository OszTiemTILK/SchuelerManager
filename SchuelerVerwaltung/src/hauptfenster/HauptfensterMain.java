package hauptfenster;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HauptfensterMain extends Application
{
	private Stage grundstage;
	private Pane grundpane;

	@Override
	public void start(Stage pStage) throws Exception
	{
		this.grundstage = pStage;

		FXMLLoader lLoader= new FXMLLoader();

		this.grundpane = lLoader.load(getClass().getResource("HauptfensterView.fxml"), ResourceBundle.getBundle("hauptfenster/HauptfensterResourceBundle", new Locale("de", "DE")));

		Scene lScene = new Scene(grundpane);

		grundstage.setScene(lScene);

		grundstage.show();
	}

	public static void main(String[] pArgs)
	{
		launch(pArgs);
	}
}
