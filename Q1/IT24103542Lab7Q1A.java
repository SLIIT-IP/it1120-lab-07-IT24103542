import java.util.Scanner;
public class IT24103542Lab7Q1A{
	public static void main(String[] args){
	int marks;
	int count=1;
	int total=0;
	float average;

	Scanner input=new Scanner(System.in);
	System.out.println("Enter marks for four subjects: ");
	while(count<=4){
		System.out.print("Enter Subject Mark "+count+": ");
		marks = input.nextInt();
		total = total + marks;
		count = count + 1;
	}
	average = total/4;
	System.out.println(" ");
	System.out.println("Average is : "+average);
	if (average>=75){
		System.out.println("Overall Grade is : Distinction");	
	}
	else if (average>=50 && average<75){
		System.out.println("Overall Grade is : Credit");
	}
	else if(average>=0 && average<50){
		System.out.println("Overall Grade is : Fail");
	}
		
	}
}