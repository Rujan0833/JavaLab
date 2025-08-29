package Part4;
 
import java.io.*;
import java.net.*;
public class q39Server{ 
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        String msg;
        while(!(msg=inp.readLine()).equalsIgnoreCase("bye")){
            out.println(msg);
            System.out.println(br.readLine());
        }
        out.println("bye"); s.close();
    }
}
