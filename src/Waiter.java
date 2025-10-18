// Клас офіціанта
public class Waiter extends ServiceParticipant implements Booking {
    private int id;
    private Order currentOrder; // Зв'язок з замовленням

    public Waiter(String name, int id) {
        super(name);
        this.id = id;
    }

    // Встановлення замовлення для обслуговування
    public void setOrder(Order order) {
        this.currentOrder = order;
        System.out.println("Офіціант " + name + " приймає замовлення для обслуговування");
    }

    @Override
    public void makeOrder() {
        // Не використовується для офіціанта
    }

    @Override
    public void confirmOrder() {
        if (currentOrder != null) {
            System.out.println("Офіціант " + name + " (ID: " + id + ") підтверджує замовлення");
            currentOrder.changeStatus("Підтверджене");
        } else {
            System.out.println("Помилка: немає замовлення для підтвердження");
        }
    }

    @Override
    public void markReady() {
        // Не використовується для офіціанта
    }

    public void checkAllergens() {
        if (currentOrder != null) {
            System.out.println("Офіціант " + name + " перевіряє алергени");
        } else {
            System.out.println("Помилка: немає замовлення для перевірки алергенів");
        }
    }
}