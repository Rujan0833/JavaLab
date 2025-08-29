package Part4;

import java.net.*;
import java.io.*;

public class q38 {
    public static void main(String[] args) throws Exception {
        // a) URL creation and parsing
        URL u1 = new URL("https://example.com/index.html");
        System.out.println("Protocol: "+u1.getProtocol()+" Host: "+u1.getHost());

        // b) Reading directly from URL
        BufferedReader br = new BufferedReader(new InputStreamReader(u1.openStream()));
        System.out.println("Direct read: "+br.readLine()); br.close();

        // c) Reading from URLConnection
        URLConnection uc = u1.openConnection();
        BufferedReader br2 = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        System.out.println("URLConnection read: "+br2.readLine()); br2.close();

        // d) InetAddress
        InetAddress ia = InetAddress.getByName("example.com");
        System.out.println("Host: "+ia.getHostName()+" IP: "+ia.getHostAddress());
    }
}
