package stateMode;

/**
 * Created by LinYuQiang on 2018/1/22 0022.
 */
public class StateMain {

    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
