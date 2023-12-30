import java.util.*;
class linked {
    Node head;
    class Node{
       String data;
       Node next; 
       

       Node(String data){  //create constructor
        this.data=data;
        this.next=null;
       }
    }
    public void addf(String data){
       // Node head=null;
        Node newnode=new Node(data);
        if( head ==null){//if head is null
            head=newnode;
            return;
        }
        newnode.next=head;//new node will point to  head
        head=newnode;//always it if from left to right
    }
    public void addl(String data){
        Node newnode=new Node(data);
       // Node head=null;
        if(head==null){
            head=newnode;
            return;
        }
         Node currnode=head;
         while(currnode.next!=null){
            currnode=currnode.next;//update that current node to next value like currnode is this and next node is a then currnt node will be now (a)
            
        }
        currnode.next=newnode;

        

    }
   public void insert(int pos,String data){
    //example=1--->2--->3--->null
    //inserting at 2 pos then 1st pos ---> to newnode and that node --->2(value) node\
    //https://www.youtube.com/watch?v=D0sFHueV30U (node in middle)
   Node newnode=new Node(data);
   if(pos==1){
    newnode.next=head;//new node jo hoga vo point karega to head and that new node will be asigned to head
    head=newnode;//or add just addf()
    //addf()
   }else{
    Node nodeprev=head;
    int count=1;
    while(count<pos-1){
        nodeprev=nodeprev.next;
        count++;

    }
    Node curr=nodeprev.next;//we know head is now nodeprev then nodeprev.next is curr (which is initialised)
    nodeprev.next=newnode;//that nodeprev.next ----> to newnode which is break link to from 4 and assign to new node
    newnode.next=curr;////then newnode.next which is new node  this that has to assign to 2 so curr which is already assign 

   }


   }
   public void deletef(){
    if(head==null){
        System.out.println("Empty");
    }
    head=head.next;

   }
   public void deletelast(){
    if(head==null){
        System.out.println("empty");
    }
    if(head.next==null){
        head=null;
        return ;
    }
    Node lastnode=head.next;
    Node second=head;
    while(lastnode.next!=null){
        lastnode=lastnode.next;
        second=second.next;
    }
    second.next=null;

   }
    public void print(){
       // Node head=null;
        if(head==null){System.out.println("Empty");}
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
           
        }
        System.out.println("Null");

    }
    public static void main(String[] args) {
        linked l=new linked();
        LinkedList<String> s=new LinkedList<>();
        LinkedList<Integer> s1=new LinkedList<>();
        l.addf("is");
        l.addf("this");
        l.print();
        l.addl("data");
         l.print();
        l.insert(4, "Hi");
        l.print();
        l.deletelast();
        l.print();
        l.deletef();
        l.print();
        l.deletef();
        l.print();
        s.addFirst("a");
        s.addLast("s");
        System.out.println(s.get(1));
        System.out.println(s.get(0));  
        System.out.println(s.size()); 
        String value="a";
        for(int i=0;i<s.size();i++){
            if(s.get(i)==value){
                System.out.println("present");
            }
            System.out.println(s.get(i));
        }  
        // s.removeFirst();
        // System.out.println(s);
        // s.removeLast();
        // System.out.println(s);
        // s.remove(0);//index based   
        s1.add(1);
        s1.add(5);
        s1.add(7);
        s1.add(3);
        s1.add(8);
        s1.add(2);
        s1.add(3);
        System.out.println(s1);
        int v=7;
        for(int i=0;i<s1.size();i++){
            if(s1.get(i)==v){
                System.out.println(s1.indexOf(7));
            }
        }
        
        
        
    }
}
