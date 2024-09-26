public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(){
        capacity=5;
        arr=new int[capacity];
        top=-1;
    }
    Stack(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        top=-1;
    }
    //observers
    public int getCapacity() { return capacity; }
    public int getTop() { return top; }
    public int[] getElements() { return arr; }
    public boolean isEmpty() { return (top==-1); } //top<=-1
    public boolean isFull() { return (top==(capacity-1)); } //top>=capacity
    public int peek(){return arr[top];}
    public String elements(){
        String hold="";
        for (int i=0; i<=top;i++){
            hold+=arr[i]+" ";
        }
        return hold;
    }
    //transformers
    public void push(int data){
        top++;
        arr[top]=data;
    }
    public int pop(){
        int value=arr[top];
        top--;
        return  value;
    }
}
