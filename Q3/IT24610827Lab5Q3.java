import java.util.Scanner;
public class IT24610827Lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_CHARGE = 48000;
        final int MAX_DAYS = 31;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start date Between 1-31(day):");
        int startDate = scanner.nextInt();

        System.out.println("Enter the end date Between 1-31(day):");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > MAX_DAYS || endDate < 1 || endDate > MAX_DAYS) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        int numOfDays = endDate - startDate + 1;

        double discountRate;
        if (numOfDays <= 3) {
            discountRate = 0;
        } else if (numOfDays <= 4) {
            discountRate = 0.10;
        } else {
            discountRate = 0.20;
        }

        double totalAmount = numOfDays * ROOM_CHARGE * (1 - discountRate);
	System.out.println("Room Charge per Day = Rs.48000/=");
        System.out.println("Number of days reserved= " + numOfDays);
        System.out.println("Discount rate= " + (discountRate * 100) + "%");
        System.out.println("Total amount = Rs " + totalAmount);

        scanner.close();
    }
}