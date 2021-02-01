package Advanced.Enum.Task_2;

import java.util.Arrays;

public class Deck {
    public static void main(String[] args) {
        Rank_of_a_card[] rank = Rank_of_a_card.values();
        System.out.println(Arrays.toString(rank));

        Suit_of_a_card[] suit = Suit_of_a_card.values();
        System.out.println((Arrays.toString(suit)));

    }
}
