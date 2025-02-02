package ro.mirodone;

import java.util.Random;

public class CardGenerator {


    //instance variables
     static final String[] allCards = {"2 of Clubs", "2 of Hearts", "2 of Spades",
            "2 of Diamonds", "3 of Clubs", "3 of Hearts", "3 of Diamonds",
            "3 of Spades", "4 of Hearts", "4 of Spades", "4 of Clubs",
            "4 of Diamonds", "5 of Diamonds", "5 of Hearts", "5 of Clubs",
            "5 of Spades", "6 of Hearts", "6 of Spades", "6 of Diamonds",
            "6 of Clubs", "7 of Hearts", "7 of Spades", "7 of Clubs",
            "7 of Diamonds", "8 of Spades", "8 of Hearts", "8 of Diamonds",
            "8 of Clubs", "9 of Diamonds", "9 of Hearts", "9 of Spades",
            "9 of Clubs", "10 of Hearts", "10 of Spades", "10 of Clubs",
            "10 of Diamonds", "Jack of Clubs", "Jack of Diamonds",
            "Jack of Hearts", "Jack of Spades", "Queen of Clubs",
            "Queen of Diamonds", "Queen of Hearts", "Queen of Spades",
            "King of Clubs", "King of Diamonds", "King of Hearts",
            "King of Spades", "Ace of Clubs", "Ace of Diamonds",
            "Ace of Hearts", "Ace of Spades"};


    private Random random;

    CardGenerator() {
        this.random = new Random(System.currentTimeMillis());
    }

    /**
     * Sets and returns the Cards
     *
     * @param nCards - the amount of cards to guess
     * @return a String array of cards
     */
    public String[] getCards(int nCards) {
        String[] cards = new String[nCards];

        for (int i = 0; i < nCards; i++) {
            String newCard = allCards[random.nextInt(52)];

            boolean duplicate = false;

            for (String card : cards) //checks for duplicate
            {
                if (newCard.equals(card)) {
                    duplicate = true;
                }
            }

            if (!duplicate) {
                cards[i] = newCard;
            } else {
                i--;
            }

        }
        return cards;
    }
}
