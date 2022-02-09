package _12_Java_Collection_Framework.Thuc_hanh.Cai_dat_cay_tim_kiem_nhi_phan;

import java.util.Comparator;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {

    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    /* Cài đặt phương thức chèn trong BST */
    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e); /* create a new root */
        } else {
            /* locate the parent node */
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false; /* Duplicate node not inserted */
                }
                if (e.compareTo(parent.element) < 0) {
                    parent.left = createNewNode(e);
                } else {
                    parent.right = createNewNode(e);
                }
            }
        }
        size++;
        return true; /* element inserted successfully */
    }

    private TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return 0;
    }

    /* Phương thức duyệt cây theo thứ tự inorder */

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
