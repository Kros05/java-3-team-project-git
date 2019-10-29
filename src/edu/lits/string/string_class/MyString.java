package edu.lits.string.string_class;

public class MyString {
    private String str = "This is default strings  ";
    private char[] arrOfChars;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public char maxCharacter() {
        char maxChar = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (maxChar < str.charAt(i)) {
                maxChar = str.charAt(i);
            }
        }
        return maxChar;
    }

    public char maxCharacterVersionII() {
        stringToCharArray();
        char maxChar = str.charAt(0);
        for (char tempChar : arrOfChars) {
            if (maxChar < tempChar) {
                maxChar = tempChar;
            }
        }
        return maxChar;
    }

    public String maxOccurringSymbol() {
        int[] arrDuplicate = new int[str.length()];
        String maxChar = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            boolean status = false;
            for (int m = 0; m < i; m++) {
                if (str.charAt(i) == str.charAt(m)) {
                    status = true;
                    arrDuplicate[i] = -1;
                    break;
                }
            }
            if (!status) {
                for (int k = i + 1; k < str.length(); k++) {
                    if (str.charAt(i) == str.charAt(k)) {
                        count++;
                    }
                }
            }
            if (!status) {
                arrDuplicate[i] = count;
            }
        }
        int maxDuplicate = arrDuplicate[0];

        for (int i = 0; i < str.length(); i++) {
            if (maxDuplicate < arrDuplicate[i]) {
                maxDuplicate = arrDuplicate[i];
                maxChar = "'" + str.charAt(i) + "'" + " ---> " + maxDuplicate;
            }
        }
        return maxChar;
    }

    public String reversString() {
        stringToCharArray();
        String tempString = "";
        for (int i = arrOfChars.length - 1; i >= 0; i--) {
            tempString = tempString + arrOfChars[i];
        }

        return tempString;
    }

    public String removeCharacters(String strWhatRemove, String stringToEdit) {
        String tempString = "";
        tempString = stringToEdit.replace(strWhatRemove, "");
        return tempString;
    }


    public void sharpSymbol() {
        stringToCharArray();
        for (int i = 0; i < arrOfChars.length; i++) {
            if (arrOfChars[i] == '#') {
                if (arrOfChars[i - 1] > arrOfChars[i + 1]) {
                    System.out.println(arrOfChars[i - 1] + " > " + arrOfChars[i + 1]);
                } else if (arrOfChars[i + 1] > arrOfChars[i - 1]) {
                    System.out.println(arrOfChars[i - 1] + " < " + arrOfChars[i + 1]);
                } else {
                    System.out.println(arrOfChars[i - 1] + " = " + arrOfChars[i + 1]);
                }

            }
        }
    }

    public void checkRedBlue() {
        String[] splited = str.split(" ");
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < splited.length; i++) {
            if (splited[i].equals("red") || splited[i].equals("Red") || splited[i].equals("RED")) {
                redCount++;
            } else if (splited[i].equals("blue") || splited[i].equals("Blue") || splited[i].equals("BLUE")) {
                blueCount++;
            }
        }
        if (redCount > blueCount) {
            System.out.println("Red in string is more then Blue by " + (redCount - blueCount));
        } else if (redCount == blueCount) {
            System.out.println("Red in string is equal Blue");
        } else {
            System.out.println("Blue in string is more then Red by " + (blueCount - redCount));
        }
    }


    public String repeatSymbols() {
        stringToCharArray();
        String tempString = "";
        for (int i = 0; i < arrOfChars.length; i++) {
            tempString = tempString + arrOfChars[i] + arrOfChars[i];
        }
        return tempString;
    }


    private void stringToCharArray() {
        arrOfChars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arrOfChars[i] = str.charAt(i);
        }
    }
}

