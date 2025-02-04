package Tree;

class Node {
    int val;
    Node left;
    Node right;
    
    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    Node root;
    
    void insertNode(int val) {
        if (root == null) {
            root = new Node(val);
            return;
        }
        
        Node newNode = new Node(val);
        Node tempRoot = root;
        
        while (true) {
            if (val < tempRoot.val) {
                if (tempRoot.left == null) {
                    tempRoot.left = newNode;
                    break;
                }
                tempRoot = tempRoot.left;
            } else {
                if (tempRoot.right == null) {
                    tempRoot.right = newNode;
                    break;
                }
                tempRoot = tempRoot.right;
            }
        }
    }
    
    void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.val + " ");
        inorderTraversal(node.right);
    }
    
    void inorder() {
        inorderTraversal(root);
        System.out.println();
    }
    void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
    
    void preorder() {
        preorderTraversal(root);
        System.out.println();
    }
    void postorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.val + " ");
    }
    
    void postorder() {
        postorderTraversal(root);
        System.out.println();
    }
}

public class TraversalBST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertNode(10);
        bst.insertNode(5);
        bst.insertNode(15);
        bst.insertNode(3);
        bst.insertNode(7);
        bst.insertNode(13);
        bst.insertNode(17);
        
        System.out.print("Inorder Traversal: ");
        bst.inorder();
        System.out.print("Preorder Traversal: ");
        bst.preorder();
        System.out.print("Postorder Traversal: ");
        bst.postorder();
    }
}
