public class singly_linkedlist {
    class Node {
        int data;
        Node next;
        Node head;

        Node(int data) {
            this.data = data;
            this.next = null;
        }


        void insertat_Head(int data) {
            Node n = new Node(data);
            if(head==null){
                head=head.next;
                return;
            }
            n.next=head;
            head=n;
        }

        void insertat_pos(int data, int pos){
            int i;
            Node temp=head;
            Node n=new Node(data);
            for(i=0;i<=pos-1;i++){
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;

        }

        void insertat_Last(int data){
            Node n=new Node(data);
            if(head==null){
                head=n;
                return;
            }
            Node temp=null;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
            n.next=null;

        }

        void deletefrom_Head(){
            if(head==null){
                return ;
            }
            head=head.next;
        }

        void deletefrom_pos(int pos){
            Node temp=head;
            for(int i=0;i<=pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }

        void deletefrom_Last(){
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }


    }
}
