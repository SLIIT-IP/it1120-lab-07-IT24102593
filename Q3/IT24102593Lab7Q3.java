import java.util.Scanner;

public class IT24102593Lab7Q3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int numOfCustomers = 5;
        final double discountRate = 0.05;
       
        double totalBillAmount, discount, amountToPay;
       
        char paymentMode;
        
        for (int i = 1; i <= numOfCustomers; i++) {
            System.out.println("\nCustomer" +i);
            System.out.print("Enter total bill amount: ");
            totalBillAmount = scanner.nextDouble();
            
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymentMode = scanner.next().charAt(0);
            
            if (paymentMode == 'C' || paymentMode == 'c') {
               
                discount = totalBillAmount * discountRate;
                amountToPay = totalBillAmount - discount;

                System.out.println("Discount is: "  +discount);
                System.out.println("Amount to be paid: " +amountToPay);
              } 
	    
	    else if (paymentMode == 'O' || paymentMode == 'o') {
                
              System.out.println("No discount applicable");
              System.out.println("Amount to be paid:" +totalBillAmount);
             }
	    
	    else {

                  System.out.println("Payment Mode is Not Valid\n");
            }
        
	}
       
    }
}

