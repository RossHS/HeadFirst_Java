package Head_First_Java.Ch01_Introduction;

/**
 * Created by User on 14.07.2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int x=3;
        while (x>0){
            if (x>2){
                System.out.print("a");
            }
            x=x-1;
            System.out.print("-");

            if (x == 2) {
                System.out.print("b c");
            }
            if (x == 1) {
                System.out.print("d");
                x=x-1;
            }
        }
    }
}

