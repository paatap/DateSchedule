/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datescheduke;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author paata
 */
public class DateSchedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] schedule =new String[12];

        java.util.Date now = new Date();
        Calendar myCal = Calendar.getInstance();
        myCal.setTime(now);
  //      myCal.add(Calendar.MONTH, +1);
        now = myCal.getTime();
        
        
       
             System.out.println("now="+now);  
            for (int i = 0; i < 6; i++) {
                 myCal.add(Calendar.MONTH, +i);
                 now = myCal.getTime();
                  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      //          System.out.println(formatter.format(now));
               schedule [i]=formatter.format(now);
             System.out.println(schedule [i]);
                
               
           System.out.println("shedule["+i+"]="+ schedule [i]);
  System.out.println(i);
}

    }

}
