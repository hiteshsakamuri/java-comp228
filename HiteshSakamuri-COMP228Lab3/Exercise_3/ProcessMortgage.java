import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mortgage[] mortgageList = new Mortgage[3];

        System.out.print("Enter the your current interest rate: ");
        double currentRate = input.nextDouble();

        for (int i = 0; i < mortgageList.length; i++) {
            System.out.println("Enter details for Mortgage " + (i + 1));

            System.out.print("Enter Mortgage Number: ");
            String mortgageNumber = input.next();

            System.out.print("Enter your Name: ");
            String customerName = input.next();

            System.out.print("Enter Mortgage Amount: ");
            double mortgageAmount = input.nextDouble();

            System.out.print("Enter Term (1 for SHORT, 3 for MEDIUM, 5 for LONG): ");
            int term = input.nextInt();

            System.out.print("Enter type of mortgage (1 for Business, 2 for Personal): ");
            int type = input.nextInt();

            if (type == 1) {
                mortgageList[i] = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, currentRate, term);
            } else if (type == 2) {
                mortgageList[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, currentRate, term);
            } else {
                System.out.println("Invalid mortgage type! Defaulting to PersonalMortgage.");
                mortgageList[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, currentRate, term);
            }
        }

        System.out.println("\nYour Mortgage Information:");
        for (Mortgage mortgage : mortgageList) {
            System.out.println(mortgage.getMortgageInfo());
            System.out.println("----------------------------");
        }

        input.close();
    }
}
