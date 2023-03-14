package Functions;
import org.example.BankOne;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class Excep extends Exception{}
public class Functions {
     private int bal;
     private int deposit;
     private int withdrawel;
     private int acc;

     private  Scanner sc = new Scanner(System.in);
     private  Logger lg = Logger.getLogger("bank_one");
     private  HashMap<Integer, BankOne> hmap = new HashMap<>();

        public void Addacc() {

                lg.info("Enter the name : ");
                String name = sc.next();
                lg.info("Enter the account number : ");
                int num = sc.nextInt();
                lg.info("Enter the initial balance : ");
                int balance = sc.nextInt();
                BankOne obj = new BankOne(num, name, balance);
                hmap.put(num,obj);

        }

        public void deposit() {
                lg.info("Enter the account number : ");
                 acc = sc.nextInt();
                if (hmap.containsKey(acc)) {
                        lg.info("Enter the deposit : ");
                        deposit = sc.nextInt();
                        bal = bal + deposit;
                        lg.info("Enter the name : ");
                        String name = sc.next();
                        BankOne object = new BankOne(acc, name, bal);
                        hmap.replace(acc, object);
                } else {
                        lg.info("Invalid account");
                }
        }

        public void withdrawel() {
                try {
                        lg.info("Enter the account number : ");
                         acc = sc.nextInt();
                        if (hmap.containsKey(acc)) {
                                lg.info("Enter the withdrawel : ");
                                withdrawel = sc.nextInt();

                                if (withdrawel > bal)
                                        throw new Excep();
                                else {
                                        bal = bal - withdrawel;
                                        lg.info("Enter the name : ");
                                        String name = sc.next();
                                        BankOne object = new BankOne(acc, name, bal);
                                        hmap.replace(acc, object);
                                }
                        }
                         else{
                                        lg.info("Invalid account");
                                }
                }
                catch(Excep e){
                        lg.info("your balance is low");
                }
        }

        public void balance ()
        {
                lg.info("Enter the account number : ");
                 acc = sc.nextInt();
                if(hmap.containsKey(acc))
                {
                     //   BankOne bank = new BankOne();
                       lg.log(Level.INFO,()->"The account is :"+hmap.values());
                     //   bank.print();
                }
                else{
                        lg.info("Invalid account");
                }
        }
}
