import java.util.LinkedList;
import java.util.Queue;

public class Traversal_Practice {
        static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }


  static class binary_build{
            static int index=-1;
            public static Node build(int[] nodes){
                index++;
                if(nodes[index]==-1){
                    return null;
                }
                Node newNode=new Node(nodes[index]);
                newNode.left=build(nodes);
                newNode.right=build(nodes);
                return newNode;
            }

  }

  public static void preorder(Node root){
            if(root==null){
                return ;
            }
      System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
  }
  public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
      System.out.print(root.data+" ");
      inorder(root.right);
  }

  public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
      System.out.print(root.data+" ");
  }

    public static void level_Order(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode =q.remove();
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
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary_build bt=new binary_build();
        Node root=bt.build(nodes);
        System.out.println("Preorder: ");
        preorder(root);
        System.out.println();
        System.out.println("inorder: ");
        inorder(root);
        System.out.println();
        System.out.println("Postorder: ");
        postorder(root);
        System.out.println();
        System.out.println("Level order: ");
        level_Order(root);

    }
}
