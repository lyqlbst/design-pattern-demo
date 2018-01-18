package compositeMode;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class CompositeMain {

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
    }
}
