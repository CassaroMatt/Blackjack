import java.util.Scanner;

public class Human extends Player {
    Human(String name)
    {
        super(name);//runs player constructor, suppling the string
    }
    
    boolean decide()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to hit or stay?");
        String response = input.nextLine();
        if(response.equals("hit"))
        {
            return true;
        }
        else
        {
           return false;
        }
    }
}