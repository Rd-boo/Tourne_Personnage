package com.errady.replace;

import javax.print.attribute.standard.OrientationRequested;

public class Replace {

    public String tournePersonne(int tourne){

        // limiter par les 4 directions
        tourne = tourne % 4;

        if (tourne == 1){
            return "Est";
        }
        else if (tourne == 2){
            return "Sud";
        }
        else if (tourne == 3){
            return "Ouest";
        }
        else{
            return "Nord";
        }
    }
}
