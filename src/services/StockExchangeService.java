package services;

import models.OrderPromise;
import models.StockOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockExchangeService {
    private final Map<String, CompanyOrderManagementService> companyOMSMap;

    public StockExchangeService() {
        this.companyOMSMap = new HashMap<>();
    }

    public List<OrderPromise> addOrder(StockOrder stockOrder) {
        // TODO: 28/12/19 Add the order to specific company map and get the order promises
        return null;
    }
}
