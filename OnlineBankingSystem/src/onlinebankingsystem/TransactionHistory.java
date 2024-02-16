package onlinebankingsystem;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    static List<String> history=new ArrayList<String>();
    static void addHistory(String transaction){
        history.add(transaction);
    }
    static void displayHistory(){
        System.out.println("Transaction History");
        for(String transaction:history){
            System.out.println(transaction);

        }
    }
}
