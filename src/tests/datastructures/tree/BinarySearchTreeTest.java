package tests.datastructures.tree;

import com.datastructures.tree.BinarySearchTree;

public class BinarySearchTreeTest {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(45);
        bst.insert(72);
        bst.insert(79);
        bst.rInsert(23);
        bst.rInsert(16);
        bst.rInsert(21);

        System.out.println(bst.contains(12));
        System.out.println(bst.rContains(23));

        bst.remove(6);

        System.out.println(bst.bfs());
        System.out.println(bst.preorder());
        System.out.println(bst.postorder());
        System.out.println(bst.inorder());
    }

}
