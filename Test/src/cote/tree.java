package cote;

public class tree {

	
	public int star2(int num) {
		
		for(int i=0; i<num; i++){
			for(int j=0; j<num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return 0;
	}
	
	public int star3(int num) {
		
		
		for(int i=1; i< num++; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		return 0;
	}
	
	public int star4(int num) {
		for(int i=1; i< num+1; i++) {
			for(int j=num; i<j; j--) {
				System.out.print(" ");
			}
			
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		return 0;
	}
	
	public int star5(int num) {
		
		for(int i=0; i<num; i++) {
			
			for(int j=0;j< num-1-i; j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		return 0;
	}
	
	public int star6(int num) {
			
		for(int i=0; i < num; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<(num-i)*2-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		return 0;
	}
	
	public int star7(int num) {
		
		
		
		
		return 0;
	}
	public static void main(String[] args) {
		
		tree test = new tree();
		
		test.star6(4);
	}
}
