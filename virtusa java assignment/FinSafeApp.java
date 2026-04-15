import java.util.Scanner;
public class FinSafeApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        
        account acc = new account(name, 0);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Mini Statement\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            
            try{
                switch (choice) {
                    case 1:
                        System.out.print("enter deposit amount: ");
                        double dep = sc.nextDouble();
                        acc.deposit(dep);
                        break;
                    case 2:
                        System.out.print("enter withdraw amount: ");
                        double wd = sc.nextDouble();
                        acc.withdraw(wd);
                        break;
                    case 3:
                        acc.printMiniStatement();
                        break;
                    case 4:
                        System.out.print("exiting....");
                        sc.close();
                        return;

                
                    default:
                        System.out.println("invalid choice");
                    
                }

            } catch( insufficientfundsexception e) {
                System.out.println("error "+ e.getMessage());

            } catch( IllegalArgumentException e){
                System.out.println("error "+ e.getMessage());



            }
        }
    }
    
}
