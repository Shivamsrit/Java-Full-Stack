public class largest2{
	public static void main(String[] args){
		int [] num= {23,34,40,20,74};
		for(int i=0;i<5;i++){
			int temp=0;
			for (int j=i+1;j<5;j++){
				if(num[j] < num[i]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
					}
	
				}
		}
		for(int i=0;i<5;i++){
			System.out.println(num[i]);
	
		}
	}
}