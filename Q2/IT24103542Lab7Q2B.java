public class IT24103542Lab7Q2B{
	public static void main(String[] args){
	int r,c,k=1;
	for(r=1; r<=5; r++){
		System.out.print(r + " - ");
		
		for(c=1; c<=k; c++){
			System.out.print("* ");
		}
		
		System.out.print("\n");
		k = k + 1;
	}
	}
}