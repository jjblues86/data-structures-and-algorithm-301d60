package tree;

public class BinarySearchTree extends Tree {

    public BinarySearchTree(Node node){
        super(node);
    }


    public void add(int value){
        if(root == null){
            root = new Node<>(value);//setting the root to be the new value
        } else {
            Node current = root;
            while(current != null){
                if(value < (int)current.value){
                    //Left
                    if(current.left == null){
                        current.left = new Node(value);
                        return;
                    } else {
                        current = current.left;
                    }
                } else {
                    //Right
                    if(current.right == null){
                        current.right = new Node(value);
                        return;
                    } else {
                        current = current.right;
                    }
                }
            }
        }
    }

    public boolean contains(Node root, int key){
        Node current = this.root;
        while(current != null){
            if((int)current.value == key){
                return true;
            } else if((int)current.value > key){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }
}
