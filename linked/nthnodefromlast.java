public class nthnodefromlast {

    public static Node nthNode(Node head,int n){
        // int size=0;
        // Node temp=head;
        // while(temp!=null){
        //     size++;
        //     temp=temp.next;

        // }
        //  int q=size-n+1; //a=m-n+1 from start
        
        // System.out.println(q);
        // temp=head;
        // //for (i=0;i<q;i++)  for from start if u want
        // for(int i=0; i<q-1;i++){
        //     temp=temp.next;
        // }
        // return temp;

        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;

        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.data=slow.next.data;
        slow.next=slow.next.next;
        
        return slow;

    }
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(18);
        Node c=new Node(15);
        Node d=new Node(13);
        Node e=new Node(11);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
       
     //   0  1  2  3 4   m=5 n=3 so m-n+1 from start=it will give answer of from end that is 3 --->15
        //1 18 15 13 11
      //  5  4  3 2  1
        Node q=nthNode(a, 2);
        System.out.println(q.data);
        // System.out.println(1<1);
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);


    }
}
