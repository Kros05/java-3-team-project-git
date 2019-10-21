package edu.lits.string.Launch;

import edu.lits.string.string_class.myString;

public class Main {
    public static void main(String[] args) {
        myString str = new myString();

        str.setStr("String with ac-ca and b char.");

        str.maxCharacter();
       // str.maxCharacterVersionII();
        str.reversString();

        str.removeCharacters("ac");
        str.removeCharacters("b");
        System.out.println(str.getStr());

        str.setStr("a#b  b#a b#b c#a  csffs#o");
        str.sharpSymbol();

        str.repeatSymbols();
        System.out.println(str.getStr());

        str.setStr("Red BLUE some string");
        str.checkRedBlue();
    }
}
