public class BmiService {
    public int calculate(double weightKg, double heightM) {
        double bmi = weightKg / (heightM * heightM); // Формула BMI
        return (int) bmi; // Приведение к целому числу
    }
}