package bankmain;

import org.example.bank_one;

import java.util.Scanner;
import java.util.logging.Logger;

public class Bank
{
    public static void main(String[] args) {
        Logger lg = Logger.getLogger("bank");
        int num;
        int ch=0;
        Scanner bn= new Scanner(System.in);
        lg.info("Enter the account number : ");
        num = bn.nextInt();
       lg.info("Enter the name : ");
        String name =bn.next();
        bank_one obj = new bank_one(num,name);

        while (ch<4){
           lg.info("1.Deposit / 2. Withdrawel / 3. current balance / 4.exit");
           lg.info("Enter the choice : ");
            ch = bn.nextInt();

            switch (ch){
                case 1:
                    obj.deposit();
                    break;

                case 2:
                    obj.withdrawel();
                    break;

                case 3:
                    obj.balance();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                   lg.info("Invalid choice");


            }
        }

    }
}

