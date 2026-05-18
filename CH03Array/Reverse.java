public class Reverse{
	public static void main(String[] args){
	int [] num={4,8,12,15,7,9,6};
	int i=0;
	int j=6;
	while(i<j){
		int temp=0;
		temp=num[i];
		num[i]=num[j];
		num[j]=temp;
		i++;
		j--;	
	}
	for(int z=0;z<7;z++){
		System.out.println(num[z]);
	}
	}
}