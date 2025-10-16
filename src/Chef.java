// Клас шеф-кухаря
public class Chef extends ServiceParticipant implements Booking {
    private String specialization;

    public Chef(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    @Override
    public void makeOrder() {
        // Не використовується для шеф-кухаря
    }

    @Override
    public void confirmOrder() {
        // Не використовується для шеф-кухаря
    }

    @Override
    public void markReady() {
        System.out.println("Шеф-кухар " + name + " позначає замовлення як готове");
    }
}