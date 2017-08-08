package Head_First_Java.Ch18_RIM_and_Servlet;

import java.rmi.*;
import java.rmi.server.*;

/**
 * Created by Ross on 08.08.2017.
 */
// Прстой способ показать как работает удаленный сервис
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public String sayHello() {
        return "Server says, 'Hey'";
    }

    public MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) {

        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("Remote Hello", service);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}