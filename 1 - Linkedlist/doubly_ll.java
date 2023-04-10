public class doubly_ll {
    public class Node{
        int data;
        Node prev;
        Node next;
        Node head;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }

        void insertat_Head(int data){
            Node n=new Node(data);
            if(head==null){
                head=n;
                return;
            }
            n.next=head;
            head=n.prev;
            head=n;
        }

        void insertat_Pos(int data, int pos){
            Node temp=head;
            Node n=new Node(data);
            for(int i=0;i<=pos;i++){
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
            n.prev=temp;
        }

        void insertat_Tail(int data){
            Node temp=head;
            Node n=new Node(data);
            while(temp.next!=null){
                temp=temp.next;
            }
            n.prev=temp;
            temp.next=n;
            n.next=null;

        }

        void delete_head(){
            head=head.next;
            head.prev=null;
        }
        void delete_pos(int pos){
            Node temp=head;
            for(int i=0;i<=pos;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
        }
    }
}
