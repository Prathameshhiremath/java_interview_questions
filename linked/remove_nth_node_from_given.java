public class remove_nth_node_from_given {
    public static Node removenthnode(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        // slow.data=slow.next.data;
        slow.next=slow.next.next;
        return slow;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(11);
        Node c=new Node(12);
        Node d=new Node(13);
        Node e=new Node(14);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node s=removenthnode(a,2);
        System.out.println(s.data);
        display(a);
        


    }
}
