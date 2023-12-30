public class findtheoddmiddlenode {
    public static int middle(Node head){
        Node temp=head;
        Node slow=head;
        Node fast=head;
        int size=0;
        while(temp!=null){
            size++;
            return size;
        }
        if(size%2==0){
            while(fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
              int y=slow.data;
         System.out.println(y);
         return y;
            
        }
        else{
            while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
    }
       
        int x=slow.data;
        System.out.println(x);
        return x;
        
        
        
       
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
         Node b=new Node(2);
          Node c=new Node(3);
           Node d=new Node(4);
           Node e=new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        middle(a);
        //System.out.println(x);


    }
}
