package _12_Java_Collection_Framework.Thuc_hanh.Cai_dat_cay_tim_kiem_nhi_phan;

public class TestBST {
    public static void main(String[] args) {
        // creat a BST
        BST<String> tree = new BST<>();
//        tree.insert("Hieu");
//        tree.insert("Uyen");
//        tree.insert("Khanh");
//        tree.insert("Hung");
//        tree.insert("Thien");
//        tree.insert("Ha");

        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        // traverse tree ( duyet qua)
        System.out.println("Inorder (sorted) : ");
        tree.inorder();
        System.out.println(" The number of nodes is: " + tree.getSize());
    }
}
