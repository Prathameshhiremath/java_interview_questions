public class removeadjacentduplicatenode {

    public static void duplicate(Node head){
            Node temp=head;
            while(temp!=null && temp.next!=null){
                if(temp.next.data==temp.data){
                    temp.next=temp.next.next;
                    
                    
                }
                System.out.println(temp.data);
                temp=temp.next;
                
                
            }
    }
    public static class Node{
        Node next;
        int data;
        Node(int  data){
            this.data=data;

        }



    }
    public static void main(String[] args) {
        Node a=new Node(1);
         Node b=new Node(1);
          Node c=new Node(2);
           Node d=new Node(2);
           Node e=new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        duplicate(a);
    }
}
