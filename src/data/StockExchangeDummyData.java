package data;

import exceptions.InputException;
import models.StockOrder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static models.StockOrder.Type.BUY;
import static models.StockOrder.Type.SELL;
import static utils.StringParseUtil.parseToDate;
import static utils.StringParseUtil.parseToDouble;
import static utils.StringParseUtil.parseToInt;

public class StockExchangeDummyData {

    private static int NUMBER_OF_FIELDS = 6;

    public static List<StockOrder> getDummyData() throws ParseException {
        List<StockOrder> stockOrders = new ArrayList<>();
        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        stockOrders.add(new StockOrder(1, simpleDateFormat.parse("09:45"), "FK", SELL, 100, 240.10));
        stockOrders.add(new StockOrder(2, simpleDateFormat.parse("09:45"), "FK", SELL, 90, 237.45));
        stockOrders.add(new StockOrder(3, simpleDateFormat.parse("09:47"), "FK", BUY, 80, 238.10));
        stockOrders.add(new StockOrder(5, simpleDateFormat.parse("09:48"), "FK", SELL, 220, 241.50));
        stockOrders.add(new StockOrder(6, simpleDateFormat.parse("09:49"), "FK", BUY, 50, 238.50));
        stockOrders.add(new StockOrder(7, simpleDateFormat.parse("09:52"), "AZ", BUY, 10, 100.10));
        stockOrders.add(new StockOrder(8, simpleDateFormat.parse("10:01"), "FK", SELL, 20, 240.10));
        stockOrders.add(new StockOrder(9, simpleDateFormat.parse("10:02"), "FK", BUY, 150, 242.70));
        return stockOrders;
    }

    public static List<StockOrder> getDummyDataFromFile() throws InputException {
        List<StockOrder> stockOrders = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader("data.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                stockOrders.add(getStockOrder(str));
            }
            in.close();
        } catch (IOException e) {
            throw new InputException("Unable to deparse file.");
        }
        return stockOrders;
    }

    private static StockOrder getStockOrder(String data) throws InputException {
        String[] fields = data.split(" ");
        if(fields.length != NUMBER_OF_FIELDS) {
            throw new InputException("Wrong number of fields");
        } else {
            int id = parseToInt(fields[0]);
            Date date;
            try {
                date = parseToDate(fields[1], "HH:mm");
            } catch (ParseException e) {
                throw new InputException("Failed to parse date.");
            }
            String name = fields[2];
            StockOrder.Type type = StockOrder.Type.valueOf(fields[3].toUpperCase());
            int quantity = parseToInt(fields[4]);
            double price = parseToDouble(fields[5]);
            return new StockOrder(id, date, name, type, quantity, price);
        }
    }
}
