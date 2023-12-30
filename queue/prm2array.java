package queue;
//import java.util.*;


public class prm2array {
    public static class array{
        static int f=-1;
        static int r=-1;
        static int [] arr=new int [5];
        static int size=0;
        public static void add( int data){
            if(r==arr.length-1){
                System.out.println("Full");
                return;
            }
            if(f==-1){
                f=r=0;
                arr[0]=data;
            }
            else{
                arr[r+1]=data;
                r++;
            }
            size++;
        }
        public static int pop(){
            if(size==0){
                System.out.println("Empty");
                 return -1;
            }
             f++;
             size--;
             return arr[f-1];//display that print value of removed element
        }
        public static int peek(){
            if(size==0){
                System.out.println("Empty");
                return -1;
            }

            return arr[f];  
        }
        public static void display(){
            if(size==0){
                System.out.println("Empty");
                
            }
            for(int i=f;i<=r;i++){
                System.out.println(arr[i]);
            }

        }
    }
    public static void main(String[] args) {
        //array a =new array();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        // array.display();
        // array.pop();
        // array.pop();
        // array.display();
        System.out.println(array.peek());
        System.out.println(array.peek());
        

    }
}
