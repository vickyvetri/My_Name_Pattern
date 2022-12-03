public class My_Name {

public static void main(String[] args) {
	My_Name obj = new My_Name();
	obj.print_V();
	obj.print_I();
	obj.print_C();
	obj.print_K();
	obj.print_Y();
	
	
}

public void print_V(){
	for(int row=1;row<=7;row++) {
		 for(int col=1;col<=7;col++) {
			if((row==col) && (row<=4)){
			System.out.print("* ");
		}	
			else if((row+col)==8 && (row<=col)){
			System.out.print("* ");	
			}
			else{
			 System.out.print(" ");}
		 }
		 System.out.println();
	 }
}
public void print_I() {
	for(int row=1;row<=7;row++) {
		  for(int col=1;col<=7;col++) {
			  if((row==1 || row==7) || col==4){
				  System.out.print("* ");
			  }	  
			  else {
				  System.out.print("  ");
			  }
		  }
		  System.out.println();
	 }
	System.out.println();
}
	public void print_C() {
		for(int r=1;r<=7;r++){
			if(r==1 || r==7){
			for(int s=1;s<=7;s++){
				if(s==1 || s==7){
					System.out.print(" ");
		}
			else{	
			System.out.print("* ");
		}
				}
			}
			else{
				for(int s=1;s<=7;s++){
					if(s==1){
				   System.out.print("* ");
				}
					else{
					System.out.print(" ");
				}
			}
			}
			System.out.println();
		}
		System.out.println();

}
	private void print_K() {
		for(int row=1;row<=7;row++) {
			 for(int col=1;col<=7;col++) {
				if(col==1){
				System.out.print("* ");
			}	
				else if((row+col)==5 || (row-col)==3){
				System.out.print("* ");	
				}
				else{
				 System.out.print(" ");}
			 }
			 System.out.println();
		 }
		System.out.println();
}
	private void print_Y() {
		for(int row=1;row<=7;row++) {
			 for(int col=1;col<=7;col++) {
				if((row==col) && (row<=4)){
				System.out.print("* ");
			}	
				else if((row+col)==8 && (row<=col)){
				System.out.print("* ");	
				}
				else if((row>4) && (col==4)) {
				System.out.print("* ");
				}
				else{
				 System.out.print(" ");}
			 }
			 System.out.println();
		 }
	}
}


