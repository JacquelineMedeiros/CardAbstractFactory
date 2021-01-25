package factory;

import cards.Card;
import cards.Maestro;
import cards.Mastercard;
import cards.Visa;

// The Factory class will be our helper to instantiate 
// the sub classes of card
public class CardFactory {

    // This method is static to so all clients can
    // request an instance of the class
    public static Card getCard(String type, int number, String name, int cvv) {

        // If statement to define the adequate 
        // type of card
        switch (type) {
            case "Visa":
                return new Visa(number, name, cvv);
            case "Mastercard":
                return new Mastercard(number, name, cvv);
            case "Maestro":
                return new Maestro(number, name, cvv);
            default:
                return null;
        }

    }

}
