package edu.lits.arraytasks.launch;

import edu.lits.arraytasks.tram.*;

public class Main {
    public static void main(String[] args) {
       Tram tramArray[] = new Tram[5];
        for (int i = 0; i < tramArray.length; i++) {
            String color = "red" + i;
            Tram t = new Tram(color);
            t.setNumberOfPasangers(3 + i);
            if (i == 2) {
                t.increaseNumberOfPasangers(1);
            }
            tramArray[i] = t;
        }
        for(Tram t : tramArray){
            System.out.println(t.toString());
        }
        boolean isDuplicated[] = new boolean[tramArray.length];
        for (int i = 0; i < tramArray.length; i++) {
            Tram t = tramArray[i];
            int currentSpecialValue = t.getNumberOfPasangers();
            boolean contains = false;
//            //----------------------------------------
            for (int c = i+1; c < tramArray.length; c++) {
                int value = tramArray[c].getNumberOfPasangers();
                if (value == currentSpecialValue) {
                    contains = true;
                }
            }
            isDuplicated[i] = contains;
        }
        for (int i = 0; i < isDuplicated.length; i++) {
            if(isDuplicated[i]) {
                System.out.println(tramArray[i].getColor() + " is duplicated");
            }
        }


        }

    }

