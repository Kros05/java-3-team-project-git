package edu.lits.string.string_class;

public class myString {
    private String str = "This is default string";
    private char[] arrOfChars;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void maxCharacter() {
        char maxChar = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (maxChar < str.charAt(i)) {
                maxChar = str.charAt(i);
            }
        }
        System.out.println("Max character: " + maxChar);
    }


    public void maxCharacterVersionII() {
        stringToCharArray();
        char maxChar = str.charAt(0);
        for (char tempChar:arrOfChars) {
            if (maxChar < tempChar) {
                maxChar = tempChar;
            }
        }
        System.out.println("Max character: " + maxChar);
    }

    public void reversString() {
        stringToCharArray();
        str = "";
        for (int i = arrOfChars.length - 1; i >= 0; i--) {
            str = str + arrOfChars[i];
        }

        System.out.println(str);
    }

    public void removeCharacters(String strToRemove) {
        str = str.replace(strToRemove, "");
    }


    public void sharpSymbol(){
        stringToCharArray();
        for (int i =0; i<arrOfChars.length;i++){
            if(arrOfChars[i]=='#'){
                if(arrOfChars[i-1]>arrOfChars[i+1]){
                    System.out.println(arrOfChars[i-1] + " > " + arrOfChars[i+1]);
                }else if(arrOfChars[i+1]>arrOfChars[i-1]){
                    System.out.println(arrOfChars[i-1] + " < " + arrOfChars[i+1]);
                }else{
                    System.out.println(arrOfChars[i-1] + " = " + arrOfChars[i+1]);
                }

            }
        }
    }

    public void checkRedBlue() {
        String[] splited = str.split(" ");
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < splited.length; i++) {
             if (splited[i].equals("red")||splited[i].equals("Red")||splited[i].equals("RED")) {
                redCount++;
            } else if (splited[i].equals("blue") || splited[i].equals("Blue") || splited[i].equals("BLUE")) {
                blueCount++;
            }
        }
        if(redCount>blueCount){
            System.out.println("Red in string is more then Blue by " + (redCount-blueCount));
        }else if(redCount==blueCount){
            System.out.println("Red in string is equal Blue");
        }else{
            System.out.println("Blue in string is more then Red by " + (blueCount-redCount));
        }
    }


    public void repeatSymbols() {
        stringToCharArray();
        str = "";
        for (int i = 0; i < arrOfChars.length; i++) {
            str = str + arrOfChars[i] + arrOfChars[i];
        }
    }


    private void stringToCharArray() {
        arrOfChars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arrOfChars[i] = str.charAt(i);
        }
    }
}

