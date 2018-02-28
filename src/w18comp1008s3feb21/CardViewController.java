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
             private DeckOfCards deck;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        //create a deck of cards each time the view is launched
        deck = new DeckOfCards();
        activeCard = deck.dealTopCard();
        updateView();
    }    
    
    /**
     * This method will update the view to the next card in the deck
     */
    public void getNextCardButtonPushed()
    {
        activeCard = deck.dealTopCard();
        updateView();
    }
    
    /**
     * This method will update the labels and image to the current
     * active card for the view
     */
    public void updateView()
    {
        this.faceNameLabel.setText("Face Name:  "+activeCard.getFaceName());
        this.suitLabel.setText("Suit:  "+activeCard.getSuit());
        this.valueLabel.setText("Value:  "+activeCard.getValue());
    }
    
}
