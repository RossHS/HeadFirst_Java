package helloworld.Ch03_Primitives_References_Arrays;

/**
 * Created by User on 17.07.2017.
 */
public class Hobbits {

    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = -1; //массив всегда начинается с нулевого эллемента

        while (z < 2) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "Бильбо";
            if ( z == 1) {
                h[z].name = "Фродо";
            }
            if ( z == 2) {
                h[z].name = "Сэм";
            }
            System.out.println(h[z].name + " - Имя хорошего хоббита");
        }
    }
}
