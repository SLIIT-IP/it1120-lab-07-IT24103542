import java.util.Scanner;
public class IT24103542Lab7Q3{
	public static void main(String[] args){
		int noOfCustomers = 5;
		Scanner input = new Scanner(System.in);

		for(int i = 1; i <= noOfCustomers; i++)
		{
			System.out.println("Customer " + i);

			System.out.print("Enter total bill amount: ");
			double billAmount = input.nextInt();

			System.out.print("Enter mode of payment (C for cash, O for other): ");
			char modeOfPayment = input.next().charAt(0);
		
			if (modeOfPayment == 'C' || modeOfPayment == 'c')
			{
				double discount = (billAmount * 5.0)/100;
				System.out.println("Discount is: " + discount);
				
				double totalAmount = billAmount - discount;
				System.out.println("Amount to be paid: " + totalAmount);
			}
			else if (modeOfPayment == 'O' || modeOfPayment == 'o')
			{
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid: " + billAmount);
			}
			else
			{
				System.out.println("Payment Mode is Not Valid");
			}
		System.out.println(" ");
		}
		
	}

}