import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Varer extends Lager {

    double omsætningprvarer;
    double stykpris;
    Date holdbarhed;
    boolean kanSælges = true;
    int amountinstorages = 100;

    void smidaltud(){
        kanSælges = false;
        amountinstorages=0;
    }
    void smidUd() {
        amountinstorages = amountinstorages -1;
    }
    void sale(int antal){
        if (amountinstorages>antal & kanSælges==true){
            System.out.println(antal + " varer er blevet solgt");
            amountinstorages = amountinstorages - antal;
            omsætningprvarer = antal * stykpris;
        }else {
            System.out.println("Ugyldig amount or not enought in storage");
        }

    }

}
