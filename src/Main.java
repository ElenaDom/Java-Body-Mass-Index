public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 58;
        int growth = 171*2/100;
        int index = service.calculate(weight, growth);
        System.out.println(index);


    }
}
