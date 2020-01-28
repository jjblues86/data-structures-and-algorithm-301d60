package tree;

public class FizzBuzzTree {

    public static Tree<Object> fizzBuzzTree(Tree<Object> fizz){
        fizzBuzz(fizz.root);
        return fizz;

    }

    private static void fizzBuzz(Node<Object> node){
        if(node != null){
            if((int)node.value % 15 == 0){
                node.value = "FizzBuzz";
            } else if((int)node.value % 5 == 0){
                node.value = "Buzz";
            } else if((int)node.value % 3 == 0){
                node.value = "Fizz";
            }
            fizzBuzz(node.left);
            fizzBuzz(node.right);
        }
    }
}
