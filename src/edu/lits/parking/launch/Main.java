package edu.lits.parking.launch;


import edu.lits.parking.parking_data.Parking_Data;

public class Main {
    public static void main(String[] args) {
        Parking_Data parking_data = new Parking_Data();
        parking_data.getDataFromFile("parking_chernivtsi.csv");
        parking_data.getOpenParking("05:00:06");
    }
}
