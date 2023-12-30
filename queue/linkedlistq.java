class ll{
    Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static class q{
        Node head=null;
        Node temp=null;
        public void add(int x){
            Node n=new Node(x);
            if(head==null){
                head=temp=n;
            }
            temp.next=n;
            temp=n;
        }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        public int peek(){

            return head.data;
        }
        public int remove(){
            int x=head.data;
            head=head.next;
            return x;
        }
    }

    
    public static void main(String[] args) {
        q a=new q();
        a.add(1);
        a.add(2);
        a.add(3);
       a.display();
       System.out.println(a.peek());
       a.remove();
       a.display();
    }
}