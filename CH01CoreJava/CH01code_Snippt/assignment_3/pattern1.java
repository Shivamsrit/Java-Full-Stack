package CH01CoreJava.CH01code_Snippt.assignment_3;

public class pattern1{
	public static void main(String []args){
		for (int i=0;i<4;i++){
			for(int j=3;j>=i;j--){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}