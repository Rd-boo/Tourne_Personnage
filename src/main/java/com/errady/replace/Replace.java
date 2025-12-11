package com.errady.replace;

import javax.print.attribute.standard.OrientationRequested;

public class Replace {

    public Orientation tournePersonne(int tourne){

        // Limiter le nombre de tourne
        if (tourne <= 50) {
            // limiter par les 4 directions
            switch (tourne % 4) {
                case 1:
                    return Orientation.Est;
                case 2:
                    return Orientation.Sud;
                case 3:
                    return Orientation.Ouest;
                default:
                    return Orientation.Nord;
            }
        }
        else {
            return Orientation.OverLimit;
        }
    }
}
