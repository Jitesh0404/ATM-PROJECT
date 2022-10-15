import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        ATMOperationInterface op = new AtmOperationImp();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter ATM Number : ");
        int atmNumber = in.nextInt();
        System.out.print("Enter Pin : ");
        int pin = in.nextInt();

        if (atmnumber==atmNumber && atmpin==pin){

            System.out.println("\nValidation Completed\n");
            while (true){
                System.out.println("\n1. View Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. View Mini Statement\n5. Exit");
                System.out.print("Enter your choice : ");
                int ch = in.nextInt();
                if (ch==1){
                    op.viewBalance();
                } else if (ch==2) {
                    System.out.print("\nEnter Amount to Withdraw : ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch==3) {
                    System.out.print("\nEnter Amount to Deposit : ");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);

                } else if (ch==4) {
                    op.viewMiniStatement();

                } else if (ch==5) {
                    System.out.println("Collect Your ATM CARD\nThankYou for using ATM Machine");
                    System.exit(0);
                }else {
                    System.err.println("\nInvalid Choice !!");
                }
            }
        }
        else{
            System.err.println("\nIncorrect ATM Number or Pin");
            System.exit(0);
        }
    }
}
