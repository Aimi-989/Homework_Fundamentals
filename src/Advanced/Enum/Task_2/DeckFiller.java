package Advanced.Enum.Task_2;

import java.util.Arrays;
import java.util.List;

import static java.util.Optional.of;

public class DeckFiller {

    public static void fillDeck() {


        CardSuit[] values = CardSuit.values();
        CardRank[] ranks = CardRank.values();

//        for (int i=0; i <= values.length-1; i++) {
//            for (int a=0; a <= ranks.length-1; a++) {
//            }
//        }

        List<CardSuit> allSuits = Arrays.asList(values);
        List<CardRank> allRanks = Arrays.asList(ranks);


//        for (CardSuit suit : allSuits) {
//              for (CardRank rank : allRanks) {
//            }
//        }

        Deck deck = new Deck();

        allSuits.forEach(suit -> {

            //HEARTS step 1

            allRanks.forEach(rank -> {
                Card c = new Card();
                c.setRank(rank);
                c.setSuit(suit);
                deck.getCards().add(c);
            });
        });
    }
}
