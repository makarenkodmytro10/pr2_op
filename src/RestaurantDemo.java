import java.util.ArrayList;
import java.util.List;

// Головний клас для демонстрації роботи системи
public class RestaurantDemo {
    public static void main(String[] args) {
        // Створення учасників
        Visitor visitor = new Visitor("Іван");
        Waiter waiter = new Waiter("Марія", 1);
        Chef chef = new Chef("Петро", "Кухня італійська");
        
        // Створення столу
        Table table = new Table(1);
        
        // Демонстрація зв'язку Відвідувач --> Замовлення (створює)
        Order order = visitor.createOrder(1);
        table.setOrder(order);
        
        // Демонстрація процесу обслуговування
        visitor.scanMenu();
        visitor.makeOrder();
        order.addItem("Піца Маргарита", 1);
        order.addItem("Тірамісу", 1);
        
        // Демонстрація зв'язку Офіціант --> Замовлення (підтверджує)
        waiter.setOrder(order);
        waiter.checkAllergens();
        waiter.confirmOrder();
        
        chef.markReady();
        order.changeStatus("Готове");
        
        // Оплата через зв'язок відвідувача із замовленням
        visitor.pay();
        
        visitor.rateService();
        order.changeStatus("Завершене");
        
        // Завершення роботи зі столом
        table.clearOrder();
    }
}