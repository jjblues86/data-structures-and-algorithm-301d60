package tree;

public class BinarySearchTree extends Tree {

    public BinarySearchTree(Node node){
        super(node);
    }


    public void add(int value){
        if(root == null){
            root = new Node(value);//setting the root to be the new value
        } else {
            Node current = root;
            while(current != null){
                if(value < current.value){
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

    public boolean contains(int key){
        Node current = root;
        while(current != null){
            if(current.value == key){
                return true;
            } else if(current.value > key){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }
}
