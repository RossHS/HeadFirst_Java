package helloworld.zd;
import java.util.*;
/**
 * Created by User on 26.07.2017.
 */
public class zd1_6GuessTheLetter {
    public static void main(String[] args) {
            //Букву которую будем отгадывать
            char Letter = (char) ('a' + new Random().nextInt(26));
            System.out.println(Letter); //загаданная буква

        //Позволим пользователю начать угадывать.
        Scanner MakeAGuess = new Scanner(System.in);
        int NumOfGuesses = 0; //подсчет количества попыток
        while(true) {
            System.out.println("Сделайте догадку: ");
            char UserGuess = MakeAGuess.next().charAt(0); //вводим букву
            System.out.println(UserGuess); //выводим на экран попытку игрока
            NumOfGuesses++; //инкременируем кол-во попыток после ввода игрока.
                if (Letter == UserGuess){ //если мы угадали
            System.out.println("малаца");
            break;
                }
                //в противном случае
                else {
                    System.out.println("Вы не угадали повторите попытку!");
                }
                if (Letter > UserGuess){
                    System.out.println("Буква меньше загаданной!");
                } else {
                    System.out.println("Буква больше загаданной!");
                }

        } //while
        System.out.println("Вам потребовалось: " + NumOfGuesses + " попытки(ок)");
    }
}
