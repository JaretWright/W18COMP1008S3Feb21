package w18comp1008s3feb21;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class CardViewController implements Initializable
{
    @FXML    private Label faceNameLabel;
    @FXML    private Label suitLabel;
    @FXML    private Label valueLabel;
             private Card activeCard;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        //create a deck of cards each time the view is launched
        DeckOfCards deck = new DeckOfCards();
        activeCard = deck.dealTopCard();
        
    }    
    
}
