public class queue_circular {
    int size;
    int arr[];
    int front;
    int rear;

    queue_circular(int size){
        arr=new int[size];
        front=-1;
        rear=-1;
    }

    boolean isEmpty(){
        return front==-1 && rear==-1;
    }

    boolean isFull(){
        return rear==(rear+1)%size;
    }

    void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int res=arr[front];
        if(rear==front){
            rear=front=-1;
        }else{
            front=(front+1)%size;
        }
        return res;
    }
}