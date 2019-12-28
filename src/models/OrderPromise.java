package models;

public class OrderPromise {
    private final int buyId;
    private final int sellId;
    private final int quantity;
    private final double price;

    public OrderPromise(int buyId, int sellId, int quantity, double price) {
        this.buyId = buyId;
        this.sellId = sellId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getBuyId() {
        return buyId;
    }

    public int getSellId() {
        return sellId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "OrderPromise{" +
                "buyId=" + buyId +
                ", sellId=" + sellId +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
