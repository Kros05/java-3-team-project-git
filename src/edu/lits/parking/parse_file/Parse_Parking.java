package edu.lits.parking.parse_file;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parse_Parking {
  private  int lineCounter = 0;
    private  int columnCounter = 0;
    private File myFile;
    private Scanner reader;
    private String[][] parseString;
    private String pathToFile;

    public Parse_Parking(String pathToFile){
        this.pathToFile = pathToFile;
    }

    public String[][] mains() {
        myFile = new File(pathToFile);
        try {
            reader = new Scanner(myFile);
            getLines();
            reader = new Scanner(myFile);
            parse(reader.nextLine(), true);

            parseString = new String[lineCounter][columnCounter];

            System.out.println(columnCounter);
            System.out.println(lineCounter);
            reader = new Scanner(myFile);
            boolean firstLine = true;
            int counter = 0;
            while (reader.hasNextLine()) {
                if (firstLine) {
                    reader.nextLine();
                    firstLine = false;
                }
                parseString[counter] = parse(reader.nextLine(), false);
                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return parseString;

    }


    private void getLines() {
        lineCounter = 0;
        boolean firstLine = true;
        while (reader.hasNextLine()) {
            if (firstLine) {
                reader.nextLine();
                firstLine = false;
            }
            reader.nextLine();
            lineCounter++;
        }
    }


    private String[] parse(String str, boolean countColumnTrue_parseStringFalse) {
        int startPosition = 0;
        int endPosition = 0;
        int counter = 0;
        String[] tempArray = new String[columnCounter];
        if (countColumnTrue_parseStringFalse) {
            columnCounter = 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                startPosition = i;
                for (int a = i + 1; a < str.length(); a++) {
                    if (str.charAt(a) == ',') {
                        endPosition = a;
                        i = a - 1;
                        if (countColumnTrue_parseStringFalse) {
                            columnCounter++;
                        } else {
                            tempArray[counter] = str.substring(startPosition, endPosition);
                            counter++;
                            // System.out.println(str.substring(startPosition, endPosition));
                        }

                        break;
                    }
                }
            } else {
                if (str.charAt(i) == ',') {
                    if (str.charAt(i + 1) == '"') {
                        startPosition = i + 2;
                        for (int a = i + 1; a < str.length(); a++) {
                            if (str.charAt(a) == '"') {
                                if (str.charAt(a + 1) == ',') {
                                    endPosition = a;
                                    i = a - 1;
                                    if (countColumnTrue_parseStringFalse) {
                                        columnCounter++;
                                    } else {
                                        tempArray[counter] = str.substring(startPosition, endPosition);
                                        counter++;
                                        // System.out.println(str.substring(startPosition, endPosition));
                                    }
                                    break;
                                }
                            }

                        }
                    } else {
                        startPosition = i + 1;
                        for (int a = i + 1; a < str.length(); a++) {
                            if (str.charAt(a) == ',') {
                                endPosition = a;
                                i = a - 1;
                                if (countColumnTrue_parseStringFalse) {
                                    columnCounter++;
                                } else {
                                    tempArray[counter] = str.substring(startPosition, endPosition);
                                    counter++;
                                    // System.out.println(str.substring(startPosition, endPosition));
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (countColumnTrue_parseStringFalse) {
            columnCounter++;
            return null;
        } else {
            tempArray[counter] = str.substring(startPosition, str.length());
            // System.out.println(str.substring(startPosition, endPosition));
            return tempArray;
        }

    }
}


