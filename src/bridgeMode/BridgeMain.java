package bridgeMode;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class BridgeMain {

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        SourceSub1 source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        SourceSub2 source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
