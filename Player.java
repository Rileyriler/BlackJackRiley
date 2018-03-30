import java.util.ArrayList;
import java.util.Scanner;
public class Player
{
    // instance variables - replace the example below with your own
    private String name;
    private int amountOfMoney;
    public ArrayList<Card> hand;
    private int handTotal;
    private Scanner scan = new Scanner(System.in);
    public Player(int amt, String nm)
    {
        // initialise instance variables
        this.name = nm;
        this.amountOfMoney = amt;
        hand = new ArrayList<Card>();
    }
    
    public void getHand(Card c)
    {
        hand.add(c);
    }
    
    public void bet(int x)
    {
        amountOfMoney += (x * -1);
    }
    
    public void hit(Card c){
        hand.add(c);
    }
    
    public boolean stay(){
        if(calculateHandTotal(hand) > 21){
            return true;
        }
        System.out.println("Do you want to stay? Y/N");
        String answer = scan.next().toLowerCase();
        if(answer.equals("y")){
           return true;
        }
        else {
           return false;
        }
    }
    
    public int calculateHandTotal(ArrayList<Card> h){
        int total = 0;
        for(Card c : h){
            if(c.getRank().equals("Ace") && (total > 9)){
                c.setAceValue();
            }
            total += c.getValue();
        }
        return total;
    }
    
    public String toString() {
        String temp = "Your Cards: \n";
        
        for(Card c : hand) {
            temp += c.toString();
        }
        handTotal = calculateHandTotal(hand);
        temp += "\n" + handTotal + "\n";
        
        return temp;
    }
}
