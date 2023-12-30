
public class reverseinteger {

	public static void main(String[] args) {
		// int a=12345;
		// int rev=0;
		// while(a!=0) {
		// 	rev=rev*10+a%10;//0*10=0+12345%10=5 so 0+5 =5
		// 	a=a/10;//12345/10=1234
		// }
		// System.out.println(rev);
		int a=1234;
		int rev=0; //4321
		while(a!=0){
			rev=rev*10+a%10;
			a=a/10;
		}
		System.out.println(rev);

	}

}
