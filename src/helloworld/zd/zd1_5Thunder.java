package helloworld.zd;
import java.util.Scanner;
/**
 * Created by User on 25.07.2017.
 */
public class zd1_5Thunder {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Задайте интервал между вспышкой молнии и звуком в секундах");
        double time = text.nextDouble();
        System.out.println("Прошло со вспышки " + time + " секунд(ы)");
        System.out.println("Расстояние в футах до молнии: " + time*1100);
    }
}
