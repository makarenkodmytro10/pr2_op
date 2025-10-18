// Клас відвідувача
public class Visitor extends ServiceParticipant implements Booking {
    private Order currentOrder; // Зв'язок з замовленням

    public Visitor(String name) {
        super(name);
    }

    public void scanMenu() {
        System.out.println("Відвідувач " + name + " сканує QR-код меню");
    }

    // Створення замовлення (реалізація зв'язку створення)
    public Order createOrder(int orderId) {
        currentOrder = new Order(orderId);
        System.out.println("Відвідувач " + name + " створює нове замовлення");
        return currentOrder;
    }

    @Override
    public void makeOrder() {
        if (currentOrder == null) {
            System.out.println("Помилка: замовлення не створено");
            return;
        }
        System.out.println("Відвідувач " + name + " робить замовлення");
    }

    @Override
    public void confirmOrder() {
        // Не використовується для відвідувача
    }

    @Override
    public void markReady() {
        // Не використовується для відвідувача
    }

    public void pay() {
        if (currentOrder != null) {
            currentOrder.processPayment();
            System.out.println("Відвідувач " + name + " здійснює безконтактну оплату");
        }
    }

    public void rateService() {
        System.out.println("Відвідувач " + name + " оцінює сервіс");
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }
}