package RMI;

import java.rmi.*;
import java.rmi.registry.*;
public class RMIServer {
    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);
        Naming.rebind("Hello", new HelloImpl());
        System.out.println("RMI Server Ready");
    }
}
