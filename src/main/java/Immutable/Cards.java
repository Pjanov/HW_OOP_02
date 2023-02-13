package Immutable;

import java.util.Arrays;

/**
 * Карты(игральные)
 *
 * @cardSuit массив из мастей карт
 * @cardRank массив рангов карт
 */
final class Cards {
    private final String[] cardSuit;
    private final String[] cardRank;

    {
        cardSuit = new String[]{"Червы", "Бубны", "Трефы", "Пики"};
        cardRank = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "К", "Т"};
    }

    public Cards() {
    }

    public String[] getCardSuit() {
        return cardSuit.clone();
    }

    public String[] getCardRank() {
        return cardRank.clone();
    }

    @Override
    public String toString() {
        return String.format("Масти: %s, Ранг: %s ",
                Arrays.toString(cardSuit), Arrays.toString(cardRank));
    }
}
