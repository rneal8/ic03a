package ic03a;

public class BillfoldTester
{
    public static void main(String[] args)
    {
        Card testCard1 = new CallingCard("Ryan", "1234567", "1990");
        Card testCard2 = new DriverLicense("Neal", "2018");
        Billfold deck = new Billfold();
        
        deck.addCard(testCard1);
        deck.addCard(testCard2);
        
        //System.out.println(deck.formatCards());
        //System.out.println(deck.getExpiredCardCount());
        
        System.out.println(testCard1.toString());
        System.out.println(testCard2.toString());
    }
}
