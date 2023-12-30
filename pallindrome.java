
public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=111;
		int r=0;
		//int sum=0;
		int t;
		t=num;
		while(num>0) {
			// r=num%10+num;
			// sum=(sum*10)+r;
			// num=num/10;
			r=r*10+num%10;     //aother methid
			num=num/10;
			
		}
		if(r==t) {
			System.out.println("Pallin");
		}
		else {
			System.out.println("no");
		}
		
	}
}
