package edu.lits.parking.parking_data;

import edu.lits.parking.parse_file.Parse_Parking;

import java.time.LocalTime;

public class Parking_Data {
    private String[][] dataString;

    public void getDataFromFile(String strFullPathToFile) {
        Parse_Parking parse_parking = new Parse_Parking(strFullPathToFile);
        dataString = parse_parking.mains();
    }

    public void getOpenParking(String hhmmss) {
        try {
            for (int i = 0; i < dataString.length; i++) {
                LocalTime currentTime = LocalTime.parse(hhmmss);
                LocalTime startDate = LocalTime.parse(dataString[i][12]);
                LocalTime endDate = LocalTime.parse(dataString[i][13]);
                if (currentTime.isAfter(startDate) && currentTime.isBefore(endDate)) {
                    System.out.println(dataString[i][3] + " " + dataString[i][4] + "open: " + dataString[i][12] + " -- close: " + dataString[i][13]);
                }
            }
        }catch(java.time.format.DateTimeParseException ex){
            System.out.println("Not correct time format. it must be like 01:02:03");
        }

    }
}
