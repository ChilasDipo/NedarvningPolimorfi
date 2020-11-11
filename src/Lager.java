import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;

public class Lager {
    ArrayList<Varer> lagerStatus = new ArrayList<>();

    public void fyldOp(Varer vare){
        lagerStatus.add(vare);
    }

    public void antalalt(){
        for (int i = 0; i <lagerStatus.size() ; i++) {
            System.out.println(lagerStatus.get(i));
        }
    }

    public void antalvarer(){
        System.out.println("Antal varer på lageret er  " + lagerStatus.size());

    }

    public void antalX(Varer x){
        int counter = 0;
        for (int i = 0; i < lagerStatus.size() ; i++) {
            if (lagerStatus.get(i)==x){
                counter++;
            }
        }
        System.out.println("Couting =  " + counter);
    }

    public void printlager(){

      //  File file = new File("C:\Users\Chila\Desktop\test");
      //  File file = new File("C:\\Users\\Chila\\filename.txt");
        try {
            PrintWriter write = new PrintWriter("Test.txt");
            int b = lagerStatus.size();
            write.write();
            write.close();
            System.out.println("sometinhg happed file ");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error exits");
        }

        antalvarer();

    }

}
