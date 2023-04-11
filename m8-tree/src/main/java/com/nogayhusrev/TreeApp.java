package com.cydeo;

public class TreeApp {
    public static void main(String[] args) {
       MyTree tree = new MyTree();
       int[] array = {3,1,7,4,9,3,0,232,2,4,34};

        for (int i = 0; i < array.length; i++) {
            tree.insert(array[i]);
        }


        VisualizeTree.printTree(tree.root,null,false);
        tree.preOrderTraversal(tree.root);
        System.out.println();
        tree.inOrderTraversal(tree.root);
        System.out.println();
        tree.postOrderTraversal(tree.root);
        System.out.println();
        tree.levelOrderTraversal();


        System.out.println();
        System.out.println(tree.contains(10));

        System.out.println();
        tree.printLeaves(tree.root);

        System.out.println();
        System.out.println("Number of leaves: " + tree.countLeaves(tree.root));

        System.out.println();
        System.out.println("Sum of leaves: " + tree.sumOfLeaves(tree.root));


        System.out.println("Height of the Tree: " + tree.height(tree.root) );

        System.out.println("Number of Nodes: " + tree.countNodes(tree.root));

        System.out.println("Sum of Nodes Depths: " + tree.sumOfNodesDepths(tree.root,0));

        System.out.println("Sum of Nodes Values: " + tree.sumOfNodesValues(tree.root,0));






    }
}