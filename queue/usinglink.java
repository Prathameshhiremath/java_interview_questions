package queue;

public class usinglink {
    static Node head=null;
    static Node tail=null;

    static class Node{
         int data;
        Node next;
        
        Node(int data){
            this.data=data;
           this.next=null;
        }
        
    }
    public  void add(int data){
            Node n=new Node(data);
            if(head==null){
                head=tail=n;//initailise head and tail is in heading to same box and then after tail will move
                head=n;
                return;
            }
            tail.next=n;
            tail=n;

            
            
        }
        public int peek(){
            if(head==null){System.out.println("Empty");}
            return head.data;
        }
        public int remove(){
            if(head==null){
                System.out.println("Empty");
                return -1;
            }
            int x=head.data;
            head=head.next;
            System.out.println("Removed "+x);
            return x;
            
        
        }
    public void print(){
        Node n=head;
        if(head==null){
            System.out.println("Empty");
            return;
        }
        while(n!=null){
            System.out.print(n.data+"--->");
            n=n.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        usinglink u=new usinglink();
        u.add(1);
        u.add(2);
        u.add(3);
        u.add(4);
        u.print();
        u.remove();
        u.print();
        
    }
    
}
