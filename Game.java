import java.util.ArrayList;
public class Game
{
    // instance variables - replace the example below with your own
    private ArrayList<Player> players;
    private Deck d;
    private Player p;
    private Dealer dealer;
    public Game()
    {
        // initialise instance variables
        players =  new ArrayList<Player>();
        d = new Deck();
        p = new Player(100, "Player");
        p.getHand(d.deal());
        p.getHand(d.deal());
        dealer = new Dealer();
        dealer.getHand(d.deal());
        dealer.getHand(d.deal());
    }

    public void play()
    {
        
        System.out.println(p);
        //Player hits until done
        while(! p.stay()) {
            p.getHand(d.deal());
            System.out.println(p);
        }
        
        //Dealer hits until 17 or greater
        System.out.println(dealer);
        while(dealer.calculateHandTotal(dealer.dealerhand) < 17){
            dealer.getHand(d.deal());
            System.out.println(dealer);
        }
        
        //Determine winner
        determineWinner();
    }
    
    public void determineWinner()
    {
        if(p.calculateHandTotal(p.hand) > 21){
            System.out.println("YOU LOSE");
        }
        else if(dealer.calculateHandTotal(dealer.dealerhand) > 21){
            System.out.println("YOU WIN!!!!!");
        }
        else if(dealer.calculateHandTotal(dealer.dealerhand) == 21){
            System.out.println("YOU LOSE");
        }
        else if(p.calculateHandTotal(p.hand) > dealer.calculateHandTotal(dealer.dealerhand)){
            System.out.println("YOU WIN!!!!!");
        }
        else if(dealer.calculateHandTotal(dealer.dealerhand) > p.calculateHandTotal(p.hand)){
            System.out.println("YOU LOSE");
        }
        
    }
    
    public void endGame()
    {
        
    }
}
