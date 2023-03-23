package patternprogram;

public class PatternProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PatternProgram1 obj=new PatternProgram1();
obj.saravanan();
obj.alphabet_t();
obj.alphabet_m();
	}
private void alphabet_m() {
		// TODO Auto-generated method stub
	for( int row=1;row<=9;row++) {
		for(int col=1;col<=9;col++) {
		if(col==1||col==9) {
			System.out.print("*");
		}
		else if(row==col || row+col==10) {
			if(row<=5) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
//		else if(row+col==10) {
//			if(row<=5) {
//			System.out.print("*");
//		}
//			else {
//				System.out.print(" ");
//			}
//		}
		else {
			System.out.print(" ");
		}
		}
		System.out.println();
		}
	}
private void alphabet_t() {
		// TODO Auto-generated method stub
	//alphabet t
		for( int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
				if(row==1||col==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}



	private void saravanan() {
		// TODO Auto-generated method stub
		//alphabet S
		for(int row =1;row<=9;row++ ) {
			for(int col=1;col<=9;col++) {
				if(row==1||row==5||row==9) {
					System.out.print("*");
				}
				else if(row<=5) {
					if(col==1) {
						System.out.print("*");
					}
				}
				else if(col==9) {
					if(row>=5) {
						System.out.print("*");
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//alphabet A
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
				if(row==1||row==5||col==1||col==9) {
					System.out.print("*");
				}
//				else if(col==1||col==9) {
//					System.out.print("*");
//				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//alphabet R
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
				if(row==1||row==5||col==1) {
					System.out.print("*");
				}
				else if(col==9) {
					if(row<5) {
						System.out.print("*");
					}
				}
//				else if(row>5&&col>1) {
//					if(row+col%2==0) {
//						System.out.print("*");
//					}
//				}
//				else if(col>1&&row>5) {
//					System.out.print("*");
//				}
				else {
					System.out.print(" ");
				}
				for(int i=2;i<=5;i++) {
					if(row==i+4&&col==i) {
						System.out.print("*");
					}
			}
			}
			System.out.println();
			}
		//alphabet A
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
				if(row==1||row==5||col==1||col==9) {
					System.out.print("*");
				}
//				else if(col==1||col==9) {
//					System.out.print("*");
//				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//alphabet v
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
				if(row<9) {
				if(row+col==14) {
				System.out.print("*");
			}
//			else if(row==col) {
//				System.out.print("*");
//			}
			else {
				System.out.print(" ");
			}
				}
				else {
					System.out.print(" ");
				}
				for(int i=1;i<=5;i++) {
					if(row==i+4&&col==i) {
						System.out.print("*");
					}
				}
				
			}
			System.out.println();
	}
		//alphabet A
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
				if(row==1||row==5||col==1||col==9) {
					System.out.print("*");
				}
//				else if(col==1||col==9) {
//					System.out.print("*");
//				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//alphabet N
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
			if(col==1||col==9||row==col) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
			System.out.println();
			}
		//alphabet A
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
				if(row==1||row==5||col==1||col==9) {
					System.out.print("*");
				}
//				else if(col==1||col==9) {
//					System.out.print("*");
//				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//alphabet N
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
			if(col==1||col==9||row==col) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
			System.out.println();
			}
		
	}
}
