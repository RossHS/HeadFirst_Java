package helloworld.zd;
import java.util.Scanner;
/**
 * Created by User on 25.07.2017.
 */
public class zd1_1Tochka {
    public static void main(String[] args) {
        int probel = 0;
        int bukv =0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String a = scan.nextLine();
        for (int i=0; i < a.length(); i++){
            if(a.charAt(i)== '.'){ // возвращает символ, расположенный по указанному индексу строки. Индексы строк в Java начинаются с нуля.
                break;
            }
                 if(a.charAt(i) == ' '){
                 probel++;
                 } else
                 bukv++;
        }
        System.out.println("Пробелы до точки: " + probel);
        System.out.println("Символов до точки: " + bukv);
    }
}