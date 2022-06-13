package assignment;

public class Loop16a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		boolean m=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				m=false;
			}
		}
		if(m==true) {
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is not a prime ");
		}

	}

}
