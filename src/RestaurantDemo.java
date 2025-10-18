import java.util.ArrayList;
import java.util.List;

// Головний клас для демонстрації роботи системи
public class RestaurantDemo {
    public static void main(String[] args) {
        // Створення учасників
        Visitor visitor = new Visitor("Іван");
        Waiter waiter = new Waiter("Марія", 1);
        Chef chef = new Chef("Петро", "Кухня італійська");
        
        // Створення столу та замовлення (демонстрація композиції)
        Table table = new Table(1);
        Order order = table.createOrder(1);
        
        // Демонстрація процесу обслуговування
        visitor.scanMenu();
        visitor.makeOrder();
        order.addItem("Піца Маргарита", 1); // Демонстрація агрегації з OrderItem
        order.addItem("Тірамісу", 1);
        
        waiter.checkAllergens();
        waiter.confirmOrder();
        order.changeStatus("Підтверджене");
        
        chef.markReady();
        order.changeStatus("Готове");
        
        // Демонстрація залежності між Order та PaymentService
        order.processPayment();
        
        visitor.rateService();
        order.changeStatus("Завершене");
        
        // Завершення роботи зі столом
        table.clearOrder();
    }
}