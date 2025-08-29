package Part4;

import java.io.*;
import java.net.*;
public class q39Client{
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        String msg;
        while((msg=br.readLine())!=null){
            System.out.println("Client: "+msg);
            out.println("Server received: "+msg);
            if(msg.equalsIgnoreCase("bye")) break;
        }
        s.close(); ss.close();
    }
}
