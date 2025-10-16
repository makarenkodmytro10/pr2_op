// Клас замовлення
public class Order {
    private int id;
    private String status;
    private final OrderItem[] items;
    private static final int MAX_ITEMS = 10;
    private int itemCount;

    public Order(int id) {
        this.id = id;
        this.status = "Створене";
        this.items = new OrderItem[MAX_ITEMS];
        this.itemCount = 0;
    }

    public void addItem(String dish, int quantity) {
        if (itemCount < MAX_ITEMS) {
            items[itemCount++] = new OrderItem(dish, quantity);
            System.out.println("Додано страву: " + dish + " (кількість: " + quantity + ")");
        } else {
            System.out.println("Перевищено максимальну кількість позицій у замовленні");
        }
    }

    public void changeStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Статус замовлення " + id + " змінено на: " + newStatus);
    }
}