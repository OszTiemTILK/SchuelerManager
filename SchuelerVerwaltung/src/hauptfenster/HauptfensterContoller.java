package hauptfenster;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HauptfensterContoller implements Initializable
{
	private Locale sprache;

    @FXML
    private AnchorPane pnAdresse;

    @FXML
    private AnchorPane pnKontakt;

    @FXML
    private AnchorPane pnSchule;

    @FXML
    private AnchorPane pnAllgemein;

    @FXML
    private AnchorPane pnLehrmittel;

    @FXML
    private AnchorPane pnSprache;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfID;

	@FXML
	private Button btDeutsch;

	@FXML
	private Button btEnglisch;

	@FXML
	private Button btArabisch;


	private void ladenLehrmittel(Locale pLocale)
	{
		try
		{
			pnLehrmittel.getChildren().setAll((Node) FXMLLoader.load(getClass().getClassLoader().getResource("lehrmittel/Maske_6_2_LehrmittelView.fxml"), ResourceBundle.getBundle("lehrmittel/LehrmittelResourceBundle", pLocale)));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private void ladenKontaktdaten(Locale pLocale)
	{
		try
		{
			pnKontakt.getChildren().setAll((Node) FXMLLoader.load(getClass().getClassLoader().getResource("kontaktdaten/KontaktdatenView.fxml"), ResourceBundle.getBundle("kontaktdaten/KontaktdatenResourceBundle", pLocale)));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	@FXML
	public void drueckenDeutsch()
	{
		sprache = new Locale("de", "DE");

		ladenSpalten();
	}

	@FXML
	public void drueckenEnglisch()
	{
		sprache = new Locale("en", "UK");

		ladenSpalten();
	}

	@FXML
	public void drueckenArabisch()
	{
		sprache = new Locale("ar", "SY");

		ladenSpalten();
	}

	private void ladenSpalten()
	{
		ladenLehrmittel(sprache);
		ladenKontaktdaten(sprache);
	}

	@Override
	public void initialize(URL pURL, ResourceBundle pBundle)
	{
		this.sprache = pBundle.getLocale();

		ladenSpalten();
	}
}
