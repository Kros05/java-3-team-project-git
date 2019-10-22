package edu.lits.arraytasks.tram;

public class Tram {
    private int maxNumberOfPassangers = 30;
    private int numberOfPasangers;
    private String color;

    public Tram(String colorValue) {
        color = colorValue;
    }

    public Tram(String colorValue, int maxNumberOfPassangersValue) {
        color = colorValue;
        maxNumberOfPassangers = maxNumberOfPassangersValue;
    }

    public String getColor() {
        return color;
    }

    public int increaseNumberOfPasangers(int numberToIncrease) {
        int numberWhoLeft = 0;
        int finalNumberOfPassangersWhoTryToEnter = numberOfPasangers + numberToIncrease;
        boolean ifEverybodyCanEnter =
                maxNumberOfPassangers > finalNumberOfPassangersWhoTryToEnter;
        if (ifEverybodyCanEnter) {
            numberOfPasangers = finalNumberOfPassangersWhoTryToEnter;
        } else {
            numberOfPasangers = maxNumberOfPassangers;
            int numberOfPersonsWhoLeftOnTheStation =
                    finalNumberOfPassangersWhoTryToEnter - numberOfPasangers;
            System.out.println(numberOfPersonsWhoLeftOnTheStation + " persons left on the station," +
                    " after " + color + " tram gone.");
            numberWhoLeft = numberOfPersonsWhoLeftOnTheStation;
        }
        return numberWhoLeft;
    }

    @Override
    public String toString() {
        return "Tram{" +
                "numberOfPasangers=" + numberOfPasangers +
                ", color='" + color + '\'' +
                '}';
    }

    public int getNumberOfPasangers() {
        return numberOfPasangers;
    }

    public void setNumberOfPasangers(int numberOfPasangers) {
        this.numberOfPasangers = numberOfPasangers;
    }
}
