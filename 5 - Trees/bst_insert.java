public class bst_insert {
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
        if(root.data>data){
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

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i< values.length;i++){
            root=insert(root,values[i]);
        }
        
        inorder(root);
        System.out.println();
        if(search(root,7)){
            System.out.println("Found...");
        }else{
            System.out.println("Not found.....");
        }
    }
}
