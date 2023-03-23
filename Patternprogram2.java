package patternprogram;

public class Patternprogram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Patternprogram2 obj1=new Patternprogram2();
obj1.print_no();
obj1.print_no1();
obj1.print_no2();
obj1.print_no3();
obj1.print_no4();
obj1.print_no5();
obj1.print_no6();
obj1.print_no7();
obj1.print_no8();
obj1.print_no9();
obj1.print_no10();
obj1.print_no11();
obj1.print_no12();
obj1.print_no13();
	}
		private void print_no13() {
		// TODO Auto-generated method stub
		for(int j=1;j<=5;j++) {
			for(int i=1;i<j;i++) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<=6-j;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

	private void print_no12() {
		// TODO Auto-generated method stub
		for(int j=1;j<=5;j++) {
			for(int i=5;i>j;i--) {
				System.out.print(" ");
			}
			for(int k=6-j;k<=5;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int j=1;j<=5;j++) {
			for(int i=1;i<j;i++) {
				System.out.print(" ");
			}
			for(int k=6-j;k>=1;k--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		}

	private void print_no11() {
		// TODO Auto-generated method stub
		for(int j=1;j<=5;j++) {
			for(int i=5;i>j;i--) {
				System.out.print("*"+" ");
			}
			System.out.print(1+" ");
			System.out.println();
		}
	}

	private void print_no10() {
		// TODO Auto-generated method stub
		for(int j=1;j<=5;j++) {
			for(int i=5;i>j;i--) {
				System.out.print("*"+" ");
			}
			for(int k=6-j;k<=5;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	private void print_no9() {
		// TODO Auto-generated method stub
		int k=5;
		for(int i=5;i>=1;i--) {
		for(int j=i;j>=k;j--) {
			System.out.print( j + " ");
		}
		k-=2;
		System.out.println();
		}
//		for(int i=4;i>=3;i--) {
//			System.out.print(i);
//		}
	}


	private void print_no8() {
		// TODO Auto-generated method stub
		for(int j=1;j<=5;j++) {
		for(int i=5;i>j;i--) {
			System.out.print(" "+" ");
		}
		for(int k=5;k>=6-j;k--) {
			System.out.print(k+" ");
		}
		System.out.println();
		}
	}

	private void print_no7() {
		// TODO Auto-generated method stub
		for(int j=5;j>=1;j--) {
		for(int i=1;i<j;i++) {
			System.out.print(" "+" ");
		}
		for(int k=1;k<=6-j;k++) {
			System.out.print(k+" ");
		}
		System.out.println();
	}
	}

	private void print_no6() {
		// TODO Auto-generated method stub
		int no=15;
		for(int j=5;j>=1;j--) {
		for(int i=1;i<=j;i++) {
			System.out.print(no+" ");
			no--;
		}
		System.out.println();
		}
	}

	private void print_no5() {
		// TODO Auto-generated method stub
		int no=1;
		for(int j=5;j>=1;j--) {
		for(int i=1;i<=j;i++){
			System.out.print(no+" ");
			no++;
			}
		System.out.println();
		}
				}

	private void print_no4() {
		// TODO Auto-generated method stub
		int no=5;
		for(int j=5;j>=1;j--) {
		for(int i=1;i<=j;i++) {
			System.out.print(i*no+" ");
		}
		System.out.println();
		no--;
		}
	}

	private void print_no3() {
		// TODO Auto-generated method stub
		for(int j=1;j<=5;j++) {
		for(int i=j;i<=5;i++) {
			System.out.print("*"+ " ");
		}
		System.out.println();
		}
	}

	private void print_no2() {
		// TODO Auto-generated method stub
	    for(int j=1;j<=5;j++) {
	    	for(int i=5;i>=j;i--) {
	    		System.out.print(i+" ");
	    	}
	    	System.out.println();
	    }
	}

	private void print_no1() {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private void print_no() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print( j + " ");}
		System.out.println();
		}
	}

}
