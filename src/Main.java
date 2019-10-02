public class Main {

    public static void main(String[] args) {
        ATM bank1 = new ATM();

        bank1.showMoney();
        bank1.giveMoney(200);
        bank1.showMoney();
        bank1.increaseMoney(1000);
        bank1.showMoney();
        bank1.giveAllMoney(140);
        bank1.showMoney();
        
        
    }




}
