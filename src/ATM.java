public class ATM {

<<<<<<< HEAD
    int amountOfMoney=1300;
=======
    int amountOfMoney=1000;
>>>>>>> eb4b67fa214bdf5654dd235b5990d227de489ad1

    void showMoney () {
        System.out.println(" The amount in ATM is next: " + amountOfMoney + " UAH");
            }
    void giveMoney (int money) {
        System.out.println("I whant to take next amount "+money+ " UAH");
        if (amountOfMoney >= money){
        System.out.println("You CAN take " + money + " UAH");
        amountOfMoney = amountOfMoney - money;
        } else {
            System.out.println(" You can't take your amount, the amount is next: " + amountOfMoney);
        }
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
