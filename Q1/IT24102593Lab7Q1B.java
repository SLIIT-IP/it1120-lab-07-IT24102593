import java.util.Scanner;
public class IT24102593Lab7Q1B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

	for (int student = 1; student <= 3; student++) {

        System.out.println("\nStudent" +student );

        System.out.print("Enter marks : ");
        int mark1 = input.nextInt();
	int mark2 = input.nextInt();
	int mark3 = input.nextInt();
	int mark4 = input.nextInt();

        
        double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

        System.out.println("Average is : " +average);

        if (average <= 100 && average >= 75) {
            System.out.println("Overall Grade is : Distrinction");
        }
        else if (average < 75 && average >= 50) {
            System.out.println("Overall Grade is : Credit");
        }
        else if (average < 50 && average >= 0) {
            System.out.println("Overall Grade is : Fail");
        }
        else{
	    System.out.println("Invalid Marks Entered");
        }

     }	

  }
}