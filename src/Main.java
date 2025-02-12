public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService(); // Создаем объект сервиса

        double weight = 98;  // Вес в килограммах
        double height = 1.87; // Рост в метрах

        int bmi = service.calculate(weight, height); // Вызываем метод calculate
        System.out.println("Индекс массы тела: " + bmi); // Вывод результата
    }
}