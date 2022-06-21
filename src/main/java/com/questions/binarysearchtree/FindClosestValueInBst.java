package com.questions.binarysearchtree;

public class FindClosestValueInBst {
    public static int usingWhileLoop(BST tree, int target) { // time: O(logn) ; space: O(1)
        int closest = tree.value;

        while (tree != null) {
            if (Math.abs(closest - target) > Math.abs(tree.value - target))
                closest = tree.value;

            if (target < tree.value)
                tree = tree.left;
            else if (target > tree.value)
                tree = tree.right;
            else
                break;
        }

        return closest;
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
