package main;

import abstractfactory.CardFactoryTwo;
import abstractfactory.MaestroFactory;
import abstractfactory.MastercardFactory;
import abstractfactory.VisaFactory;
import cards.Card;
import factory.CardFactory;

public class Week3Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Using the Factory class
        // Notice that the first argument is the type of card
        Card myVisaOne = CardFactory.getCard("Visa", 123456, "Frodo Baggins", 123);
        Card myMCOne = CardFactory.getCard("Mastercard", 123456, "Samwise Gamgee", 456);
        Card myMaestroOne = CardFactory.getCard("Maestro", 123456, "Meriadoc Brandybuck", 789);

        System.out.println(myVisaOne);
        System.out.println(myMCOne);
        System.out.println(myMaestroOne);

        // Using the Abstract Factory class
        // In this case, the argument is an object, and instance of the type of factory I need
        Card myVisaTwo = CardFactoryTwo.getCard(new VisaFactory(549843, "Bilbo Baggins", 987));
        Card myMCTwo = CardFactoryTwo.getCard(new MastercardFactory(549843, "Perigrin Took", 654));
        Card myMaestroTwo = CardFactoryTwo.getCard(new MaestroFactory(549843, "Rosie Cotton", 321));

        System.out.println(myVisaTwo);
        System.out.println(myMCTwo);
        System.out.println(myMaestroTwo);
    }

}
