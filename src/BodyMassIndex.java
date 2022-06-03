public class BodyMassIndex {


    public double calculate(double weight, double growth) {
        double bmi = weight / (growth * growth);

        return bmi;
    }

}
