package com.questions.binarysearchtree;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
    public static List<Integer> usingRecursion(BST tree) { // time: O(n) ; space: O(n)
        ArrayList<Integer> output = new ArrayList<>();

        branchSum(tree, 0, output);

        return output;
    }

    public static void branchSum(BST tree, int sum, List<Integer> output) {
        sum += tree.value;

        if (tree.left != null && tree.right != null)
            output.add(sum);

        if (tree.left != null)
            branchSum(tree.left, sum, output);
        if (tree.right != null)
            branchSum(tree.right, sum, output);
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
