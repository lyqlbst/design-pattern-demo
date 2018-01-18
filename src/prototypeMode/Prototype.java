package prototypeMode;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class Prototype implements Cloneable {

    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
}
