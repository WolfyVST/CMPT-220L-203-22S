public class Main {
    public static voif main(string[] args){
        BST a =new Bst();
        Node root = null;

        a.insert(root,8);
    }
}
class  Node {
    int Date
    Noda left;
    Node right;

}
class BST {

    Public Node createNewNode(int k){
        Node a = new Node();
        a.date = k;
        a.left = null;
        a.right = null;
        return a;
    }
    public Node insert (Node node, int val){
        if (node == null) {
            return createNewNode(val);
        }
        return node;
    }
}

