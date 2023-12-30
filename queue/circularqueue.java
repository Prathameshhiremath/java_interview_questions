package queue;

public class circularqueue {
    public static class cqueue{
        int f=-1;
        int r=-1;
        static int size=0;
        int [] arr=new int[8];

        public void add(int data) throws Exception{
            if(size==arr.length){
               throw new Exception("Full");
            }
            else if(size==0){
                f=r=0;
                arr[0]=data;
                
            } 
            else if(r<arr.length-1){
                arr[r+1]=data; //add the data till n-1
                r++;
              
            }
            else if(r==arr.length-1){ //if r is full then from begin is empty then add from begining
                r=0;
                arr[0]=data;
            }
            size++;

        }
        public int remove(){
             if(size==0){
                System.out.println("empty");
                return -1;
                  
             }
             else{
                int val=arr[f];//intialise
                if(f==arr.length-1) f=0;//check if f is in last pos or not  if f=0 then afain initailsie f from start as from 0 index
                else f++; //or increment f++
                size--;//decrese size
                return val;
             }
             
            
        }
        public int  peek(){
            if(size==0){
                System.out.println("Empty");
                return -1;
            }
            else return arr[f];



        } 
        public void display(){
            if(size==0){
                System.out.println("empty");
                

            }
            else if(f<=r){
                for(int i=f;i<=r;i++){
                    System.out.println(arr[i]);
                }

            }
            else {
                for(int i=f;i<arr.length;i++){ //this is for from f to arr.length -1 

                    System.out.println(arr[i]);
                }
                for(int i=0;i<=r;i++){ //this is for from 0 to r; which it came from last to first that ojne
                    System.out.println(arr[i]);
                }
                 
            }

        }



    }
    public static void main(String[] args) throws Exception {
        cqueue c=new cqueue();
        c.display();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(6);
        c.add(7);
        c.add(8);
       // c.add(9);
       c.display();
       
       c.remove();
       c.display();
       c.remove();
       c.display();
       c.add(9);
       c.display();
        
    }
}
