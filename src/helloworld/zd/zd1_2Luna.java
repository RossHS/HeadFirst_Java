package helloworld.zd;
import java.util.Scanner;
/**
 * Created by User on 25.07.2017.
 */
public class zd1_2Luna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите массу в кг на земле");
        double mass = scan.nextDouble();
        double luna = mass*0.17;
        System.out.println("Ваша масса на луне: " + luna);
    }
}
