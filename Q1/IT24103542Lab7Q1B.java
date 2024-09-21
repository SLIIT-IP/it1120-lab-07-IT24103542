import java.util.Scanner;
public class IT24103542Lab7Q1B{
	public static void main(String[] args){
	int count;
	int total;
	double average;

	Scanner input=new Scanner(System.in);
	
	for(count=1; count<=3; count++){
		System.out.println("Student "+count);
		System.out.print("Enter marks: ");

		int mark1 = input.nextInt();
		int mark2 = input.nextInt();
		int mark3 = input.nextInt();
		int mark4 = input.nextInt();

		total = mark1 + mark2 + mark3 + mark4;
		average = total/4.0;
		System.out.println("Average is : "+average);

		if (average>=75 && average<=100){
			System.out.println("Overall Grade is : Distinction");	
		}
		else if (average>=50 && average<75){
			System.out.println("Overall Grade is : Credit");
		}
		else if(average>=0 && average<50){
			System.out.println("Overall Grade is : Fail");
		}
		System.out.println(" ");
		
	}
	
	
		
	}
} 