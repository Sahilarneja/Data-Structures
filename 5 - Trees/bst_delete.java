public class bst_delete {

        public static class Node{
            int data;
            Node left;
            Node right;

            Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
        public static Node insert(Node root, int data){
            if(root==null){
                root=new Node(data);
                return root;
            }
            if(root.data>data){ //left subtree
                root.left=insert(root.left, data);
            }
            else{
                root.right=insert(root.right,data);
            }
            return root;
        }

        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static boolean search(Node root, int key){
            if(root==null){
                return false;
            }
            else if(root.data>key){
                return search(root.left,key);
            }
            else if (root.data==key) {
                return true;
            }
            else{
                return search(root.right,key);
            }
        }

        public static Node delete(Node root,int val) {
            if (root.data > val) {
                root.left = delete(root.left, val);
            } else if (root.data < val) {
                root.right = delete(root.right, val);
            } else {
                //case1
                if (root.left == null && root.right == null) {
                    return null;
                }
                //case2
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                //case3
                Node IS = inorder_Successor(root.right);
                root.data = IS.data;
                delete(root.right, IS.data);
            }
            return root;
        }

        public static Node inorder_Successor(Node root){
            while(root.left!=null){
                root=root.left;
            }
            return root;
        }

        public static void main(String[] args) {
            int values[]={8,5,3,1,4,6,10,11,14};
            Node root=null;
            for(int i=0;i< values.length;i++){
                root=insert(root,values[i]);
            }

            inorder(root);
            System.out.println();
            delete(root,4);
            inorder(root);
            System.out.println();
            delete(root,10);
            inorder(root);
            System.out.println();
            delete(root,5);
            inorder(root);
        }
    }

