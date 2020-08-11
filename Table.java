import java.util.ArrayList;

public class Table {
    ArrayList<Player> players;
    Deck deck;
    Player dealer;//this will be one of the players in the list
    Table()
    {
        players = new ArrayList<Player>();
        deck = new Deck();
    }
    
    void add(Player p)
    {
        players.add(p);
    }
    
    void setDealer(int index)
    {
        dealer = players.get(index);
    }
    
    void play()
    {
        deck.shuffle();
        for(int i = 0; i < players.size(); i++)//all the players take their turns
        { 
            players.get(i).takeTurn(deck);
        }
        for(int i = 0; i < players.size(); i++)
        {
            if(players.get(i) != dealer)
            {
                checkWin(players.get(i), dealer);
            }
        }
        
        //calculate who wins
            //that is, see if each non-dealer player wins
    }
    
    void checkWin(Player p, Player d)
    {
        if(p.getTotal() > d.getTotal() && p.getTotal() < 22)
        {
            System.out.println(p.name+ " beat " +d.name);
        }
        else if(p.getTotal() == d.getTotal())
        {
            System.out.println(d.name+ " beat " +p.name);
        }
        else if(d.getTotal() > p.getTotal() && d.getTotal() < 22)
        {
            System.out.println(d.name+  " beat " +p.name);
        }
        else if(d.getTotal() > 21 && p.getTotal() > 21)
        {
            System.out.println(d.name+ " beat " +p.name);
        }
        else if(p.getTotal() > 21)
        {
            System.out.println(d.name+ " beat " +p.name);
        }
        else if(d.getTotal() > 21)
        {
            System.out.println(p.name+ " beat " +d.name);
        }
    }
}