// Клас офіціанта
public class Waiter extends ServiceParticipant implements Booking {
    private int id;

    public Waiter(String name, int id) {
        super(name);
        this.id = id;
    }

    @Override
    public void makeOrder() {
        // Не використовується для офіціанта
    }

    @Override
    public void confirmOrder() {
        System.out.println("Офіціант " + name + " (ID: " + id + ") підтверджує замовлення");
    }

    @Override
    public void markReady() {
        // Не використовується для офіціанта
    }

    public void checkAllergens() {
        System.out.println("Офіціант " + name + " перевіряє алергени");
    }
}