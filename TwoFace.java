

import java.util.Random;

public class TwoFace extends Player{
    TwoFace()
    {
        super("Harvey Dent");
    }
    
    boolean decide()
    {
        Random coin = new Random();
        System.out.println("Heads I hit; Tales I stay");
        int choice = coin.nextInt(2);
        if(choice == 0)
        {
            System.out.println("Heads, I'll hit");
            return true;
        }
        else
        {
            System.out.println("Tails, I'll stay");
            return false;
        }
    }
}