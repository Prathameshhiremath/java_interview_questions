import java.util.Arrays;

class d{
    public static void main(String[] args) {
       String s="ABC";
       String s1="BCAA";
       char c1[]=s.toCharArray();   
       char c2[]=s1.toCharArray();
       Arrays.sort(c1);
       Arrays.sort(c2);

       if(c1.length!=c2.length){
        System.out.println("Not anagram");
       }else{
        if(Arrays.equals(c1, c2)){
            System.out.println("anagram");
        }
        else{System.out.println("Not anagram");}
       }
    }
}