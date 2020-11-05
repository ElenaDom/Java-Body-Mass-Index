public class BmiService {
    public double calculate(double weight) {
        double growth = 171.0*2/100;
        double index = weight/growth;
        return index;

    }
}
