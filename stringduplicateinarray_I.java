import java.util.HashSet;
import java.util.Set;

public class stringduplicateinarray_I {

	public static void main(String[] args) { //O(n*n)
		String s[]= {"Java","C","C","Java","Python"};
		
		for(int i=0;i<s.length;i++) {
			
			for(int j=i+1;j<s.length;j++) {
				if(s[i]==s[j]) {
					System.out.println("Duplicate  "+s[i]);
					
				}	
				
				
				
			}
		}
		//System.out.println(a);
		//using hash set for reducing time complexity
		Set<String> store=new HashSet<String>();//O(n) set is interface and hashset is class
		for(String name:s) {
			if(store.add(name)==false) {
				System.out.println("Duplicate  "+name);
			}
			//particulary it will started to add value in name if particular name is already there then it 
		}
		
		//for numberv and uniques from that  and same for number also
	//String a[]= {"java","java","Hi"};
		
		for(int i=0;i<s.length;i++) {
			int count=0;
			for (int j=0;j<s.length;j++) {
				if(s[i]==s[j]) {
					count++;
				}
				
			}
			if(count==1) {
				System.out.println("Unique elements :"+s[i]);
			}
			
		}
		

	}
	
	

}
