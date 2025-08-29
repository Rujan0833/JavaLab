package RMI;

import java.rmi.*;
public class RMIClient {
    public static void main(String[] args) throws Exception {
        Hello h = (Hello) Naming.lookup("rmi://localhost/Hello");
        System.out.println(h.sayHello());
    }
}

