package facadeMode;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class FacadeMain {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
