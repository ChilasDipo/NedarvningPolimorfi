import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Main {

    public static void main(String[] args) {

        Apple a = new Apple();
        a.stykpris = 2;
        a.holdbarhed = new Date(1608768000);
        a.smidUd();
        a.moden = true;
        a.coolDown("Apple");
        a.sort = AppleSort.GoldenDelicious;
        System.out.println(a.amountinstorages);
        a.sale(4);
        System.out.println(a.amountinstorages);
        a.smidaltud();
        a.sale(4);
        System.out.println(a.amountinstorages);

        Peas p = new Peas();
        p.stykpris = 0.1;
        p.holdbarhed = new Date(1608768000);
        p.freeze();


        Banan b = new Banan();
        b.stykpris = 1.0;
        b.holdbarhed= new Date(1608768000);
        b.moden = true;
    }

}
