package stack;
import java.util.*;
public class stacknormalq {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> gt=new Stack<>();
        Stack<Integer> rt=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
         System.out.println(st);
        // while(s.size()>0){
        //     s1.push(s.pop());
        // }
        // while(s1.size()>0){
        //     s2.push(s1.pop());
        // }
        // while(s2.size()>0){
        //     s1.push(s2.pop());
        // }

        // System.out.println(s);
        // System.out.println(s1);
            while(st.size()>0){
                gt.push(st.pop());
            }
            System.out.println(gt);
            while(gt.size()>0){
                rt.push(gt.pop());
            }
            System.out.println(rt);
        

    }
}
