package Part4;

import java.net.*;
public class q40Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket s = new DatagramSocket(5000);
        byte[] b = new byte[1024];
        DatagramPacket p = new DatagramPacket(b, b.length);
        s.receive(p);
        String msg = new String(p.getData(),0,p.getLength());
        System.out.println("Client: "+msg);
        s.send(new DatagramPacket(("Received: "+msg).getBytes(), msg.length(), p.getAddress(), p.getPort()));
        s.close();
    }
}
