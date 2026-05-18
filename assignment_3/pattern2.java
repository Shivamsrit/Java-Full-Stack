public class pattern2{
	public static void main(String []args){
		int row=4;
		int colum=7;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=colum;j++){
				if( j>=(row-i+1) && j<= (row+i-1))	
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}