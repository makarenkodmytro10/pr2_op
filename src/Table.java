// Клас столу
public class Table {
    private final int number;
    private Order currentOrder;

    public Table(int number) {
        this.number = number;
    }

    // Створення нового замовлення (композиція)
    public Order createOrder(int orderId) {
        this.currentOrder = new Order(orderId);
        System.out.println("Створено нове замовлення для столу " + number);
        return this.currentOrder;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void clearOrder() {
        this.currentOrder = null;
        System.out.println("Замовлення столу " + number + " закрито");
    }
}