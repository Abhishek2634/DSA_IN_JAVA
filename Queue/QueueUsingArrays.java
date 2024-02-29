package Queue;

public class QueueUsingArrays {
    //due to fixed size of array we do not use it to make a queue using arrays.
    public static class Queue{
       static int arr[];
       static int size;
       static int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        //check for emptiness
        public  Boolean isEmpty(){
            return rear == -1;
        }

        //adding elements;
        public void add(int data){
            if(rear == size - 1){
                System.out.println("queue is full and nothing to add");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;

        }
        public int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0] ;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
