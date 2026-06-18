package CH01CoreJava.CH01code_Snippt.assignment_3;

public class pattern3{
	public static void main(String []args){
		int row=6;
		
		for(int i=1;i<=row;i++){
			
			if(i<=(row/2)){
			for(int j=1;j<=row;j++){
				if( (j>=(row/2)-i+1) && j<= ((row/2)+i-1))	
				System.out.print("*");
				else
				System.out.print(" ");

			} 
			}
			else{	
			for(int j=1;j<=row;j++){
				if( j<=((row/2)-i+1) && j>= ((row/2)+i-1))
				System.out.print("*");
				else
				System.out.print(" ");

			}
			}
			System.out.println();
		}
 	}
}