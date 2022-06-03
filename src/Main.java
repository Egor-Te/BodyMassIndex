public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();

        double weight = 86.7;
        double growth = 1.88;
        double bmi = service.calculate(weight, growth);

        System.out.println("Рост в метрах" + growth);
        System.out.println("Вес в киллограмах" + weight);
        System.out.println("Индекс Массы Тела" + bmi);

    }
}