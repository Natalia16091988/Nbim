public class BmiService {
    public int calculate(int weightkg, double heightsm) {
        return (int) (weightkg / heightsm / heightsm * 10000);
    }
}


