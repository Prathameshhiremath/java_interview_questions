package queue;
import java.util.*;


public class Iprogram {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        //to make reverse
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(q.size()!=0){//jab tak size 0 se bada hai 
            s.add(q.remove());  //or we do push also
        }
        System.out.println(s);
        while(s.size()!=0){
            q.add(s.pop());
        }
        System.out.println(q);

    }
}
