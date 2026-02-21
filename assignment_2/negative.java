import java.util.*;

public class negative{

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int nth = sc.nextInt();
		Boolean isNegative=false;
		
		int sum=0; 
		if(nth>0){
			isNegative=true;
			nth=nth*-1;
			
		}
		 while(nth<0){
			sum+=nth%10;
			nth=nth/10;
		}
		if(isNegative){
		System.out.println((sum*-1));
		}
		else{
			System.out.println(sum);
		}
			
		sc.close();
	}	
}