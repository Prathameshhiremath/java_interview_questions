package stack;
import java.util.Stack;

public class insertatbottom {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        Stack<Integer>s1=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        while(s.size()>0){
            s1.push(s.pop());
        }

        s.push(10);
        while(s1.size()>0){

            int a=s1.pop();
            System.out.print(a);
            s.push(a);
            
        }
        System.out.println(s);


    }
}
