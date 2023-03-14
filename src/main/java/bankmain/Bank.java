package bankmain;
import Functions.Functions;
import java.util.Scanner;
import java.util.logging.Logger;

 class Bank {
     private static int ch = 0;
     private static Logger lg = Logger.getLogger("bank");
     private static Scanner bn = new Scanner(System.in);
     private static Functions obj = new Functions();
     public static void main(String[] args) {

        while (ch != 5) {
            lg.info("1 Add Account/n 2.Deposit /n 3. Withdraw /n 4. current balance /n 5.exit");
            lg.info("Enter the choice : ");
            ch = bn.nextInt();

                    switch (ch) {
                        case 1:
                            obj.Addacc();
                            break;
                        case 2:
                            obj.deposit();
                            break;

                        case 3:
                            obj.withdrawel();
                            break;

                        case 4:
                            obj.balance();
                            break;

                        case 5:
                            System.exit(0);
                            break;

                        default:
                            lg.info("Invalid choice");
                    }
                }

        }
    }


