import java.util.*;

public class even{

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int nth = sc.nextInt();
		 for(int i=2;i<=nth;i=i+2){
			System.out.printf("even no. is : %d\n",i);
		}
		sc.close();
	}	
}