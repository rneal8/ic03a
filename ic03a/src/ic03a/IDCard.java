package ic03a;

public class IDCard extends Card
{
    private String idNumber;
    
    public IDCard(String n, String id)
    {  
       super(n);
       idNumber = id;
    }

    public String format()
    {
        return super.format() + "[ID Number: " + idNumber + "]";
    }
    
    public String toString()
    {
        return "IDCard" + format();
    } 
}
