package ic03a;

public class Billfold
{
    private Card card1;
    private Card card2;
    
    public Billfold()
    {
        
    }
    
    public void addCard(Card c)
    {
        if(card1 == null)
        {
            card1 = c;
        }
        else if(card2 == null)
        {
            card2 = c;
        }
    }
    
    public String formatCards()
    {
        String result = "";
        if(card1 != null)
        {
            result += card1.format();
            
            if(card2 != null)
            {
                result += "\n" + card2.format();
            }
        }
        
        return result;
    }
    
    public String getExpiredCardCount()
    {
        int result = 0;
        
        if(card1.isExpired() == true)
            result++;
        if(card2.isExpired() == true)
            result++;
        
        return "[Expired Cards: " + result + "]";
    }
}
