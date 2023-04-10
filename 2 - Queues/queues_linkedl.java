public class queues_linkedl{
    class Node {
        int data;
        Node head;
        Node tail;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            head = null;
            tail = null;
        }

        boolean isEmpty() {
            return head == null && tail == null;
        }


        void enqueue(int data) {
            Node n=new Node(data);
            if(tail==null){
                tail=head=n;
            }
            tail.next=n;
            tail=n;
        }

        int dequeue(int data){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=head.data;
            head=head.next;
            return front;
        }

        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            return head.data;
        }
    }
}