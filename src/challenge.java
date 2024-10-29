import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        String nameClient ="Javier Cifuentes Avendanyo";
        String accountType = "Current";
        double balance = 2000.99;

        System.out.println("#########################################");
        System.out.println("\nCustomer's Name: "+nameClient);
        System.out.println("Account's Type: "+accountType);
        System.out.println("Available Balance: $"+balance);
        System.out.println("\n#######################################");

        String menu = """
                ### Type the desired option number: ###
                1 - Check Balance
                2 - Withdraw
                3 - Deposit
                9 - Exit
                """;

        int option = 0;
        Scanner scanner = new Scanner(System.in);
        while (option != 9) {
            System.out.println(menu);
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\nThe updated balance is: $"+balance);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\nHow much money do you want to withdraw?");
                    double moneyWithdrawn = scanner.nextDouble();
                    if (moneyWithdrawn > balance) {
                        System.out.println("\nInsufficient balance.");
                        System.out.println();
                    } else {
                        balance -= moneyWithdrawn;
                        System.out.println("\nYou new balance is: $"+balance);
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("\nHow much money do you want deposit?");
                    double moneyDeposited = scanner.nextDouble();
                    balance += moneyDeposited;
                    System.out.println("\nYou new balance is: $"+balance);
                    System.out.println();
                    break;
                case 9:
                    System.out.println("\nYou have logged out of your account. Thanks you for using our services.");
                    break;
                default:
                    System.out.println("\nInvalid option. Try again with a valid option.");
                    System.out.println();
            }
        }
        scanner.close();
    }
}
