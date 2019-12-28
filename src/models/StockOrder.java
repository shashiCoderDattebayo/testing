package models;


import java.util.Date;

public class StockOrder {

    public StockOrder(int id, Date date, String name, Type type, int quantity, double price) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    public enum Type {
        BUY, SELL;

    }
    private final int id;

    private final Date date;
    private final String name;
    private final Type type;
    private final int quantity;
    private final double price;



    public Date getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
