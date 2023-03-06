package org.example;

import java.util.*;
import java.util.logging.Logger;



 public class bank_one{
    Logger lg = Logger.getLogger("bank_one");
    int number;
    int bal=0;
    int deposit;
    int withdrawel;
    String name;
    Scanner sc = new Scanner (System.in);

    public bank_one(int no, String name) {
        this.number = no;
        this.name = name;
    }

 public void deposit(){

       lg.info("Enter the deposit : ");
        deposit = sc.nextInt();
        bal=bal+deposit;
    }
  public   void withdrawel(){

            lg.info("Enter the withdrawel : ");
            withdrawel = sc.nextInt();
            bal=bal-withdrawel;

    }
  public  void balance (){
       lg.info("Current balance: "+bal);
    }


}


