package ic03a;

public class CallingCard extends Card
{
    private String cardNum;
    private String pin;
    
    public CallingCard(String n, String num, String p)
    {  
       super(n);
       cardNum = num;
       pin = p;
    }

    public String format()
    {
        return super.format() + "[Card Number: " + cardNum + "][PIN:" + pin + "]";
    }
    
    public String toString()
    {
        return "CallingCard" + format();
    } 
}
