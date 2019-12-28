import models.OrderPromise;
import models.StockOrder;
import services.StockExchangeService;

import java.text.ParseException;
import java.util.List;

import static data.StockExchangeDummyData.getDummyData;

public class Main {

    public static void main(String[] args) {
        StockExchangeService stockExchangeService = new StockExchangeService();
        try {
            for (StockOrder stockOrder : getDummyData()) {
                List<OrderPromise> orderPromises = stockExchangeService.addOrder(stockOrder);
                message(orderPromises);
            }
        } catch (ParseException e) {
            System.out.println("Unable to parse input");
        }
    }

    private static void message(List<OrderPromise> orderPromises) {
        for (OrderPromise orderPromise : orderPromises) {
            System.out.println(orderPromise.toString());
        }
    }
}
