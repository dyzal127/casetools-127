package armstrong;

import java.util.Scanner;

public class armstrong {
	
	armstrong(int num){
		int n=num,digit=0,rem,arm=0,temp=1;
		while(n!=0) {
			digit++;
			n=n/10;
		}
		n=num;
		while(n!=0) {
			rem=n%10;
			temp=1;
			    for(int i=1;i<=digit;i++) {
			    	temp=temp*rem;
			    }
			arm=arm+temp;
			n=n/10;
		}
		if(arm == num) {
		    System.out.println("Armstrong Number");	
		}
		else {
			System.out.println("Non Armstrong Number");	
		}	
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		armstrong arm = new armstrong(num);
	}
}