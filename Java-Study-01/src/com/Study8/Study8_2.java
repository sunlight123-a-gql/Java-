package com.Study8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ClassName Study8_2
 *
 * @Date2025/3/413:49
 * @Create bysunlight
 */
public class Study8_2 {

    public static void main(String[] args) throws ParseException {

        Calendar();
    }


    public static void method() throws ParseException {
        String str = "2000-11-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        System.out.println(date);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String str2 = sdf2.format(date);
        System.out.println(str2);
    }

    public static boolean firstKill(String dateStr) throws ParseException {
        String str = "2023-11-11 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);

        String endStr = "2023-11-11 00:10:00";
        Date endDate = sdf.parse(endStr);

        Date buyTime = sdf.parse(dateStr);
        if (date.getTime() > buyTime.getTime())
        {
            return false;
        }else if (buyTime.getTime() > endDate.getTime())
        {
            return false;
        }else if (endDate.getTime() >= buyTime.getTime())
        {
            return true;
        }
        return true;
    }

    public static void Calendar()
    {
       Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        Instant now = Instant.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Aisa/Shanghai"));
        System.out.println(zonedDateTime);

    }


}

