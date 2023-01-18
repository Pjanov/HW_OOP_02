package Immutable;

import java.util.Arrays;

public class Main {
    static Cards cards = new Cards();

    public static void main(String[] args) {

        String[] deck36 = getDeckOf_36Cards();
        System.out.println(Arrays.toString(deck36));

    }

    /**
     * Получить колоду карт 52 шт
     *
     * @return массив
     */
    public static String[] getDeckOf_52Cards() {
        String[] deck = new String[52];
        int count = 0;
        for (int i = 0; i < cards.getCardSuit().length; i++) {
            for (int j = 0; j < cards.getCardRank().length; j++) {
                deck[count] = cards.getCardSuit()[i] + " " + cards.getCardRank()[j];
                count++;
            }
        }
        return deck;
    }

    /**
     * Получить колоду карт 36 шт
     *
     * @return массив
     */
    public static String[] getDeckOf_36Cards() {
        String[] deck = new String[36];
        int count = 0;
        for (int i = 0; i < cards.getCardSuit().length; i++) {
            for (int j = 4; j < cards.getCardRank().length; j++) {
                deck[count] = cards.getCardSuit()[i] + " " + cards.getCardRank()[j];
                count++;
            }
        }
        return deck;
    }
}
