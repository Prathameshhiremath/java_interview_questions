package stack;

public class linkedstack {
    static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        static Node head;
        public static boolean isEmpty(){
            // System.out.println("empty list");
            return head==null;
        }
        public void push(int data){
            Node newnode=new Node(data);
            if(isEmpty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public static int pop(){
          
            if(isEmpty()){
                return -1;//if stack is empty
            }
            int top=head.data; //pop that upper data
            head=head.next;   //and point head to head.next
            return top;
            
        }
        public static int peek(){
            
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}
