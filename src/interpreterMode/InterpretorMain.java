package interpreterMode;

/**
 * Created by LinYuQiang on 2018/1/24 0024.
 */
public class InterpretorMain {

    public static void main(String[] args) {

        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
