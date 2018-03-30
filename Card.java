public class Card
{
    private int value;
    private String suit;
    private String rank;
    
    public Card(int v, String s, String r)
    {
        // initialise instance variables
        this.value = v;
        this.suit = s;
        this.rank = r;
    }

    public String getSuit()
    {
        return suit;
    }
    
    public void setAceValue(){
        value = 2;
    }
    
    public String getRank()
    {
        return rank;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public String toString()
    {
        return this.rank + " of " + this.suit + " Value: " + this.value + "\n";
    }
}
