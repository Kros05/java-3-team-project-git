package edu.lits.string.Launch;

import edu.lits.string.string_class.MyString;

public class Main {
    public static void main(String[] args) {
        String tempString = "";
        char tempChar;
        MyString str = new MyString();


        str.setStr("String with ac-ca and b char.");

        tempChar = str.maxCharacter();
        System.out.println("Max char in string is: '" + tempChar + "'");

        /* tempChar = str.maxCharacterVersionII();
        System.out.println("Max char in string is: '" + tempChar + "'");*/

        System.out.println(str.maxOccurringSymbol());

        tempString = str.reversString();
        System.out.println(tempString);

        tempString = str.removeCharacters("b", str.getStr());
        tempString = str.removeCharacters("ac", tempString);
        System.out.println(tempString);

        /*  System.out.println(str.removeCharacters("ac", str.removeCharacters("b", str.getStr())));*/

        System.out.println(str.getStr());

        str.setStr("a#b  b#a b#b c#a  csffs#o");
        str.sharpSymbol();

        tempString = str.repeatSymbols();
        System.out.println(tempString);

        str.setStr("Red BLUE some string");
        str.checkRedBlue();


    }
}
