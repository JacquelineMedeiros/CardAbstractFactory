package abstractfactory;

import cards.Card;

// This could be an abstract class if you want
public interface CardAbstractFactory {

    // I'm forcing sub classes to to have this method
    public Card createCard();

}
