class doublelinkedlist{
    Node head;
    class Node{
        int data;
        Node next;
        int prev;
        Node(int data){
            this.data=data;
        }

    }
    public void addf(int data){
        Node n=new Node(data);
        if(head==null){
           head=n;
        }
        n.next=head;
        head=n;
    }
    public void print(){
        if(head==null){
            return;
        }
        Node c=head;
        while(c.next!=null){
            System.out.print(c+"-->");
            c=c.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
    doublelinkedlist d=new doublelinkedlist();
    d.addf(2);
    d.addf(3);
    d.addf(5); 
    d.print();   
    }
}