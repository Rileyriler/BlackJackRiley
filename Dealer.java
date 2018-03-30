import java.util.ArrayList;
public class Dealer extends Player
{
    private String name;
    private int amountOfMoney;
    public ArrayList<Card> dealerhand;
    private int handTotal;
    
    public Dealer()
    {
         //initialise instance variables
         super(0, "Dealer");
         dealerhand = new ArrayList<Card>();
    }
    
    public void getHand(Card c)
    {
        dealerhand.add(c);
    }
    
    public String toString() {
        String temp = "Dealer's Cards: \n";
        
        for(Card c : dealerhand) {
            temp += c.toString();
        }
        handTotal = calculateHandTotal(dealerhand);
        temp += "\n" + handTotal + "\n";
        
        return temp;
        
    }

}
