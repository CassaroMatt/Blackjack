
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Table table = new Table();
        table.add(new Human("The user"));
        table.add(new AI("Another player"));
        table.add(new RiskyAI("Evel Knievel"));
        table.add(new ConservativeAI("George W Bush"));
        table.add(new TwoFace());
        table.add(new AustinPowers());
        table.add(new AI("The dealer"));
        table.setDealer(6);
        table.play();
    } 
}