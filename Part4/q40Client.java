package Part4;

import java.net.*;
import java.util.Scanner;
public class q40Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket s = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        byte[] b = sc.nextLine().getBytes();
        DatagramPacket p = new DatagramPacket(b, b.length, InetAddress.getByName("localhost"), 5000);
        s.send(p);
        DatagramPacket r = new DatagramPacket(new byte[1024],1024);
        s.receive(r);
        System.out.println(new String(r.getData(),0,r.getLength()));
        s.close();
    }
}
