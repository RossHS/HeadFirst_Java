package Ch14_Serialization_And_IO;
import java.io.*;
/**
 * Created by User on 03.08.2017.
 */
public class DungeonGame implements Serializable {
    public int x = 3;
    transient long y = 4;
    private short z = 5;

    int getX() {
        return x;
    }

    long getY() {
        return y;
    }

    short getZ() {
        return z;
    }

}

class DungeonTest {
    public static void main(String[] args) {
        DungeonGame d = new DungeonGame();
        System.out.println(d.getX() + d.getY() + d.getZ());
        try {
            FileOutputStream fos = new FileOutputStream("dg.ser");
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(d);
            oss.close();

            FileInputStream fis = new FileInputStream("dg.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (DungeonGame) ois.readObject();
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(d.getX() + d.getY() + d.getZ());
    }
}
