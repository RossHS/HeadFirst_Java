package helloworld.zd;
import java.util.Scanner;
/**
 * Created by User on 26.07.2017.
 */
public class zd1_7PrimeNumber {
    public static void main(String[] args) {
        int divisor;
        String Prime = "", NotPrime = "";
        Scanner field = new Scanner(System.in);
        System.out.println("Введите поле для нахождения простых чисел:");
        int Begin = field.nextInt();
        int End = field.nextInt();
        for (int x = Begin; x <= End; x++){
            divisor = 0;
            for (int i = 1; i <= x; i++){
                if (x%i == 0){ //остаток от деления должен быть равен 0
                    divisor++; //увл наш делитель
                }
            }
            if (divisor == 2) { //проверяем на наличие 2 делителей, (1 и само число х)
                Prime = Prime + x + ", "; //добавляем переменную в наш список
            } else {
                NotPrime = NotPrime + x + ", ";
            }

        }
        System.out.println("\n" + "Простые числа: "+ Prime);
        System.out.println("Составные числа: " + NotPrime);
    }
}
