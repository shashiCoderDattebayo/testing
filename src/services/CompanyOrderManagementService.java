package services;

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

    public void addBuyOrder(StockOrder stockOrder) {
        return;
    }

    public void addSellOrder(StockOrder stockOrder) {
        return;
    }

    private boolean validateOrder(StockOrder stockOrder) {
        return ((stockOrder != null) && (name.equals(stockOrder.getName())));
    }
}
