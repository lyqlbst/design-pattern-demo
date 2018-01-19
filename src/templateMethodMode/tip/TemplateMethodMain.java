package templateMethodMode.tip;

/**
 * Created by LinYuQiang on 2018/1/19 0019.
 */
public class TemplateMethodMain {

    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
