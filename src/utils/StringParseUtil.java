package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringParseUtil {
    public static Date parseToDate(String field, String pattern) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.parse(field);
    }

    public static double parseToDouble(String field) {
        return Double.parseDouble(field);
    }

    public static int parseToInt(String field) {
        return Integer.parseInt(field);
    }
}
