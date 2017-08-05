package helloworld.Ch14_Serialization_And_IO;
import java.io.*;
/**
 * Created by User on 03.08.2017.
 */
public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50,"Эльф", new String[] {"лук","Меч","кастет"});
        GameCharacter two = new GameCharacter(200, "Троль", new String[] {"Руки","Топор"});
        GameCharacter three = new GameCharacter(120, "маг", new String[] {"Заклинание", "Невидимость"});
        //сохраняем
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //обнуляем их
        one = null;
        two = null;
        three = null;

        //загружаем сейв с персонажами
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("тип первого:" + oneRestore.getType() + oneRestore.getWeapons());
            System.out.println("тип второго:" + twoRestore.getType());
            System.out.println("тип третьего:" + threeRestore.getType());

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
