package strategyMode;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class StrategyMain {

    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
