package data;

import models.StockOrder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static models.StockOrder.Type.BUY;
import static models.StockOrder.Type.SELL;

public class StockExchangeDummyData {

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
}
