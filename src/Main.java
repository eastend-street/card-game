public class Main {
    public static void main(String[] args) {
        String[] suits = {"Clubs", "Hearts", "Diamond", "Spades"};
        String[] numbers = {"Ace", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "Jack", "Queen", "King"};

        Deck aDeck = new Deck(52,4);
        Card[] cards = new Card[aDeck.numberOfCards];

        int cardIndex = 0;
        for(int i = 0; i < numbers.length ; i++){
            for(int j = 0; j < suits.length; j++){
                cards[cardIndex] = new Card(numbers[i],suits[j]);
                cardIndex++;
            }
        }

        for(int i = 0; i < aDeck.numberOfCards; i++){
            System.out.println(cards[i].cardNumber + " of " + cards[i].cardSuit);
        }
    }
}
