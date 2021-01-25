package abstractfactory;

import cards.Card;
import cards.Maestro;

// Specific factory for maestro
public class MaestroFactory implements CardAbstractFactory {

    // Attributes
    private int number;
    private String name;
    private int cvv;

    // Constructor
    public MaestroFactory(int number, String name, int cvv) {
        this.number = number;
        this.name = name;
        this.cvv = cvv;
    }

    // Specific approach
    @Override
    public Card createCard() {
        // TODO Auto-generated method stub
        return new Maestro(number, name, cvv);
    }

}
