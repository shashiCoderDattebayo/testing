import models.StockOrder;
import services.StockExchangeService;

import java.text.ParseException;

import static data.StockExchangeDummyData.getDummyData;

public class Main {

    public static void main(String[] args) {
        StockExchangeService stockExchangeService = new StockExchangeService();
        try {
            for (StockOrder stockOrder : getDummyData()) {
                stockExchangeService.addOrder(stockOrder);
            }
        } catch (ParseException e) {
            System.out.println("Unable to parse input");
        }
    }
}
