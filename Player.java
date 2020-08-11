import java.util.ArrayList;

public abstract class Player {
    ArrayList<Card> hand;
    String name;
    Player(String name)
    {
        this.name = name;
        hand = new ArrayList<Card>();
    }
    
    void pickUpCard(Deck d)
    {
        hand.add(d.draw());
    }
    
    String showCards()
    {
        //build and return a string that lists all my cards 
        //hand.size() is equivelent to hand.length
        //hand.get(i) is the arraylist equivelent of hand[i]
        String s = "";
        for(int i = 0; i < hand.size(); i++)
        {
            s += hand.get(i)+ ", ";
        }
        return s;
    }
    
    int getTotal()
    {
        //get and return the blackjack values of my cards
        int total = 0;
        for(int i = 0; i < hand.size(); i++)
        {
            if(hand.get(i).getValue() > 10)
            {
                total += 10;
            }
            else
            {
                total += hand.get(i).getValue();
            } 
        }return total;
    }
    
    abstract boolean decide();
    
    void takeTurn(Deck deck)
    {
        boolean hit = true;
        pickUpCard(deck);
        pickUpCard(deck);
        System.out.println(name+ " has " +showCards()+ " for a total of " +getTotal());
        do
        { 
            if(decide() == true)//the user hits
            {
                hit = true;
                pickUpCard(deck);
                System.out.println(name+ " has " +showCards()+ " for a total of " +getTotal());
            }
            else//the user stays
            {
                hit = false;
            }
            if(getTotal() > 21)
            {
                System.out.println(name+ " busted!!");
            }
        }while(hit == true && getTotal() < 21);

    }
}