import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
            this.left= left;
            this.right=right;


        }
    }

    static class Binary_Tree{
        static int index=-1;
        public Node build(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode=new Node(nodes[index]);
            newNode.left=build(nodes);
            newNode.right=build(nodes);
            return newNode;
        }

        public static void preorder(Node root){
           /* preorder---
           root
            left subtree
            right subtree
            */
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }
        public static void inorder(Node root){
                    /*inorder---
                    left subtree
                    root
                    right subtree*/
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            /*
              postorder---
              left subtree
              right subtree
              root
            */
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public static void level_order(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            Binary_Tree b= new Binary_Tree();
            Node root = b.build(nodes);
//            System.out.println(root.data);
            System.out.println("preorder:");
            preorder(root);
            System.out.println();
            System.out.println("inorder: ");
            inorder(root);
            System.out.println();
            System.out.println("postorder: ");
            postorder(root);
            System.out.println();
            System.out.println("Level Order: ");
            level_order(root);
        }
    }
}
