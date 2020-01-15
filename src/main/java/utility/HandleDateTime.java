package utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HandleDateTime {

    public static String getDepartureDate(int incrementDay){
        Date today = new Date();
        SimpleDateFormat formattedDate = new SimpleDateFormat("MM/dd/yyyy");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, incrementDay);  // number of days to add
        //String tomorrow = (formattedDate.format(c.getTime()));
        //System.out.println("Tomorrows date is " + tomorrow);
        return formattedDate.format(c.getTime());
    }
}
