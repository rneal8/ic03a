package ic03a;

import java.util.GregorianCalendar;
import java.util.Calendar;


public class DriverLicense extends Card
{
    private String expYear;
    
    public DriverLicense(String n, String year)
    {  
       super(n);
       expYear = year;
    }
    
    public boolean isExpired()
    {
       boolean result = false;
       GregorianCalendar calendar = new GregorianCalendar();
       
       if(Integer.parseInt(expYear) < calendar.get(Calendar.YEAR))
       {
           result = true;
       }
       
       return result;
    }
    
    public String format()
    {
        return super.format() + "[Expiration Year: " + expYear + "]";
    }
    
    public String toString()
    {
        return "DriverLicense" + format();
    }
}
