public class Main {
    public static void main(String[] args) {
        BmiService servic = new BmiService();

        int weightkg = 98;
        double heightsm = 187;
        int bmi = servic.calculate(weightkg, heightsm);


        System.out.println(bmi);
    }
}