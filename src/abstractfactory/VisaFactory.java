package abstractfactory;

import cards.Card;
import cards.Visa;

//Specific factory for visa
public class VisaFactory implements CardAbstractFactory {

    // Attributes
    private int number;
    private String name;
    private int cvv;

    // Constructor
    public VisaFactory(int number, String name, int cvv) {
        this.number = number;
        this.name = name;
        this.cvv = cvv;
    }

    // Specific approach
    @Override
    public Card createCard() {
        // TODO Auto-generated method stub
        return new Visa(number, name, cvv);
    }

}
