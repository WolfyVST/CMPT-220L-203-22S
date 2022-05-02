public class Main {
    public static Void main(string[] args){
        BST a =new Bst();
        Node root = null;

        root = a.insert(root,8);
        root = a.insert(root,3);

    }
}
class  Node {
    int Date
    Noda left;
    Node right;

}
class BST {

    public Node createNewNode(int k){
        Node a = new Node();
        a.date = k;
        a.left = null;
        a.right = null;
        return a;
    }
    public Node insert(Node node, int val){
        if (node == null) {
            return createNewNode(val);
        }
        return node;
    }
}

