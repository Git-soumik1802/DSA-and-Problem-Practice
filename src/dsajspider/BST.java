package dsajspider;

class Node1 {
    int key;
    Node1 left;
    Node1 right;

    Node1(int ele) {
        this.key = ele;
    }

    Node1(int ele, Node1 left, Node1 right) {
        this.key = ele;
        this.left = left;
        this.right = right;
    }
}

public class BST {

    Node1 root;
    int count = 0;
    boolean flag;

    public boolean add(int key) {
        flag = false;
        root = add(key, root);
        return flag;
    }

    private Node1 add(int key, Node1 root) {

        if (root == null) {
            count++;
            flag = true;
            return new Node1(key);
        }

        if (key < root.key) {
            root.left = add(key, root.left);
        } else if (key > root.key) {
            root.right = add(key, root.right);
        }

        return root;
    }

    public void inorder(Node1 root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public void preorder(Node1 root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorder(Node1 root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }
    public boolean contains(int key) {
		Node1 curr=root;
		while(curr!=null) {
			if(key==curr.key) {
				return true;
			}
			else if(key<curr.key) {
				curr=curr.left;
			}
			else {
				curr=curr.right;
			}
		}
		return false;
	}

    public static void main(String[] args) {

        BST tree = new BST();

        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);
System.out.println(tree.contains(7));
        System.out.println("\nSize: " + tree.count);
        System.out.println(tree.contains(7));
    }
}