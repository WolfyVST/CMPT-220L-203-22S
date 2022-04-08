public class Main {
    
    public static void main(String[] args){
        Node First = new Node(1);
        Node Second = new Node(2);
        Node Third = new Node(3);
        Node Forth = new Node(4);
        Node Fifth = new Node(5);
        
        First.nNode = Second;
        Second.nNode = Third;
        Third.nNode = Forth;
        Forth.nNode = Fifth;
    

    }
}
