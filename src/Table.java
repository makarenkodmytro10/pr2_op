// Клас столу
public class Table {
    private final int number;
    private Order currentOrder;

    public Table(int number) {
        this.number = number;
    }

    public void setOrder(Order order) {
        this.currentOrder = order;
        System.out.println("Замовлення призначено столу " + number);
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void clearOrder() {
        this.currentOrder = null;
        System.out.println("Замовлення столу " + number + " закрито");
    }
}