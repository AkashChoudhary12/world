package Basic;

public class Spy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=123;
		int m=n;              
		int a=0, b=1;
		//intialization
		while(n!=0) {
			int d=n%10;
			a=a+d; b=b*d;
			n=n/10;
		}
		if(a==b) {
		 System.out.println("yes");
		}
		else {
		 System.out.println("no");
		}
		
			
	}

}
