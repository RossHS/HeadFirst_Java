package helloword.Ch15_NetWork_and_Threads;
import java.io.*;
import java.net.*;

/**
 * Created by User on 04.08.2017.
 */
public class DailyAdviceClient {

    public void go(){
        try{
            Socket s = new Socket("127.0.0.1", 4242);

            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            System.out.println("Ты должен: " + advice);

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient d = new DailyAdviceClient();
        d.go();
    }
}
