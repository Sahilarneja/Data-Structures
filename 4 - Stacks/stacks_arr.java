public class stacks_arr {
    int size;
    int arr[];
    int top;
    stacks_arr(int size){
        arr=new int[size];
        this.size=size;
        top=-1;
    }

    void push(int data){
        if(size-top>1){
            top++;
            arr[top]=data;
        }
        else{
            System.out.println("Stack overflow");
        }
    }

    int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
       int ans= arr[top];
        top--;
        return ans;
    }
    int peek(){
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }



    public static void main(String[] args) {
        stacks_arr st=new stacks_arr(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        while(!st.isEmpty()){
            System.out.print(st.peek()+" ");
            st.pop();
        }

        while(st.top!=-1){
            int ans=st.peek();
            System.out.print(ans+" ");
            st.pop();
        }
    }
}
