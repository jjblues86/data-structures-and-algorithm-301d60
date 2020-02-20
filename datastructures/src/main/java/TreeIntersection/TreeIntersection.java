package TreeIntersection;

import tree.Node;
import tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TreeIntersection {

    public static Set tree_intersection(Tree treeOne, Tree treeTwo){

        HashSet treeIntersection = new HashSet();
        HashSet firstTree = (HashSet) traverseTrees(treeOne);
        HashSet secondTree = (HashSet) traverseTrees(treeTwo);
        for(Object obj : firstTree){
            if(firstTree.contains(obj)){
                treeIntersection.add(obj);
            }
        }
        return treeIntersection;
    }

    public static Set traverseTrees(Tree trees){
        HashSet t = new HashSet();
        for(Object object : trees.traversePreOrder(trees.root)){
            t.add(object);
        }

        return t;
    }
}
