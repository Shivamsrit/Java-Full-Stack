import java.util.*;

public class sum{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int nth=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<nth+1 ;i++){
			sum=i+sum;
		}
		System.out.println(" sum is = "+sum);
		sc.close();
	}
}