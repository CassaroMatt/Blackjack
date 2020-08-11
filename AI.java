
public class AI extends Player {
    AI(String name)
    {
        super(name);
    }
    
    boolean decide()
    {
        if(getTotal() < 17)
        {
            System.out.println(name+ " hit");
            return true;
        }
        else 
        {
            System.out.println(name+ " stayed");
            return false;
        }
    }
}