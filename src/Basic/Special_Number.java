package Basic;

public class Special_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 59 = 5+9 + 5*9
		
		int n=145;
		int m=n;
		int sum=0, prod=1;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;prod=prod*d;
			n=n/10;
		}
		if(sum+prod==m) {
		 System.out.println("yes");
		}
		else {
		 System.out.println("no");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
