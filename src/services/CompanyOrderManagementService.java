package services;

import models.OrderPromise;
import models.StockOrder;

import java.util.ArrayList;
import java.util.List;

public class CompanyOrderManagementService {
    private final String name;
    private final List<StockOrder> buyOrders;
    private final List<StockOrder> sellOrders;

    public CompanyOrderManagementService(String name) {
        this.name = name;
        this.buyOrders = new ArrayList<>();
        this.sellOrders = new ArrayList<>();
    }

    public List<OrderPromise> addBuyOrder(StockOrder stockOrder) {
        // TODO: 28/12/19 add the order to specific company list and match it with sell
        return null;
    }

    public List<OrderPromise> addSellOrder(StockOrder stockOrder) {
        return null;
    }

    private boolean validateOrder(StockOrder stockOrder) {
        return ((stockOrder != null) && (name.equals(stockOrder.getName())));
    }
}
