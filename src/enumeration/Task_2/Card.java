package enumeration.Task_2;

import java.util.*;

public class Card {
    enum Rank
    {
        ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT,
        SEVEN, SIX, FIVE, FOUR, THREE, TWO;
    }

    enum Suit
    {
        DIAMONDS, HEARTS, CLUBS, SPADES
    }
    public final Rank rank;
    public final Suit suit;

    public Card (Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Rank rank(){
        return rank;
    }

    public Suit suit(){
        return suit;
    }

    public String toString (){
        return rank + " of " + suit;
    }

    private static final List<Card> Deck = new ArrayList<Card>();

    static{
        for (Suit suit : Suit.values())
            for (Rank rank : Rank.values())
                Deck.add(new Card(rank, suit));
    }

    public static ArrayList<Card> newDeck(){
        return new ArrayList<Card>(Deck);
    }
}
