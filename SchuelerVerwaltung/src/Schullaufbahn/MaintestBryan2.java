/*
 * Hr. Jakob 21.03.2017 angelegt
 */
package Schullaufbahn;

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


public class MaintestBryan2 extends Application
{

    private Stage grundStage;
    private AnchorPane grundPane;

    @Override
	public void start(Stage pPrimaryStage) throws IOException
	{
    	this.grundStage = pPrimaryStage;
        FXMLLoader lLoader = new FXMLLoader();

        lLoader.setLocation(MaintestBryan2.class.getResource("SchullaufbahnView.fxml"));
        grundPane = lLoader.load();

        Scene lScene = new Scene(grundPane);
        grundStage.setScene(lScene);
        grundStage.show();
	}

	public static void main(String[] args)
	  {

	   launch(args);
	   System.out.println("Bla2");

	  }
}
