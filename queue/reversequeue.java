package queue;
import java.util.*;


public class reversequeue {
    public static void main(String[] args) {
        Queue<Integer>s=new LinkedList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s);
        Stack<Integer>s1=new Stack<>();
        while(s.size()>0){
            s1.push(s.remove());

        }
        while(s1.size()>0){
            s.add(s1.pop());
        }
        System.out.println(s);

    }
}
