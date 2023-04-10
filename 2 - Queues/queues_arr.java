public class queues_arr{
    int arr[];
    int size;
    int rear;
    int front;

    queues_arr(int size){
        arr=new int[size];
        this.front=0;
        this.rear=0;
    }

    void enqueue(int data){
        if(rear==size-1){
            System.out.println("queue is full");
        }
        arr[rear]=data;
        rear++;
    }
    int dequeue(){
        if(front==rear){
            System.out.println("Queue is full");
            return -1;
        }
        int ans=arr[front];
        front++;
        if(front==rear){
            front=0;
            rear=0;
        }
        return ans;
    }

    int peek(){
        return arr[front];
    }

    Boolean isEmpty(){
        if(front==rear){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        queues_arr qa=new queues_arr(5);
        qa.enqueue(10);
        qa.enqueue(20);
        qa.enqueue(30);
        qa.enqueue(40);
        while(!qa.isEmpty()){
            System.out.print(qa.peek()+" ");
            qa.dequeue();
        }

    }
}
