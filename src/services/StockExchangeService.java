package services;

import models.StockOrder;

import java.util.HashMap;
import java.util.Map;

public class StockExchangeService {
    private final Map<String, CompanyOrderManagementService> companyOMSMap;

    public StockExchangeService() {
        this.companyOMSMap = new HashMap<>();
    }

    public void addOrder(StockOrder stockOrder) {

    }
}
