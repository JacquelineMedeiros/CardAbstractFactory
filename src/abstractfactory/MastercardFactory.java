package abstractfactory;

import cards.Card;
import cards.Mastercard;

//Specific factory for Mastercard
public class MastercardFactory implements CardAbstractFactory {

    // Attributes
    private int number;
    private String name;
    private int cvv;

    // Constructor
    public MastercardFactory(int number, String name, int cvv) {
        this.number = number;
        this.name = name;
        this.cvv = cvv;
    }

    // Specific approach
    @Override
    public Card createCard() {
        // TODO Auto-generated method stub
        return new Mastercard(number, name, cvv);
    }

}
