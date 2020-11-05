public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 58;
        double growth = 171.0*2/100;
        double index = service.calculate(weight, growth);
        System.out.println(index);


    }
}
