
public class ConservativeAI extends Player{
    ConservativeAI(String name)
    {
        super(name);
    }
    
    boolean decide()
    {
        return getTotal() <= 11;
    }
}