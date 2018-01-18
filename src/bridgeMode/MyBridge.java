package bridgeMode;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class MyBridge extends Bridge {

    public void method(){
        getSource().method();
    }
}
