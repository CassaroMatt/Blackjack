
public class RiskyAI extends Player{
    RiskyAI(String name)
    {
        super(name);
    }
    
    boolean decide()
    {
        if(getTotal() < 20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
