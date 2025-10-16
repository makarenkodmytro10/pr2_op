// Головний клас для демонстрації роботи системи
public class RestaurantDemo {
    public static void main(String[] args) {
        // Створення учасників
        Visitor visitor = new Visitor("Іван");
        Waiter waiter = new Waiter("Марія", 1);
        Chef chef = new Chef("Петро", "Кухня італійська");
        
        // Створення столу та замовлення
        Table table = new Table(1);
        Order order = new Order(1);
        table.setOrder(order);
        
        // Демонстрація процесу обслуговування
        visitor.scanMenu();
        visitor.makeOrder();
        order.addItem("Піца Маргарита", 1);
        order.addItem("Тірамісу", 1);
        
        waiter.checkAllergens();
        waiter.confirmOrder();
        order.changeStatus("Підтверджене");
        
        chef.markReady();
        order.changeStatus("Готове");
        
        PaymentService payment = new PaymentService();
        payment.processPayment();
        order.changeStatus("Оплачене");
        
        visitor.rateService();
        order.changeStatus("Завершене");
    }
}