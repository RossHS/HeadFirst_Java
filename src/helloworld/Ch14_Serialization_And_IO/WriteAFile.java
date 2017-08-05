package helloworld.Ch14_Serialization_And_IO;
import java.io.*;
/**
 * Created by User on 03.08.2017.
 */
public class WriteAFile {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("халоооооооооооооо");
            writer.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
