// Клас відвідувача
public class Visitor extends ServiceParticipant implements Booking {
    public Visitor(String name) {
        super(name);
    }

    public void scanMenu() {
        System.out.println("Відвідувач " + name + " сканує QR-код меню");
    }

    @Override
    public void makeOrder() {
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
        System.out.println("Відвідувач " + name + " здійснює безконтактну оплату");
    }

    public void rateService() {
        System.out.println("Відвідувач " + name + " оцінює сервіс");
    }
}