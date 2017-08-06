package Head_First_Java.Ch06_Java_Libraries;
import java.util.*;
/**
 * Created by User on 23.07.2017.
 */
public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "nol");
        a.add(1, "odin");
        a.add(2, "dva");
        a.add(3, "tri");
        printAl(a);

        a.remove(2);
        if (a.contains("tri")){
            a.add("cheture");
        }
        printAl(a);

        if (a.indexOf("cheture") !=4){
            a.add(4, "4.2");
        }
        printAl(a);

        if (a.contains("dva")){
            a.add("2.2");
        }
        printAl(a);
    }

    public static void printAl(ArrayList<String> a1) {
        for (String element : a1) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}

