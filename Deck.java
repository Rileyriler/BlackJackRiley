import java.util.ArrayList;
import java.util.Random;
public class Deck
{
    private ArrayList<Card> deck;
    
    public Deck()
    {
        deck = new ArrayList<Card>();
        initializeDeck();
    }
    
    public void initializeDeck()
    {
        String[] suits = {"Hearts,", "Clubs", "Spades", "Diamonds"};
        String[] ranks = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Ace"};
        String[] faceRanks = {"Jack", "Queen", "King"};
        for(String s : suits){
            int value = 2;
            for(String r : ranks){
                Card temp = new Card(value, s, r);
                value++;
                deck.add(temp);
            }
            for(String fr : faceRanks){
                Card temp = new Card(10, s, fr);
                deck.add(temp);
            }
        }
    }
    
    public Card deal() {
        Random rand = new Random();
        return deck.remove(rand.nextInt(deck.size()));
    }
}
