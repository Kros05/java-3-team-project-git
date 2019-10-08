package edu.lits;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        ATM[] b = new ATM[3];

        int count = 0;
        boolean option = true;


       /* while (option) {
            ATM b1 = new ATM();
            b[count] = b1;
            System.out.println("element "+count+" is created");
            count += 1;
            option = count < 3;
        }*/

        for (int i = 0; i < 3; i++) {

            if(i==1){
                MoneyMachine bb = new MoneyMachine("SomeCompany");
                b[i] = bb;
            }else{
                ATM bb = new ATM();
                b[i] = bb;
            }



            /*System.out.println("element "+i+" is created");
            System.out.println("element "+i+" hashcode "+ b[i].hashCode());
            System.out.println(i + " " + b[i].toString());*/
        }

     /*   while(option){
            System.out.println(count + " " + b[count].toString());
            count++;
option = count<3;
        }*/

        for (ATM tempATM:b
             ) {
            System.out.println(tempATM.toString());

        }
    }


}
