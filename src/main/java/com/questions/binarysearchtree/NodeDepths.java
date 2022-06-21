package com.questions.binarysearchtree;

public class NodeDepths {
    public static int usingRecursion(BST tree) { // time O(n) ; space: O(n)
        int[] sum = new int[1];

        addLevel(tree, 0, sum);

        return sum[0];
    }

    public static void addLevel(BST tree, int level, int[] sum) {
        sum[0] += level;

        if (tree.left != null)
            addLevel(tree.left, level + 1, sum);
        if (tree.right != null)
            addLevel(tree.right, level + 1, sum);
    }

    public class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

}
