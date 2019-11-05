package edu.lits.bus_emul.bus;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Bus {
    //масив з яким працює клас
    private Payment[] paymentArray = new Payment[20];

    //конструктор класу який викликає метод заповнення масиву paymentArray
    public Bus() {
        setPayment();
    }

    //метод виводу всіх полів всіх елементів масиву paymentArray
    public void getPayments() {
        for (Payment pay : paymentArray
        ) {
            System.out.println(pay.toString());

        }
    }

    //ініціалізація всіх елементів масиву
    public void setPayment() {
        for (int i = 0; i < 20; i++) {
            paymentArray[i] = new Payment();
            if (i < 5) {
                paymentArray[i].setYear(2015);
                paymentArray[i].setMonth(1);
                paymentArray[i].setDay(i + 2);
                paymentArray[i].setPayment(3 * i + 1);
            } else if (i >= 5 && i < 15) {
                paymentArray[i].setYear(2017);
                paymentArray[i].setMonth(9);
                paymentArray[i].setDay(i + 1);
                paymentArray[i].setPayment(2 * i + 1);
            } else if (i >= 15 && i < 20) {
                paymentArray[i].setYear(2019);
                paymentArray[i].setMonth(8);
                paymentArray[i].setDay(i + 1);
                paymentArray[i].setPayment(7 * i + 1);
            }
        }
        paymentArray[4].setYear(2019);
        paymentArray[4].setMonth(12);
        paymentArray[4].setDay(1);
        paymentArray[4].setPayment(71);
    }


    // метод сумування всіх платежів
    public void sumOfPayment() {
        //змінна для занесення суми
        int sum = 0;
        //перебираємо по всім елементам масиву paymentArray
        for (Payment pay : paymentArray
        ) {
            //сумуємо всі платежі
            sum = sum + pay.getPayment();

        }
        //виводимо результат
        System.out.println("Sum of payment is: " + sum);
    }

    //метод перевірки чи в один рік були платежі
    public void oneYearPayment() {
        //для визначення співпадіння (true) не співпадіння (false) років платежів
        boolean inOneYear = true;
        //перевіряємо чи рік першого платежу співпадає/не співпадає з наступними
        for (int i = 1; i < paymentArray.length; i++) {
            //якщо не співпадають
            if (paymentArray[0].getYear() != paymentArray[i].getYear()) {
                //вносимо в змінну inOneYear значення false і перериваємо цикл
                inOneYear = false;
                break;
            }
        }
        //вивід сповіщення в залежності від того чи співпадають/не співпадають роки платежів
        if (inOneYear) {
            System.out.println("Payments made in one calendar year");
        } else {
            System.out.println("payment were not made in one calendar year");
        }
    }


    //метод визначення місяця в якому було зроблено найбільше поїздок
    public void monthOfHighestPayment() {
        //тимчасовий масив для занесення кількості платежів помісячно
        int[] tempArray = new int[paymentArray.length];
        //перебираємо по місяцям
        for (int i = 0; i < paymentArray.length; i++) {
            //boolean змінна для визначення чи був вже цей місяць раніше
            boolean statusWas = false;
            //перевірка чи попадався раніше такий місяць
            for (int a = 0; a < i; a++) {
                if (paymentArray[a].getMonth() == paymentArray[i].getMonth()) {
                    //якщо попадався то записуємо в statusWas значення true і перериваємо цикл
                    statusWas = true;
                    break;
                }
            }
            //якщо перевірка на повтор місяця пройшла (місяць не попадався раніше)
            if (!statusWas) {
                //так як перевіряти почнемо з наступної позиції, то заносимо в ячейку тимчасового масиву 1
                tempArray[i] = 1;
                //починаємо перебирати основний масив помісячно починаючи з наступної позиції по відношеню до контрольного місяця
                for (int a = i + 1; a < paymentArray.length; a++) {
                    //якщо місяці співпадають, то додаємо 1 в ячейку
                    if (paymentArray[a].getMonth() == paymentArray[i].getMonth()) {
                        tempArray[i]++;
                    }
                }
                //якщо вже був повтор, то заносимо значення -1
            } else {
                tempArray[i] = -1;
            }

        }
        //зміннна для визначення максимальної кількості поїздок в місяці
        int max = tempArray[0];
        //індекс місяця
        int indexMax = 0;
        //перебираємо по тимчасовому масиву для визначення максимальної кількості поїздок
        for (int i = 0; i < tempArray.length; i++) {
            //якщо змінна менша ніж значення в ячейці масиву то заносимо його в змінну max і значення
            //лічильника "і" заносимо в змінну індекса
            if (max < tempArray[i]) {
                max = tempArray[i];
                indexMax = i;
            }
        }
        //змінна для занесення строкового значення місяця
        String month = "";
        //условний оператор switch для перетворення числового значення місяця в строкову
        switch (paymentArray[indexMax].getMonth()) {
            case 1:
                month = "січень";
                break;
            case 2:
                month = "лютий";
                break;
            case 3:
                month = "березень";
                break;
            case 4:
                month = "квітень";
                break;
            case 5:
                month = "травень";
                break;
            case 6:
                month = "червень";
                break;
            case 7:
                month = "липень";
                break;
            case 8:
                month = "серпень";
                break;
            case 9:
                month = "вересень";
                break;
            case 10:
                month = "жовтень";
                break;
            case 11:
                month = "листопад";
                break;
            case 12:
                month = "грудень";
                break;
        }
        //виводимо результат методу
        System.out.println(month + " - місяць в якому було зроблено максимальну кількість поїздок, їх було: " + max);

    }


    //метод визначенння кількості днів між першим і крайнім днем платежів
    public void betweenFirstAndLastDay() {
        //змінна для врахування зміщення по рокам
        int year = paymentArray[lastDay()].getYear() - paymentArray[firstDay()].getYear();
        //розрахунок і виведення результату різниці між датами
        System.out.println("first day: " + paymentArray[firstDay()].getYear()+"/"+paymentArray[firstDay()].getMonth()+"/"+paymentArray[firstDay()].getDay());
        System.out.println("lastDay day: " + paymentArray[lastDay()].getYear()+"/"+paymentArray[lastDay()].getMonth()+"/"+paymentArray[lastDay()].getDay());
        System.out.println((paymentArray[lastDay()].dayOfYear() - paymentArray[firstDay()].dayOfYear()) + (year * 365) + " days between first and last days");


    }
    //визначення першого дня платежів
    private int firstDay(){
        int firstDayIndex=0;
        for (int i =0;i<paymentArray.length;i++){
            for(int a=i+1;a<paymentArray.length;a++){
                if(paymentArray[firstDayIndex].getYear()>paymentArray[a].getYear()){
                    firstDayIndex = a;
                }else if(paymentArray[firstDayIndex].getYear()==paymentArray[a].getYear()){
                    if(paymentArray[firstDayIndex].getMonth()>paymentArray[a].getMonth()){
                        firstDayIndex = a;
                    }else if(paymentArray[firstDayIndex].getMonth()==paymentArray[a].getMonth()){
                        if(paymentArray[firstDayIndex].getDay()>paymentArray[a].getDay())
                        firstDayIndex=a;
                    }
                }
            }
        }
        return firstDayIndex;
    }
    //визначення останнього дня платежів
    private int lastDay(){
        int lastDayIndex=0;
        for (int i =0;i<paymentArray.length;i++){
            for(int a=i+1;a<paymentArray.length;a++){
                if(paymentArray[lastDayIndex].getYear()<paymentArray[a].getYear()){
                    lastDayIndex = a;
                }else if(paymentArray[lastDayIndex].getYear()==paymentArray[a].getYear()){
                    if(paymentArray[lastDayIndex].getMonth()<paymentArray[a].getMonth()){
                        lastDayIndex = a;
                    }else if(paymentArray[lastDayIndex].getMonth()==paymentArray[a].getMonth()){
                        if(paymentArray[lastDayIndex].getDay()<paymentArray[a].getDay()) {
                            lastDayIndex = a;
                        }
                    }
                }
            }
        }
        return lastDayIndex;
    }

}



