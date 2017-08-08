package Head_First_Java.Ch18_RIM_and_Servlet;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Ross on 08.08.2017.
 */
public interface MyRemote extends Remote {

    public String sayHello() throws RemoteException;
}