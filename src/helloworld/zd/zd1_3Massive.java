package helloworld.zd;
import java.util.*;
/**
 * Created by User on 25.07.2017.
 */
public class zd1_3Massive {
    public static void main(String[] args) {
        ArrayList<Integer> Massive = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Объявите длину массива:");
        int dlina = scan.nextInt();
        System.out.println("Внесите элементы массива:");
       //Заносим элементы массива в наш массив опред длины
        for ( int i=0; i < dlina ; i++ ) {
            int s = scan.nextInt();
            Massive.add(s);
        }

        // выводим на экран каждый эллемент массива.
        for (int s : Massive) {
            System.out.print(s+ " ");
        }
        // тоже самое только не прокаченным методом for
       // for (int i=0; i< Massive.size(); i++){
      //      System.out.print(Massive.get(i)+ " ");
       // }

        // назовем индекс элемента массива, который будем увеличивать
        System.out.println("\n Введите индекс массива, который вы хотите увеличить на 10%");
        int x = scan.nextInt();
        int uvl = Massive.get(x);
        double result = result(uvl); //вызываем метод result
        System.out.println("Увеличим элемент массива под номером " + x + " на 10% = " + result);
    }
    public static double result(int uvl){
        double y = uvl + uvl * 0.1;
        return y;
    }
}