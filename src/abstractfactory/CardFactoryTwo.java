package abstractfactory;

import cards.Card;

// This time, this is a Factory that will work
// with any sub factory
public class CardFactoryTwo {

    // And the method will take an abstract factory object
    public static Card getCard(CardAbstractFactory factory) {
        return factory.createCard();
    }

}
