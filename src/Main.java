public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 58;
        float growth = 1.71F;
        float index = service.calculate(weight, growth);
        System.out.println(index);


    }
}
