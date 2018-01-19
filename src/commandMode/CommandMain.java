package commandMode;

/**
 * Created by LinYuQiang on 2018/1/19 0019.
 */
public class CommandMain {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
