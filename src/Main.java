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
        a.stykpris = 2;             // sætter stykprisen for objektet a
        a.holdbarhed = new Date(1608768000);  // setter holdbarheden til en dato i unix time
        a.smidUd();
        a.moden = true;
        a.coolDown("Apple");            // calling metod
        a.sort = AppleSort.GoldenDelicious;         // sætter min varialbe lige en sort
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
        a.antalX(b);




        a.fyldOp(a);
        a.fyldOp(a);
        a.fyldOp(a);
        a.fyldOp(b);
        a.fyldOp(p);
        a.fyldOp(b);
        a.antalX(b);
        a.antalalt();
        a.printlager();


    }


}
