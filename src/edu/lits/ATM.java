package edu.lits;

public class ATM {


    int amountOfMoney=1300;

    void showMoney () {
        System.out.println(" The amount in edu.lits.ATM is next: " + amountOfMoney + " UAH");
            }
   public void giveMoney (int money) {
        System.out.println("I whant to take next amount "+money+ " UAH");
        if (amountOfMoney >= money){
        System.out.println("You CAN take " + money + " UAH");
        amountOfMoney = amountOfMoney - money;
        } else {
            System.out.println(" You can't take your amount, the amount is next: " + amountOfMoney);
        }
    }

    @Override
    public String toString() {
        return "ATM{" +
                "amountOfMoney=" + amountOfMoney +
                '}';
    }

    void increaseMoney (int money) {
        System.out.println("You can increase " + money + " UAH");
        amountOfMoney = amountOfMoney + money;
    }

    void giveAllMoney (int money) {
    while (amountOfMoney > 0){

        if (amountOfMoney<money) {
            System.out.println("The amount of money is not enought, we give you the rest " + amountOfMoney);
            amountOfMoney = amountOfMoney - amountOfMoney;
        } else {
            giveMoney(money);
           }
      }
    }
}
