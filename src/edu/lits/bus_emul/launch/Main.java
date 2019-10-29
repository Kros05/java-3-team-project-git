package edu.lits.bus_emul.launch;

import edu.lits.bus_emul.bus.Bus;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bus bus = new Bus();
        int status = 0;
        while(status<5){
            System.out.print("chose operation:\n" +
                    "1. Sum of payment\n" +
                    "2. in one year was payment?\n" +
                    "3. get month with highest payment\n" +
                    "4. get number of days between first and the last days\n" +
                    "5. Exit\n" +
                    "\n" +
                    "->");
            status = in.nextInt();
            System.out.println("\n------------------------------------");
            switch (status){
                case 1:
                    bus.sumOfPayment();
                    break;
                case 2:
                    bus.oneYearPayment();
                    break;
                case 3:
                    bus.monthOfHighestPayment();
                    break;
                case 4:
                    bus.betweenFirstAndLastDay();
                    break;
                default:
                    System.out.println("               By-By");
            }
            System.out.println("------------------------------------\n");

        }

    }
}
