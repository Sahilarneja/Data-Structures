public class st_linkedlist {
    class Node {
        int data;


        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

        boolean isEmpty(){
            return head==null;
        }
        void push(int data){
            Node n=new Node(data);
            if(isEmpty()){
                head=n;
                return;
            }
            n.next=head;
            head=n;

        }

        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
            }
            int res=head.data;
            head=head.next;
            return res;
        }

        int peek(){
            return head.data;
        }


    public static void main(String[] args) {
        st_linkedlist st=new st_linkedlist();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        while(!st.isEmpty()){
            System.out.print(st.peek()+" ");
            st.pop();
        }
    }

}
