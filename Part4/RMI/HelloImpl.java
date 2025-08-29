package RMI;

import java.rmi.*;
import java.rmi.server.*;
public class HelloImpl extends UnicastRemoteObject implements Hello {
    public HelloImpl() throws RemoteException {}
    public String sayHello() { return "Hello from RMI Server!"; }
}
