package ss12.BaiTap;

public class PreOrderTraversal {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    static class BinarySearchTree {
        Node root;

        // Hàm khởi tạo
        public BinarySearchTree() {
            this.root = null;
        }

        // Thêm phần tử vào BST
        public void insert(int data) {
            root = insertRec(root, data);
        }

        private Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }

            if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data) {
                root.right = insertRec(root.right, data);
            }

            return root;
        }

        // Postorder Traversal
        public void preorder() {
            System.out.println("Postorder Traversal:");
            preorderRec(root);
            System.out.println();
        }

        private void preorderRec(Node node) {
            if (node == null) {
                return;
            }
            // Duyệt gốc
            System.out.print(node.data + " ");
            // Duyệt trái
            preorderRec(node.left);
            // Duyệt phải
            preorderRec(node.right);

        }
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Thêm các phần tử vào BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Thực hiện duyệt hậu tự (Postorder Traversal)
        bst.preorder();
    }

}
