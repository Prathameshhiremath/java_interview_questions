
public class stringmanipulations_I {

	public static void main(String[] args) {
		String s="        My Name is Prathamesh and i am in Rv college of Enginnering college    ";
		String s1="My Name is prathamesh and i am in Rv college of Enginnering college";

		System.out.println(s.length());
		
		System.out.println(s.charAt(4));
		

		System.out.println(s.indexOf("e"));
		
		System.out.println(s.indexOf("e",7));// another for e hardcore value
		
		System.out.println(s.indexOf("e",s.indexOf("e")+1)); //remove hardcore value
		
		System.out.println("----"+s.indexOf("Prathamesh")); 
		
		
		
		System.out.println(s.indexOf("Hiremath"));  //return -1 if it is not pro=esent
		
		System.out.println(s.equals(s1));//return boolean
		
		System.out.println(s.equalsIgnoreCase(s1));//ignore case
		
		System.out.println(s.substring(0,10)); //return substring
		
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ", "")); //ex hello world o/p helloworld
		
		System.out.println(s.replace("My", "my"));
		
		String s2="Hello_World";
		String s3[]=s2.split("_");
		
		for(int i=0;i<s3.length;i++) {
			System.out.println(s3[i]);
		}
		//return hello 
		//       worldm
		
		System.out.println(s2.concat(" HI"));  //concanet with s2
		
		//concatination	
		System.out.println("Hello"+"World"+100+200);//HelloWorld100200
		System.out.println(100+200+"Hello"+"world");//300HelloWorld
		System.out.println("Hello"+"World"+(100+200));//Helloworld300
		
	}

}
